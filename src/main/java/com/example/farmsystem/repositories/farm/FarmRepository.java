package com.example.farmsystem.repositories.farm;

import com.example.farmsystem.domain.models.Farm;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FarmRepository {

    public Optional<Farm> findById(String uuid);


}
