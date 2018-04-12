package com.sample_mvc.controllers;
import com.sample_mvc.models.UserModel;
import java.util.List;

public class UserController extends AppController {
    public List<UserModel> index() {
        List<UserModel> users = UserModel.all();
        return users;
    }

    public UserModel show(int id) {
        UserModel userModel = UserModel.find(id);

        return userModel;
    }

    public void create() {
        // 実際はユーザが入力した値を反映したインスタンスになる
        UserModel userModel = UserModel.find(1);

        if (userModel.validate()) {
            // DBへ登録
            String result = userModel.save();
            System.out.println(result);
        }
    }

    public void edit() {
    }

    public void delete() {
    }
}