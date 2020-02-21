package com.codingtask.PopulationInformationApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PopulationInformationAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(PopulationInformationAppApplication.class, args);


		//sample users

		Person matti = new Person((long) 1, "120256-123A");

		matti.addBasicInformation("Matti", "Mattinen", "matti.mattinen@testi.fi",
				"Suomi", "Suomi", "m", LocalDate.of(1856, 2, 12),
				"Helsinki", null);

		Person maija = new Person((long) 3, "120232-126H");
		maija.addBasicInformation("Maija", "Mattinen", "maija.mattinen@testi.fi",
				"Suomi", "Suomi", "f", LocalDate.of(1866, 11, 15),
				"Vaasa", null);

		Person maria = new Person((long) 2, "343476-143B");
		maria.addBasicInformation("Maria", "Mattinen", null,
				"Suomi", "Suomi", "f", LocalDate.of(1880, 1, 1),
				"Kuopio", null);

		matti.addNewFamilyRelation((long) 2, "CHILD");
		maija.addNewFamilyRelation((long) 1, "CHILD");
		maria.addNewFamilyRelation((long) 1, "FATHER");
		maria.addNewFamilyRelation((long) 3, "MOTHER");
		matti.addNewFamilyRelation((long) 3, "MARRIED_PARTNER");
		maria.addNewFamilyRelation((long) 2, "MARRIED_PARTNER");

		System.out.println("Matti: " + matti.toString());

		//ordering a birth certificate for Maria
		String certificate = maria.createBirthCertificate();
		System.out.println("Maria's birth certificate: " + certificate);

		//now Matti is moving and needs to change his address information (muuttoilmoitus)
		Address oldAddress = new Address("Vanhakuja 1 a", "Helsinki", "13500",
				"Suomi", LocalDate.of(2010, 3, 28));
		Address newAddress = new Address("Uusikuja 2 b",
				"Tampere", "18500", "Suomi", LocalDate.of(2020, 2, 21));

		NotificationOfMove notification = new NotificationOfMove("120256-123A", "Matti",
				"Mattinen", "matti.mattinen@testi.fi", oldAddress, newAddress);

		notification.processMove(matti);

		System.out.println("Checking Matti's records: " + matti.toString());

		//Matti has decided to change his first name
		matti.updateFirstName("Markus");
		matti.updateLastName("Miettinen");
		matti.updateNationality("Norja");
		System.out.println("Checking user's updated basic info: " + matti.getBasicPersonInfo());

	}

}
