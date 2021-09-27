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
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("forms")
public class FormController {

    @Operation(summary = "Create new form")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "The form was successfully added",
                    content = {@Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = FormDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Form is not valid",
                    content = @Content)
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createForm(@Valid @RequestBody FormDTO formDTO) {
        //adding form
    }


    @Operation(summary = "Returns all forms")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All forms were returned",
                    content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
            })
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<FormDTO> getAllForms() {
        return new ArrayList<>();
    }


    @Operation(summary = "Returns form by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The form was returned",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResultDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    @GetMapping("{id}")
    public FormDTO getFormById(@PathVariable String id) {
        return new FormDTO();
    }

    @Operation(summary = "Update chosen form")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "The form was successfully updated",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = FormDTO.class))),
            @ApiResponse(
                    responseCode = "404",
                    description = "Form not found",
                    content = @Content),
            @ApiResponse(
                    responseCode = "400",
                    description = "Form is not valid",
                    content = @Content)
    })
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateForm(@Valid @RequestBody FormDTO formDTO, @PathVariable long id) {
        //updating form
    }

    @Operation(summary = "Delete chosen form")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The form was successfully deleted",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "Form not found",
                    content = @Content)
    })
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteForm(@PathVariable long id) {
        //deleting form
    }


    @Operation(summary = "Returns the results of passing the form")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All results were returned",
                    content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    @GetMapping("{id}/results")
    @ResponseStatus(HttpStatus.OK)
    public List<ResultDTO> getFormResults(@PathVariable String id) {
        return new ArrayList<>();
    }


    @Operation(summary = "Returns the results of passing the form by the given user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Results were returned",
                    content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    @GetMapping("{id}/results/users/{user_id}")
    @ResponseStatus(HttpStatus.OK)
    public List<ResultDTO> getFormResults(@PathVariable String id, @PathVariable String user_id) {
        return new ArrayList<>();
    }


}
