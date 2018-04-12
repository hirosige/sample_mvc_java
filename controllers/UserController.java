package com.sample_mvc.controllers;
import com.sample_mvc.models.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AppController {
    public List<UserModel> index() {
        // TODO 全てのユーザデータを返す
        List<UserModel> list = new ArrayList<>();

        list.add(UserModel.find(1));
        list.add(UserModel.find(2));
        list.add(UserModel.find(3));

        return list;
    }

    public UserModel show(int id) {
        UserModel userModel = UserModel.find(id);

        return userModel;
    }

    public void create() {
    }

    public void edit() {
    }

    public void delete() {
    }
}