package com.example.questionPlatform.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormDTO {

    private long id;
    private String tittle;
    private UserDTO owner;
    private List<QuestionDTO> questions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
