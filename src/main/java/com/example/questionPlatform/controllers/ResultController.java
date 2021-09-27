package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.FormDTO;
import com.example.questionPlatform.models.ResultDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("results")
public class ResultController {

    @Operation(summary = "Create new result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "The result was successfully added",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ResultDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Result is not valid",
                    content = @Content)
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createResult(@Valid @RequestBody ResultDTO resultDTO) {
        //adding result
    }


    @Operation(summary = "Delete chosen result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The result was successfully deleted",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "Result not found",
                    content = @Content)
    })
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteResult(@PathVariable long id) {
        //deleting result
    }
}
