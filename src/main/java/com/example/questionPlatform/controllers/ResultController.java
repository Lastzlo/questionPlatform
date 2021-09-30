package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.ResultDTO;
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
@RequestMapping("results")
public class ResultController {


    @Operation(summary = "Get all user's result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "All results of user got",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = ResultDTO.class)))),
            @ApiResponse(responseCode = "401",
                    description = "Unauthorized user",
                    content = @Content)
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ResultDTO> getAllUserResult(){
        //Some realization
        return new ArrayList<ResultDTO>();
    }


    @Operation(summary = "Get one user's result by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "The result of user got",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResultDTO.class))),
            @ApiResponse(responseCode = "404",
            description = "The result of user not found",
            content = @Content),
            @ApiResponse(responseCode = "401",
                    description = "Unauthorized user",
                    content = @Content)
    })
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultDTO getUserResultById(@PathVariable String id){
        return new ResultDTO();
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
    
    
    @Operation(summary = "Full update result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The result was successfully updated",
                    content = @Content),
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
    
    
    @Operation(summary = "Update part of result")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "The result was successfully updated",
                    content = @Content),
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
    
    
    @Operation(summary = "Delete result")
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
