package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.AnswerDTO;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("answers")
public class AnswerController {

    @Hidden
    @Operation(summary = "Returns all answers by question id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "All answers successfully found",
                    content = {@Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = AnswerDTO.class)))}),
            @ApiResponse(
                    responseCode = "404",
                    description = "Answers not found",
                    content = @Content)
    })
    @GetMapping("questions/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<AnswerDTO> getAllUsers(@PathVariable long id) {
        return List.of();
    }

    @Hidden
    @Operation(summary = "Add answer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "New answer created successfully",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = AnswerDTO.class)) }),
            @ApiResponse(
                    responseCode = "400",
                    description = "Incorrect answer's value",
                    content = @Content)
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void addAnswer(@Valid @RequestBody AnswerDTO answerDTO){
        //Some realization
    }

    @Hidden
    @Operation(summary = "Update answer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Answer successfully updated",
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
    @PutMapping("{id}")
    public void updateAnswer(@PathVariable long id, @Valid @RequestBody AnswerDTO answerDTO){
        //Some realization
    }

    @Hidden
    @Operation(summary = "Delete answer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Answer successfully deleted",
                    content = @Content),
            @ApiResponse(
                    responseCode = "404",
                    description = "Answer not found",
                    content = @Content)
    })
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("{id}")
    public void deleteAnswer(@PathVariable long id){
        //Some realization
    }


}