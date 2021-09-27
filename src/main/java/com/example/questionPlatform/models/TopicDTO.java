package com.example.questionPlatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicDTO {

    @NotBlank
    private String name;
}
