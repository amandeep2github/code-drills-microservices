package com.techsamples.rest.microservices.controller.entity;

import javax.validation.constraints.Size;
import java.util.Date;

public class User {
    private Integer id;
    @Size(min = 3, message = "First Name has to be of three characters")
    private String firstName;
    private String lastName;
    private int age;
    private Date dob;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
