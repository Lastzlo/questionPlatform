package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.QuestionDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Operation(summary = "add question")
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
