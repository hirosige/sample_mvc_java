package com.sample_mvc.models;
import com.sample_mvc.models.Model;
import com.sample_mvc.models.entities.UserEntity;

public class UserModel extends Model {
    private UserEntity user;

    public UserModel() {
    }

    public UserModel(UserEntity entity) {
        user = entity;
    }

    public String getName() {
        return user.getName();
    }

    public int getAge() {
        return user.getAge();
    }

    public static UserModel find(int id) {
        // TODO DBからidで一件取ってくるが一時的に手動でデータを入れる Start
        UserEntity entity = new UserEntity();
        entity.setName("test");
        entity.setAge(12);
        // End

        return new UserModel(entity);
    }
}