package com.sample_mvc.views;
import com.sample_mvc.views.AppView;
import com.sample_mvc.models.UserModel;

public class UserView extends AppView {
    private UserModel model;

    public UserView(UserModel model) {
        this.model = model;
    }

    public String getDecoName() {
        return "ユーザ： " + model.getName();
    }

    public String getDecoAge() {
        return "年齢： " + model.getAge();
    }
}