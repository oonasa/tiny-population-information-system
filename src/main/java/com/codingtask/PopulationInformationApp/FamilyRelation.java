package com.codingtask.PopulationInformationApp;

public class FamilyRelation {

    private Long id;
    private Long personId;
    private Relationship relationship;

    public FamilyRelation(Long personId, String relation) {
        this.personId = personId;
        this.relationship = Relationship.valueOf(relation);
    }

    public boolean isRelationParent() {
        if (this.relationship.getRelationship().equals("MOTHER") || this.relationship.getRelationship().equals("FATHER")) {
            System.out.printf("is parent!");
            return true;
        }
        return false;
    }

    public Long getPersonId() {
        return this.personId;
    }

    public String toString() {
        return "personId: " + this.personId +
                ", relationship: " + this.relationship;
    }
}
