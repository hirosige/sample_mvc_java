package com.sample_mvc.models.entities;
import com.sample_mvc.models.entities.Entity;

public class UserEntity extends Entity {
    private String name;
    private int age;

    public UserEntity() {
        name = "";
        age = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}