package com.example.questionPlatform.controllers;

import com.example.questionPlatform.models.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {

    @Operation(summary = "Returns all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "All users successfully found",
            content = {@Content(
                    mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = UserDTO.class)))}),
            @ApiResponse(
                    responseCode = "404",
                    description = "Users not found",
                    content = @Content)
    })
    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<UserDTO> getAllUsers() {
        return List.of();
    }


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



    @Operation(summary = "Returns all forms of user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "All forms successfully found",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404",
            description = "Forms not found",
            content = @Content)
    })
    @GetMapping("/{id}/forms")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public ResponseEntity<?> getFormsThisUser(@PathVariable("id") long id) {
        return null;
    }



    @Operation(summary = "Returns one form of user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "The form successfully found",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(
                    responseCode = "404",
                    description = "Form not found",
                    content = @Content)
    })
    @GetMapping("/{user_id}/forms/{form_id}")
    @ResponseStatus(HttpStatus.FOUND)
    @ResponseBody
    public ResponseEntity<?> getOneFormThisUser(@PathVariable("user_id") long user_id, @PathVariable("form_id") long form_id) {
        return null;
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
    public UserDTO getUserById(@PathVariable("id") long id) {
        return new UserDTO();
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
