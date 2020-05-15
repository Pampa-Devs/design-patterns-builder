package com.pampa.devs.designpatterns.builder.book;

public class House {

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

    public House(int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimPool,
                 boolean hasGarden, boolean hasFirePlace, boolean hasGrillPlace,
                 boolean hasOpenConcept, boolean hasPlayKids) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasSwimPool = hasSwimPool;
        this.hasGarden = hasGarden;
        this.hasFirePlace = hasFirePlace;
        this.hasGrillPlace = hasGrillPlace;
        this.hasOpenConcept = hasOpenConcept;
        this.hasPlayKids = hasPlayKids;
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

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasFirePlace() {
        return hasFirePlace;
    }

    public void setHasFirePlace(boolean hasFirePlace) {
        this.hasFirePlace = hasFirePlace;
    }

    public boolean isHasGrillPlace() {
        return hasGrillPlace;
    }

    public void setHasGrillPlace(boolean hasGrillPlace) {
        this.hasGrillPlace = hasGrillPlace;
    }

    public boolean isHasOpenConcept() {
        return hasOpenConcept;
    }

    public void setHasOpenConcept(boolean hasOpenConcept) {
        this.hasOpenConcept = hasOpenConcept;
    }

    public boolean isHasPlayKids() {
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
        car += "hasGarage: " + isHasGarage() + "\n";
        car += "hasSwimPool - " + isHasSwimPool() + "\n";
        car += "hasGarden - " + isHasGarden() + "\n";
        car += "hasFirePlace - " + isHasFirePlace() + "\n";
        car += "hasGrillPlace - " + isHasGrillPlace() + "\n";
        car += "hasOpenConcept: " + isHasOpenConcept() + "\n";
        car += "hasPlayKids: " + isHasPlayKids() + "\n";
        return car;
    }
}



