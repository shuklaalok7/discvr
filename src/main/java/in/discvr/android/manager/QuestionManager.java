package in.discvr.android.manager;

import in.discvr.android.dto.QuestionRequestDTO;
import in.discvr.android.models.Question;

import java.util.List;

/**
 * This is a logic layer class and controls the logic about the {@see in.discvr.android.models.Question} objects
 * @author shuklaalok7
 * @since 7/4/15 15:02
 */
public class QuestionManager extends ManagerSupport {

    /**
     *
     * @param questionRequestDTO    To filter the questions
     * @return List of questions to display on-screen
     */
    public List<Question> search(QuestionRequestDTO questionRequestDTO) {
        return this.apiClient.search(Question.class, questionRequestDTO);
    }

}
