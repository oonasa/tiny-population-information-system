package com.codingtask.PopulationInformationApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    //added IDs for identification when using a database since other information (including social security number) may change; would be generated automatically
    private Long id;
    private String socialSecurityNumber;
    private BasicPersonInfo basicPersonInfo;
    private PostalInfo postalInfo;
    private List<FamilyRelation> familyRelations;

    public Person(Long id, String socialSecurityNumber, BasicPersonInfo basicPersonInfo, PostalInfo postalInfo, List<FamilyRelation> familyRelations) {
        this.id = id;
        this.socialSecurityNumber = socialSecurityNumber;
        this.basicPersonInfo = basicPersonInfo;
        this.postalInfo = postalInfo;
        this.familyRelations = familyRelations;
    }

    //a simplified version of creating a new person, assuming other info will be added later
    public Person(Long id, String socialSecurityNumber) {
        this.id = id;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //add some very basic information about the person
    public void addBasicInformation(String firstName, String lastName, String email, String nationality, String nativeLanguage,
                                    String gender, LocalDate dateOfBirth, String placeOfBirth, LocalDate dateOfDeath) {

        BasicPersonInfo basicInfo = new BasicPersonInfo(firstName, lastName, email, nationality, nativeLanguage, gender,
                dateOfBirth, placeOfBirth, dateOfDeath);

        this.basicPersonInfo = basicInfo;
    }

    //add a new family member to the person's records (e.g. a new child)
    public void addNewFamilyRelation(Long id, String relation) {
        FamilyRelation familyRelation = new FamilyRelation(id, relation);

        if (this.familyRelations == null) {
            this.familyRelations = new ArrayList<>();
        }
        this.familyRelations.add(familyRelation);
    }

    //remove an ex-family member from the person's records (e.g. after a divorce)
    public void removeFamilyRelation(FamilyRelation relation) {
        if (this.familyRelations != null) {
            familyRelations.remove(relation);
        }
    }

    //create and return the person's birth certificate that includes information about the person and the their parents
    public String createBirthCertificate() {
        List<Long> parents = new ArrayList<>();

        this.familyRelations.forEach(r -> {
            if (r.isRelationParent()) {
                parents.add(r.getPersonId());
            }
        });

        BirthCertificate birthCertificate = new BirthCertificate(this.basicPersonInfo, parents);
        return birthCertificate.toString();
    }

    //update person's address information in case of relocation (keeping a record of old addresses as well as the current one)
    public void updateAddressInformation(Address oldAddress, Address newAddress) {
        if (this.postalInfo == null) {
            this.postalInfo = new PostalInfo();
        }
        this.postalInfo.setCurrentAddress(newAddress);
        this.postalInfo.addPastAddress(oldAddress);
    }


    //examples of updating some of the person's basic information

    public void updateFirstName(String firstName) {
        if (this.basicPersonInfo == null) {
            this.basicPersonInfo = new BasicPersonInfo();
        }
        this.basicPersonInfo.setFirstName(firstName);
    }

    public void updateLastName(String lastName) {
        if (this.basicPersonInfo == null) {
            this.basicPersonInfo = new BasicPersonInfo();
        }
        this.basicPersonInfo.setLastName(lastName);
    }

    public void updateNationality(String nationality) {
        if (this.basicPersonInfo == null) {
            this.basicPersonInfo = new BasicPersonInfo();
        }
        this.basicPersonInfo.setNationality(nationality);
    }

    //get person's basic information if it exists
    public String getBasicPersonInfo() {
        if (this.basicPersonInfo != null) {
            return basicPersonInfo.toString();
        }
        return null;
    }

    public String toString() {
        return "Social security number: " + this.socialSecurityNumber +
                ", basic info: " + this.basicPersonInfo +
                ", postal info: " + this.postalInfo +
                ", family relations: " + this.familyRelations;
    }
}
