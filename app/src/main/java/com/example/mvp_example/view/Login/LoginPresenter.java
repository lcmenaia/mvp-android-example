package com.example.mvp_example.view.Login;

import android.widget.Toast;

import com.example.mvp_example.custom.Presenter;
import com.example.mvp_example.model.Login;

/**
 * Visibility may be default because its on the same package
 */
class LoginPresenter extends Presenter<LoginActivity> {

    LoginPresenter(LoginActivity view) {
        super(view);
    }

    /**
     * Handle validations and requests here
     * @param email Email
     * @param password Password
     */
    void login(String email, String password) {
        Login login = new Login(email,password);

        if(!login.validate()){
            //return error message or throw exception
        }

        if(!login.save()){
            //return error message or throw exception
        }

        Toast.makeText(getView(), "Login", Toast.LENGTH_SHORT).show();
    }

    /**
     * Navigate to RegisterActivity, should call a method from the view.
     *
     */
    void register() {
        Toast.makeText(getView(), "Register", Toast.LENGTH_SHORT).show();
    }

}