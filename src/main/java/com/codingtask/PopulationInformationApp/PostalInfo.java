package com.codingtask.PopulationInformationApp;

import java.util.ArrayList;
import java.util.List;

public class PostalInfo {

    private Long id;
    private Address currentAddress;
    private List<Address> pastAddresses;

    public PostalInfo() {
    }

    public Address getCurrentAddress() {
        return this.currentAddress;
    }

    public List<Address> getPastAddresses() {
        return this.pastAddresses;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPastAddresses(List<Address> pastAddresses) {
        this.pastAddresses = pastAddresses;
    }

    public void addPastAddress(Address pastAddress) {
        if (this.pastAddresses == null) {
            pastAddresses = new ArrayList<>();
        }
        pastAddresses.add(pastAddress);
    }

    public String toString() {
        return "current address: " + this.currentAddress +
                ", past addresses: " + this.pastAddresses;
    }
}
