package com.example.farmsystem.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.UUID;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Farm {
    @Id
    String id;
    String name;
    String city;
    String street;
    String buildingNumber;

    public Farm(String name, String city, String street, String buildingNumber) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Farm farm = (Farm) o;
        return id != null && Objects.equals(id, farm.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
