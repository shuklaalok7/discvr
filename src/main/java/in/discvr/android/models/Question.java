package in.discvr.android.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Signifies a question
 * @author shuklaalok7
 * @since 7/4/15 05:17
 */
@Getter
@Setter
public class Question extends PersistentObject {

    private List<Answer> answers;

}
