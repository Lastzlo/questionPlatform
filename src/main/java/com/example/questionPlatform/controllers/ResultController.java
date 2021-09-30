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

//    @Operation(summary = "Create new result")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", description = "The result was successfully added",
//                    content = {@Content(
//                            mediaType = "application/json",
//                            schema = @Schema(implementation = ResultDTO.class))}),
//            @ApiResponse(
//                    responseCode = "400",
//                    description = "Result is not valid",
//                    content = @Content)
//    })
//    @PostMapping()
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createResult(@Valid @RequestBody ResultDTO resultDTO) {
//        //adding result
//    }
//
//
//    @Operation(summary = "Delete chosen result")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200",
//                    description = "The result was successfully deleted",
//                    content = @Content),
//            @ApiResponse(responseCode = "404",
//                    description = "Result not found",
//                    content = @Content)
//    })
//    @DeleteMapping("{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void deleteResult(@PathVariable long id) {
//        //deleting result
//    }
    @Operation(summary = "Get all user's result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "All results of user got ",
            content = @Content),
            @ApiResponse(responseCode = "401",
                    description = "Unauthorized user",
                    content = @Content)
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void getAllUserResult(){
        //Some realization
    }


    @Operation(summary = "Get one user's result by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "The result of user got",
            content = @Content),
            @ApiResponse(responseCode = "404",
            description = "The result of user not found",
            content = @Content),
            @ApiResponse(responseCode = "401",
                    description = "Unauthorized user",
                    content = @Content)
    })
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void getUserResultById(@PathVariable String id){
        //some realization
    }
    @Operation(summary = "Create new result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
            description = "New result was successfully created",
            content = @Content)
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void createResult(@Valid ResultDTO resultDTO){
        //Some realization
    }
    @Operation(summary = "fully update result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The result was successfully updated",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResultDTO.class))),
            @ApiResponse(responseCode = "404",
                    description = "The result not found",
                    content = @Content)
    }
    )
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateResult(@PathVariable String id, @Valid ResultDTO resultDTO){
    //Some realization
    }
    @Operation(summary = "update part of result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The result was successfully updated",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResultDTO.class))),
            @ApiResponse(responseCode = "404",
                    description = "The result not found",
                    content = @Content)
    }
    )
    @PatchMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePartOfResult(@PathVariable String id, @Valid ResultDTO resultDTO){
        //Some realization
    }
    @Operation(summary = "delete result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The result was successfully deleted",
                    content = @Content),
            @ApiResponse(responseCode = "404",
                    description = "The result not found",
                    content = @Content)
    })
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteResult(@PathVariable String id){
        //some realization
    }



}
