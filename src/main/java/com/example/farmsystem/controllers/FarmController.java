package com.example.farmsystem.controllers;

import com.example.farmsystem.services.FarmService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/farm")
public class FarmController {

    private final FarmService farmService;

    @GetMapping()
    public ResponseEntity<?> getFarm(){
        farmService.getFarm("12");
        return ResponseEntity.ok("implement getting farm for logged in user");
    }
}
