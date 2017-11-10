package com.example.demo;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2)
    private String name;
//    @NotNull
//    @Size(min=2)
    @NotNull
    private long age;
    @NotNull
    @Size(min=2)
    private String type;
    @NotNull
    @Size(min=2)
    private String breed;
    @NotNull
    @Size(min=2)
    private String color;
    @NotNull
    @Size(min=2)
    private String feature;
    @NotNull
    @Size(min=2)
    private String ownersphoneNumber;
    @NotNull
    @Size(min=2)
    private String petStatus;

    public String getPetStatus() {
        return petStatus;
    }

    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getOwnersphoneNumber() {
        return ownersphoneNumber;
    }

    public void setOwnersphoneNumber(String ownersphoneNumber) {
        this.ownersphoneNumber = ownersphoneNumber;
    }
}
