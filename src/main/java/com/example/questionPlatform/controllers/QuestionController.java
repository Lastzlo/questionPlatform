package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.QuestionDTO;
import com.example.questionPlatform.models.TopicDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Operation(summary = "Get all questions")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = QuestionDTO.class)))
                    })
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<QuestionDTO> getAllQuestions() {
        List<QuestionDTO> list = new ArrayList<>();

        TopicDTO topicDTO = new TopicDTO();
        topicDTO.setName("Math");

        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(3);
        questionDTO.setDescription("question 3");
        questionDTO.setFormId(12);
        questionDTO.setTopic(topicDTO);

        list.add(questionDTO);
        return list;
    }

    @Operation(summary = "Get question")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = QuestionDTO.class))),
            @ApiResponse(
                    responseCode = "404",
                    description = "Question not found",
                    content = @Content)
    })
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public QuestionDTO getQuestion(@PathVariable long id) {
        //find question
        TopicDTO topicDTO = new TopicDTO();
        topicDTO.setName("Math");

        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(id);
        questionDTO.setDescription("question 3");
        questionDTO.setFormId(12);
        questionDTO.setTopic(topicDTO);

        return questionDTO;
    }

    @Operation(summary = "Add question")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "The question was successfully added",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = QuestionDTO.class)) }),
            @ApiResponse(
                    responseCode = "400",
                    description = "Question is not valid",
                    content = @Content)
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addQuestion(@Valid @RequestBody QuestionDTO questionDTO) {
        //adding question
    }

    @Operation(summary = "update question")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "The question was successfully updated",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = QuestionDTO.class))),
            @ApiResponse(
                    responseCode = "404",
                    description = "Question not found",
                    content = @Content),
            @ApiResponse(
                    responseCode = "400",
                    description = "Question is not valid",
                    content = @Content)
    })
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateQuestion(@Valid @RequestBody QuestionDTO questionDTO, @PathVariable long id) {
        //updating question
    }

    @Operation(summary = "delete question")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The question was successfully deleted",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "Question not found",
                    content = @Content)
    })
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable long id)
    {
        //deleting question
    }


}
