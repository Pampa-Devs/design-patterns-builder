package com.pampa.devs.designpatterns;

import com.pampa.devs.designpatterns.builders.HouseBuilder;
import com.pampa.devs.designpatterns.builders.HouseDirector;
import com.pampa.devs.designpatterns.house.House;

public class DesignPatternsApplication {

  public static void main(String[] args) {
    House house = new House(false, false, false, true, false, false, false, 0, 0, 0);
    System.out.println(house.toString());

	  HouseDirector houseDirector = new HouseDirector();
	  HouseBuilder houseBuilder = new HouseBuilder();
	  houseDirector.withFirePlace(houseBuilder);

	  House houseCreated = houseBuilder.build();
	  System.out.println(houseCreated.toString());
  }
}
