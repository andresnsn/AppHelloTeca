package com.example.helloteca;

import java.io.Serializable;

public class UserModel implements Serializable {

    private String name;
    private String email;
    private String password;
    private int id;

    public UserModel(String name, String email, String password, int id){
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getNome(){
        return name;
    }
    public void setNome(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public long getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


}
