package com.example.Hibernate_mysql.Model;

import javax.persistence.*;

//it represents the table in the database
@Table(name="userdetails")
@Entity
public class User {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //id is generated by the database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public User(){

    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    private String role;

}
