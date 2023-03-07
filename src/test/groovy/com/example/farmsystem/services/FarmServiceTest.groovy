package com.example.farmsystem.services


import com.example.farmsystem.domain.requests.CreateFarmRequest
import com.example.farmsystem.repositories.farm.FarmRepository
import com.example.farmsystem.repositories.farm.InMemoryFarmRepository
import spock.lang.Specification

class FarmServiceTest extends Specification {
    FarmService farmService
    FarmRepository farmRepository

    void setup() {
        farmRepository = new InMemoryFarmRepository()
        farmService = new FarmService(farmRepository)
    }

    def "should create and find farm"() {
        given:"farm"
        def farm = new CreateFarmRequest("test farm", "city", "street", "123/a")

        when: "farm is created"
        def savedFarm = farmService.createFarm(farm)

        then: "farm is saved and can be queried"
        def foundFarm = farmService.findById(savedFarm.getId())

        assert foundFarm.getName() == farm.name()
        assert foundFarm.getCity() == farm.city()
        assert foundFarm.getStreet() == farm.street()
        assert foundFarm.getBuildingNumber() == farm.buildingNumber()
    }
}
