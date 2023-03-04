package com.example.farmsystem.config;

import com.example.farmsystem.repositories.farm.FarmJdbcRepository;
import com.example.farmsystem.repositories.farm.FarmRepository;
import com.example.farmsystem.repositories.farm.InMemoryFarmRepository;
import com.example.farmsystem.services.FarmService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {


    @Bean
    @ConditionalOnProperty(name = "spring.profiles.active", havingValue = "inmemory")
    public FarmService inMemoryFarmService(InMemoryFarmRepository farmRepository){
        return new FarmService(farmRepository);
    }

    @Bean
    @ConditionalOnProperty(name = "spring.profiles.active", havingValue = "dev")
    public FarmService farmService(FarmJdbcRepository farmRepository){
        return new FarmService(farmRepository);
    }

}
