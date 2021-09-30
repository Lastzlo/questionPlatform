package com.example.questionPlatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {

    private long id;
    private FormDTO form;
    private UserDTO respondent;
    private List<QuestionAnswerDTO> questionAnswerList;
}
