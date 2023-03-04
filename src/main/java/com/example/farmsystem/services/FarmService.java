package com.example.farmsystem.services;

import com.example.farmsystem.domain.models.Farm;
import com.example.farmsystem.repositories.farm.FarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class FarmService {

    private final FarmRepository farmRepository;

    public Farm getFarm(String id) {
        var farm = farmRepository.findById(id);
        return farm.orElseThrow(() -> new IllegalStateException("farm not found"));
    }
}
