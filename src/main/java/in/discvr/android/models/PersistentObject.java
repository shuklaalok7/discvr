package in.discvr.android.models;

import java.io.Serializable;

/**
 * The objects, which need to get saved in SQLite, will extend this class
 * @author shuklaalok7
 * @since 7/4/15 04:52
 */
public abstract class PersistentObject implements Serializable, Comparable<PersistentObject> {

    private long id;

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
