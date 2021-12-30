package com.example.springcrud.model;
import org.springframework.lang.NonNull;

import javax.persistence.*;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;
    @Column(name = "first_name")
    @NonNull
    private String first_name;
    @Column(name = "last_name")
    @NonNull
    private String last_name;
    @Column(name = "email")
    @NonNull
    private String email;
    @Column(name = "phone_number")
    @NonNull
    private String phone_number;
    @Column(name = "address")
    @NonNull
    private String address;
    @Column(name = "password")
    @NonNull
    private String password;
    @Column(name = "user_type")
    private String user_type = "Client";

    public User() {
        super();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}
