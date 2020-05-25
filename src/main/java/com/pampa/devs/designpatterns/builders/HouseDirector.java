package com.pampa.devs.designpatterns.builders;

public class HouseDirector {
    public void withFirePlace(Builder builder) {
        builder.withFirePlace(true);
    }

    public void withGarage(Builder builder) {
        builder.withGarage(true);
    }
}
