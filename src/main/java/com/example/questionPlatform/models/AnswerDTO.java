package com.example.questionPlatform.models;

public class AnswerDTO {
    private long AnswerId;
    private String answer;

    public long getAnswerId() {
        return AnswerId;
    }

    public void setAnswerId(long answerId) {
        AnswerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
