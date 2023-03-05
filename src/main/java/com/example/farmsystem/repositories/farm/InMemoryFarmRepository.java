package com.example.farmsystem.repositories.farm;

import com.example.farmsystem.domain.models.Farm;
import com.example.farmsystem.services.FarmService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class InMemoryFarmRepository implements FarmRepository {

    private final List<Farm> farmList = new ArrayList<>();

    @Override
    public Optional<Farm> findById(String id) {
        return farmList.stream().filter(f -> f.getId().equals(id)).findFirst();
    }

    @Override
    public Farm save(Farm farm) {
        farmList.add(farm);
        return farm;
    }
}
