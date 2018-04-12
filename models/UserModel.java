package com.sample_mvc.models;
import com.sample_mvc.models.Model;
import com.sample_mvc.models.entities.UserEntity;
import com.sample_mvc.models.validators.UserValidator;
import java.util.ArrayList;
import java.util.List;

public class UserModel extends Model {
    private UserEntity user;
    private UserValidator validator;

    public UserModel() {
    }

    public UserModel(UserEntity entity) {
        user = entity;
        validator = new UserValidator();
    }

    public String getName() {
        return user.getName();
    }

    public int getAge() {
        return user.getAge();
    }

    public static List<UserModel> all() {
        // TODO 全てのユーザデータを返す
        List<UserModel> list = new ArrayList<>();

        list.add(UserModel.find(1));
        list.add(UserModel.find(2));
        list.add(UserModel.find(3));

        return list;
    }

    public static UserModel find(int id) {
        // TODO DBからidで一件取ってくるが一時的に手動でデータを入れる Start
        UserEntity entity = new UserEntity();
        entity.setName("test");
        entity.setAge(12);
        // End

        return new UserModel(entity);
    }

    public Boolean validate() {
        return this.validator.validate();
    }

    public String save() {
        return "saved!";
    }
}