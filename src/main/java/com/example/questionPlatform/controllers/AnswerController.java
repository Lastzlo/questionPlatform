package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.AnswerDTO;
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
@RequestMapping("answer")
public class AnswerController {


    @Operation(summary = "add answer")
    @ApiResponses(value = {
            //Or maybe better ""responseCode=201?
            @ApiResponse(responseCode = "200", description = "The answer added",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = AnswerDTO.class)) }),
            @ApiResponse(
                    responseCode = "400",
                    description = "Incorrect answer's value",
                    content = @Content)
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("updateQuestion")
    public void addAnswer(@Valid @RequestBody AnswerDTO answerDTO){
    //Some realization
}
    @Operation(summary = "update answer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The answer was updated",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = AnswerDTO.class)) }),
            @ApiResponse(
                    responseCode = "400",
                    description = "Incorrect answer's value",
                    content = @Content),
            @ApiResponse(
                    responseCode = "404",
                    description = "Answer not found",
                    content = @Content)
    })
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("updateQuestion")
    public void updateAnswer(@Valid @RequestBody AnswerDTO answerDTO){
        //Some realization
    }
    @Operation(summary = "delete answer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The answer was delete",
                    content = @Content),
            @ApiResponse(
                    responseCode = "404",
                    description = "Answer not found",
                    content = @Content)
    })
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("deleteQuestion")
    public void deleteAnswer(long id){
        //Some realization
    }


}
