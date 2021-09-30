package com.example.questionPlatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswerDTO {
    private long id;
    private ResultDTO result;
    private QuestionDTO question;
    private AnswerDTO answer;
}
