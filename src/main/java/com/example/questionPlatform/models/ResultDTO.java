package com.example.questionPlatform.models;

public class ResultDTO {
    long id;
    long questionId;
    long answerId;
    long userId;

    public ResultDTO() {
    }

    public ResultDTO(long questionId, long answerId, long userId) {
        this.questionId = questionId;
        this.answerId = answerId;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
