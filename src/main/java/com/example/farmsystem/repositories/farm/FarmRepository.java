package com.example.farmsystem.repositories.farm;

import com.example.farmsystem.domain.models.Farm;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FarmRepository {

    Optional<Farm> findById(String uuid);

    Farm save(Farm farm);


}
