package com.codingtask.PopulationInformationApp;

import java.time.LocalDate;

public class NotificationOfMove {

    private Long id;
    private String socialSecurityNumber;
    private String firstName;
    private String lastName;
    private String email;
    private Address oldAddress;
    private Address newAddress;

    public NotificationOfMove(String socialSecurityNumber, String firstName, String lastName, String email, Address oldAddress, Address newAddress) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.oldAddress = oldAddress;
        this.newAddress = newAddress;
    }

    //process person's move to a new address
    //if we were using a database we'd get the person's information using their ID instead of getting the object as a parameter
    public void processMove(Person person) {
        if (person != null) {
            person.updateAddressInformation(this.oldAddress, this.newAddress);
        }
    }
}
