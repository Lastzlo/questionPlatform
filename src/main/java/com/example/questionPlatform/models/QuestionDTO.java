package com.example.questionPlatform.models;

import javax.validation.constraints.NotBlank;

public class QuestionDTO {

    private long id;

    @NotBlank
    private String description;

    private TopicDTO topic;

    private long FormId;


    public long getFormId() {
        return FormId;
    }

    public void setFormId(long formId) {
        FormId = formId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TopicDTO getTopic() {
        return topic;
    }

    public void setTopic(TopicDTO topic) {
        this.topic = topic;
    }
}
