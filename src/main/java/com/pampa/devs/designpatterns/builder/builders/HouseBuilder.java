package com.pampa.devs.designpatterns.builder.builders;

import com.pampa.devs.designpatterns.builder.book.House;

public class HouseBuilder implements Builder {

  private int windows;
  private int doors;
  private int rooms;
  private boolean hasGarage;
  private boolean hasSwimPool;
  private boolean hasGarden;
  private boolean hasFirePlace;
  private boolean hasGrillPlace;
  private boolean hasOpenConcept;
  private boolean hasPlayKids;

  @Override
  public void withWindows(int windows) {
    this.windows = windows;
  }

  @Override
  public void withDoors(int doors) {
    this.doors = doors;
  }

  @Override
  public void withRooms(int rooms) {
    this.rooms = rooms;
  }

  @Override
  public void withGarage(boolean garage) {
    this.hasGarage = garage;
  }

  @Override
  public void withSwimPool(boolean swimPool) {
    this.hasSwimPool = swimPool;
  }

  @Override
  public void withGarden(boolean garden) {
    this.hasGarden = garden;
  }

  @Override
  public void withFirePlace(boolean firePlace) {
    this.hasFirePlace = firePlace;
  }

  @Override
  public void withGrillPlace(boolean grillPlace) {
    this.hasGrillPlace = grillPlace;
  }

  @Override
  public void withOpenConcept(boolean openConcept) {
    this.hasOpenConcept = openConcept;
  }

  @Override
  public void withPlayKids(boolean playKids) {
    this.hasPlayKids = playKids;
  }

  public House build() {
    return new House(windows, doors, rooms, hasGarage, hasSwimPool,
    hasGarden, hasFirePlace, hasGrillPlace,
    hasOpenConcept, hasPlayKids);
  }
}