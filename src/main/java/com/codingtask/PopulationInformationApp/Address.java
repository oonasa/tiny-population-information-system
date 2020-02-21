package com.codingtask.PopulationInformationApp;

import java.time.LocalDate;

public class Address {

    private Long id;
    private String streetAddress;
    private String city;
    private String postalCode;
    private String country;
    private LocalDate moveDate;

    public Address(String streetAddress, String city, String postalCode, String country, LocalDate moveDate) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.moveDate = moveDate;
    }

    public String toString() {
        return "street: " + this.streetAddress +
                ", city: " + this.city +
                ", postalCode: " + this.postalCode +
                ", moveDate: " + this.moveDate +
                ", country: " + this.country;
    }
}
