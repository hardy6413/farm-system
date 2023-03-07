package com.example.farmsystem.controllers;

import com.example.farmsystem.domain.requests.CreateFarmRequest;
import com.example.farmsystem.services.FarmService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/farm")
public class FarmController {

    private final FarmService farmService;

    @GetMapping
    public ResponseEntity<?> getFarm(){
        //farmService.findById("12");
        return ResponseEntity.ok("implement getting farm for logged in user");
    }

    @PostMapping()
    public ResponseEntity<?> createFarm(CreateFarmRequest createFarm) {
        var farm = farmService.createFarm(createFarm);
        return ResponseEntity.ok(farm);
    }
}
