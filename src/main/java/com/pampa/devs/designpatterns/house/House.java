package com.pampa.devs.designpatterns.house;

public class House {

    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasGarden;
    private boolean hasFirePlace;
    private boolean hasGrillPlace;
    private boolean hasOpenConcept;
    private boolean hasPlayKids;
    private int windows;
    private int doors;
    private int rooms;

    public House(boolean hasGarage, boolean hasSwimPool,
                 boolean hasGarden, boolean hasFirePlace, boolean hasGrillPlace,
                 boolean hasOpenConcept, boolean hasPlayKids, int windows, int doors, int rooms) {
        this.hasGarage = hasGarage;
        this.hasSwimPool = hasSwimPool;
        this.hasGarden = hasGarden;
        this.hasFirePlace = hasFirePlace;
        this.hasGrillPlace = hasGrillPlace;
        this.hasOpenConcept = hasOpenConcept;
        this.hasPlayKids = hasPlayKids;
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean hasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean hasFirePlace() {
        return hasFirePlace;
    }

    public void setHasFirePlace(boolean hasFirePlace) {
        this.hasFirePlace = hasFirePlace;
    }

    public boolean hasGrillPlace() {
        return hasGrillPlace;
    }

    public void setHasGrillPlace(boolean hasGrillPlace) {
        this.hasGrillPlace = hasGrillPlace;
    }

    public boolean hasOpenConcept() {
        return hasOpenConcept;
    }

    public void setHasOpenConcept(boolean hasOpenConcept) {
        this.hasOpenConcept = hasOpenConcept;
    }

    public boolean hasPlayKids() {
        return hasPlayKids;
    }

    public void setHasPlayKids(boolean hasPlayKids) {
        this.hasPlayKids = hasPlayKids;
    }

    @Override
    public String toString() {
        String car = "";
        car += "windows: " + getWindows() + "\n";
        car += "doors: " + getDoors() + "\n";
        car += "rooms: " + getRooms() + "\n";
        car += "hasGarage: " + hasGarage() + "\n";
        car += "hasSwimPool - " + hasSwimPool() + "\n";
        car += "hasGarden - " + hasGarden() + "\n";
        car += "hasFirePlace - " + hasFirePlace() + "\n";
        car += "hasGrillPlace - " + hasGrillPlace() + "\n";
        car += "hasOpenConcept: " + hasOpenConcept() + "\n";
        car += "hasPlayKids: " + hasPlayKids() + "\n";
        return car;
    }
}



