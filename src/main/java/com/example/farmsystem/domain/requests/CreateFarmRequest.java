package com.example.farmsystem.domain.requests;

import com.example.farmsystem.domain.models.Farm;

public record CreateFarmRequest (String name, String city, String street, String buildingNumber) {

    public static Farm toFarm(CreateFarmRequest request) {
        return new Farm(request.name(), request.city(), request.street(), request.buildingNumber());
    }
}
