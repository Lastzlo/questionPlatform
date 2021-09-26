package com.example.questionPlatform.models;

import javax.validation.constraints.NotBlank;

public class TopicDTO {

    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
