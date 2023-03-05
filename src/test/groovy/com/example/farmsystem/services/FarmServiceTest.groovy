package com.example.farmsystem.services

import com.example.farmsystem.domain.models.Farm
import com.example.farmsystem.repositories.farm.InMemoryFarmRepository
import org.junit.jupiter.api.BeforeEach
import spock.lang.Specification

class FarmServiceTest extends Specification {
    FarmService farmService;

    @BeforeEach
    void setup() {
        farmService = new FarmService(new InMemoryFarmRepository())
    }

    def "should save and find farm in database"() {
        given:"farm"
        def farm = new Farm("test farm", "city", "street", "123/a")

        when: "farm is saved"
        farmService.save(farm)

        then: "created farm is saved and can be found"
        def foundFarm = farmService.findById(farm.getId())

        assert foundFarm == farm
    }
}
