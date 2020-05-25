package com.pampa.devs.designpatterns;

import com.pampa.devs.designpatterns.builders.HouseBuilder;
import com.pampa.devs.designpatterns.builders.HouseDirector;
import com.pampa.devs.designpatterns.house.House;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HouseTests {

    @Test
    public void shouldReturnHouseWithGarage() {
        // given
        HouseDirector houseDirector = new HouseDirector();
        HouseBuilder houseBuilder = new HouseBuilder();

        // then
        houseDirector.withGarage(houseBuilder);
        House house = houseBuilder.build();

        // then
        assertTrue(house.hasGarage());
    }

    @Test
    public void shouldReturnHouseWithGarden() {

        // given
        House house = new House(false, false, true, false, false,false,false, 1, 1, 1);

        // then
        assertTrue(house.hasGarden());
    }

    @Test
    public void shouldNotReturnHouseWithGarden() {

        // given
        House house = new House(false, false, false, false, false,false,false, 1, 1, 1);

        // then
        assertFalse(house.hasGarden());
    }

}
