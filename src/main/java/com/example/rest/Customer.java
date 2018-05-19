package com.example.rest;

public class Customer {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String city;
    private final String state;
    private final String birthday;
    
    public Customer() {
        id = 0;
        firstName = "";
        lastName = "";
        email = "";
        city = "";
        state = "";
        birthday = "";
    }
    
    public Customer(long id, String firstName, String lastName, String email, String city, String state, String birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.state = state;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getBirthday() {
        return birthday;
    }
    
    @Override
    public String toString() {
        return "ID: " + id
            + " First: " + firstName
            + " Last: " + lastName
            + " Email: " + email
            + " City: " + city
            + " State: " + state
            + " Birthday: " + birthday;
    }
}
