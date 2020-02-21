package com.codingtask.PopulationInformationApp;

import java.time.LocalDate;

public class BasicPersonInfo {

    //for simplicity assuming a person can only have one nationality at a time and ignoring middle names, preferred name etc.
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String nationality;
    private String nativeLanguage;
    private String gender;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private LocalDate dateOfDeath;

    public BasicPersonInfo(String firstName, String lastName, String email, String nationality, String nativeLanguage,
                           String gender, LocalDate dateOfBirth, String placeOfBirth, LocalDate dateOfDeath) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nationality = nationality;
        this.nativeLanguage = nativeLanguage;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public BasicPersonInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String toString() {
        return "First name: " + this.firstName +
                ", last name: " + this.lastName +
                ", email: " + this.email +
                ", nationality: " + this.nationality +
                ", native language: " + this.nativeLanguage +
                ", gender: " + this.gender +
                ", date of birth: " + this.dateOfBirth +
                ", place of birth: " + this.placeOfBirth +
                ", date of death: " + this.dateOfDeath;
    }
}
