package com.pampa.devs.designpatterns.builder.builders;

public class HouseDirector {
  public void withFirePlace(Builder builder) {
    builder.withFirePlace(true);
  }

  public void withSwimPool(Builder builder) {
    builder.withSwimPool(true);
  }

  public void withGarage(Builder builder) {
    builder.withGarage(true);
  }

  public void withGarden(Builder builder) {
    builder.withGarden(true);
  }

  public void withPlayKids(Builder builder) {
    builder.withPlayKids(true);
  }

  public void withOpenConcept(Builder builder) {
    builder.withOpenConcept(true);
  }

  public void with3Rooms(Builder builder) {
    builder.withRooms(3);
  }

  public void with2Rooms(Builder builder) {
    builder.withRooms(2);
  }

  public void with1Rooms(Builder builder) {
    builder.withRooms(1);
  }
}
