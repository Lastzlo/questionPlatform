package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.UserDTO;
import com.example.questionPlatform.models.UserGetOneDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UsersController {

    @Operation(summary = "Create new user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "New user created successfully",
            content = {@Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = UserDTO.class))}),
        @ApiResponse(
                responseCode = "400",
                description = "User is not valid",
                content = @Content)
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@Valid @RequestBody UserDTO user) {
    }


    @Operation(summary = "Returns one user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "The user successfully found",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(
                    responseCode = "404",
                    description = "User not found",
                    content = @Content)
    })
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public UserGetOneDTO getUserById(@PathVariable("id") long id) {
        return new UserGetOneDTO();
    }


    @Operation(summary = "Updates user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User successfully updated",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid id supplied",
                    content = @Content)
    })
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void updateUserById(@PathVariable("id") long id) {}


    @Operation(summary = "Deletes user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User successfully deleted",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid id supplied",
                    content = @Content)
    })
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void deleteUserById(@PathVariable("id") long id) {}
}
