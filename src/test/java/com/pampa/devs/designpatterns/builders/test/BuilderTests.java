package com.pampa.devs.designpatterns.builders.test;

import com.pampa.devs.designpatterns.builder.book.House;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderTests {

    @Test
    public void shouldReturnHouseWithGarage() {
        // given
        House house = new House(1, 1, 1, true, false, false, false, false,false,false);

        // then
        assertTrue(house.hasGarage());
    }

    @Test
    public void shouldReturnHouseWithGarden() {

        // given
        House house = new House(1, 1, 1, false, false, true, false, false,false,false);

        // then
        assertTrue(house.hasGarden());
    }

    @Test
    public void shouldNotReturnHouseWithGarden() {

        // given
        House house = new House(1, 1, 1, false, false, false, false, false,false,false);

        // then
        assertFalse(house.hasGarden());
    }

}
