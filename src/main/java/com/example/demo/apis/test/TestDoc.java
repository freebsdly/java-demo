package com.example.demo.apis.test;

import com.example.demo.repositories.TestModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "test api", description = "test api supply some test interface to test openapi and other components")
public interface TestDoc {

    @Operation(
            summary = "query test list",
            description = "query test list with given options"
    )
    @ApiResponse(
            responseCode = "200",
            description = "successful",
            content = @Content
    )
    List<TestModel> QueryTestList();
}
