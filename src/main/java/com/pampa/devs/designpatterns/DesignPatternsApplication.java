package com.pampa.devs.designpatterns;

import com.pampa.devs.designpatterns.builder.book.House;
import com.pampa.devs.designpatterns.builder.builders.HouseBuilder;
import com.pampa.devs.designpatterns.builder.builders.HouseDirector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		HouseDirector houseDirector = new HouseDirector();
		HouseBuilder houseBuilder = new HouseBuilder();

		houseDirector.withGarage(houseBuilder);
		houseDirector.withGarden(houseBuilder);
		houseDirector.withOpenConcept(houseBuilder);

		House house = houseBuilder.build();
		System.out.println(house.toString());
	}
}