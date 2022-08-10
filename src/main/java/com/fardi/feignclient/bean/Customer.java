package com.fardi.feignclient.bean;

import org.springframework.stereotype.Indexed;

public class Customer {

    public String id;

    public String firstName;
    public String lastName;


    public String email;
    public String password;


    public String phone;


    public Gender gender;


    private Role role;


    public Customer(String firstName, String lastName, String email, String password, String phone, Gender gender, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.role = role;
    }
}
