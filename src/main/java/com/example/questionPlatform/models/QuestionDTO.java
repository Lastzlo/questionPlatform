package com.example.questionPlatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {

    private long id;

    @NotBlank
    private String description;
    private TopicDTO topic;
    private long FormId;
    List<AnswerDTO> possibleAnswers;
}
