package in.discvr.android.dto;

import in.discvr.android.models.Answer;
import in.discvr.android.models.Question;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author shuklaalok7
 * @since 7/4/15 15:18
 */
@Getter
@Setter
public class QuestionRequestDTO extends RequestDTO<Question> {

    // Filters to filter the results
    private String displayTextContains;
    private List<Answer> answersContain;
    private boolean shortTermRequirement;

}
