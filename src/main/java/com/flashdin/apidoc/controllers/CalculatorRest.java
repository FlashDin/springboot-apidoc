package com.flashdin.apidoc.controllers;

import com.flashdin.apidoc.services.CalculatorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
@Api(value = "calculator", description = "Operations of calculator")
public class CalculatorRest {

    @Autowired
    private CalculatorService calculatorService;

    @ApiOperation(value = "Add of calculator", response = Long.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping(path = "/add")
    public ResponseEntity add(Long a, Long b) {
        return new ResponseEntity(calculatorService.add(a, b), HttpStatus.OK);
    }

    @GetMapping(path = "/subtract")
    public ResponseEntity subtract(Long a, Long b) {
        return new ResponseEntity(calculatorService.subtract(a, b), HttpStatus.OK);
    }

    @GetMapping(path = "/multiply")
    public ResponseEntity multiply(Long a, Long b) {
        return new ResponseEntity(calculatorService.multiply(a, b), HttpStatus.OK);
    }

    @GetMapping(path = "/divide")
    public ResponseEntity divide(Long a, Long b) {
        return new ResponseEntity(calculatorService.divide(a, b), HttpStatus.OK);
    }

    @PostMapping(path = "/mod")
    public ResponseEntity mod(Long a, Long b) {
        return new ResponseEntity(calculatorService.mod(a, b), HttpStatus.OK);
    }

}
