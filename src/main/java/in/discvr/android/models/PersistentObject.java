package in.discvr.android.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * The objects, which need to get saved in SQLite, will extend this class
 * @author shuklaalok7
 * @since 7/4/15 04:52
 */
@Getter
@Setter
public abstract class PersistentObject implements Serializable, Comparable<PersistentObject> {

    private long id;
    private ZonedDateTime createdOn;
    private ZonedDateTime lastModifiedOn;

    protected PersistentObject() {
        this.createdOn = ZonedDateTime.now();
        this.lastModifiedOn = ZonedDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        return this == o
                || !(o == null || getClass() != o.getClass())
                && id == ((PersistentObject) o).id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public int compareTo(PersistentObject o) {
        return 0;
    }
}
