package com.example.farmsystem.repositories.farm;

import com.example.farmsystem.domain.models.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmJdbcRepository extends JpaRepository<Farm, String>, FarmRepository {

}