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
public class UserDTO {

    @Null
    private Long id;
    private String name;
    private String password;
    private List<ResultDTO> results;
}
