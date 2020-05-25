package com.pampa.devs.designpatterns.builders;

public interface Builder {
    void withGarage(boolean garage);
    void withSwimPool(boolean swimPool);
    void withGarden(boolean garden);
    void withFirePlace(boolean firePlace);
    void withGrillPlace(boolean grillPlace);
    void withOpenConcept(boolean openConcept);
    void withPlayKids(boolean playKids);
    void withWindows(int windows);
    void withDoors(int doors);
    void withRooms(int rooms);
}
