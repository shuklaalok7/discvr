package in.discvr.android.models;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.List;

/**
 * Signifies a question
 * @author shuklaalok7
 * @since 7/4/15 05:17
 */
@Getter
@Setter
public class Question extends PersistentObject {

    /**
     * One of the following two to show the image on the Question tile
     */
    private String imageFilePath;
    private File image;

    private String displayText;
    private List<Answer> answers;
    private boolean shortTermRequirement;

}
