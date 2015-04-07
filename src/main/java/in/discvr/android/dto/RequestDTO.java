package in.discvr.android.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shuklaalok7
 * @since 7/4/15 15:17
 */
@Getter
@Setter
public abstract class RequestDTO<T> {
    /**
     * To filter by the <code>id</code>
     */
    private long id;

}
