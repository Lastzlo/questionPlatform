package com.example.questionPlatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {

    private long resutId;
    private long respondentId;
    private long fondId;
    private AnswerDTO[] answers;
}
