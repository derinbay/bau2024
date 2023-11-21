package com.bau.qa;

public class UserPool {

    public static User getValidUser() {
        return new User("automatedbuyer-3cd5ab6d-4089-48d1-89a1-dddd722cc732@trendyol.com", "1234567a");
    }

    public static User getFalsePasswordUser() {
        return new User("automatedbuyer-3cd5ab6d-4089-48d1-89a1-dddd722cc732@trendyol.com", "dsanldjhas");
    }

    public static User getEmptyPasswordUser() {
        return new User("automatedbuyer-3cd5ab6d-4089-48d1-89a1-dddd722cc732@trendyol.com", "");
    }
}
