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