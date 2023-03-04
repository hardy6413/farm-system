package com.example.farmsystem.repositories.farm;

import com.example.farmsystem.domain.models.Farm;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;


public class InMemoryFarmRepository implements FarmRepository {

    private final HashMap<String, Farm> farmHashMap = new HashMap<>();

    @Override
    public Optional<Farm> findById(String id) {
        return Optional.ofNullable(farmHashMap.get(id));
    }
}
