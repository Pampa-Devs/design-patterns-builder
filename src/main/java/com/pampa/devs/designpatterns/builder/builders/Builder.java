package com.pampa.devs.designpatterns.builder.builders;

/**
 * Builder interface defines all possible ways to configure a house.
 */
public interface Builder {
    void withWindows(int windows);
    void withDoors(int doors);
    void withRooms(int rooms);
    void withGarage(boolean garage);
    void withSwimPool(boolean swimPool);
    void withGarden(boolean garden);
    void withFirePlace(boolean firePlace);
    void withGrillPlace(boolean grillPlace);
    void withOpenConcept(boolean openConcept);
    void withPlayKids(boolean playKids);
}
