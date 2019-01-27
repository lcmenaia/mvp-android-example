package com.example.mvp_example.models;

public class Login {

    private String email;
    private String password;

    public Login(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Validate the params.
     * @return boolean
     */
    public boolean validate(){
        return true;
    }

    /**
     * Save the params on SQLLite or Realm
     * @return boolean
     */
    public boolean save(){
        return true;
    }
}
