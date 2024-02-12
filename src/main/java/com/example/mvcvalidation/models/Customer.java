package com.example.mvcvalidation.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    @NotNull(message = "Required")
    @Size(min = 2,max = 50, message = "Please enter a valid Name")
    private String firstName;

    @NotNull(message = "Required")
    @Size(min = 2,max = 50, message = "Please enter a valid Name")
    private String lastName;

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
}
