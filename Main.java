package com.sample_mvc;
import com.sample_mvc.controllers.AppController;
import com.sample_mvc.controllers.UserController;
import com.sample_mvc.models.*;
import com.sample_mvc.views.*;

class Main{
  public static void main(String[] args){
    UserController ctrl = new UserController();

    // ユーザの操作がユーザー一人の詳細画面を見たいケース
    UserModel user = ctrl.show(1);

    // ViewにModelを渡す
    UserView view = new UserView(user);
    System.out.println(view.getDecoName());
    System.out.println(view.getDecoAge());
  }
}
