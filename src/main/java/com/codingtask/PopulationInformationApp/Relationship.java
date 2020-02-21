package com.codingtask.PopulationInformationApp;

public enum Relationship {

    FATHER("Isä"),
    MOTHER("Äiti"),
    CHILD("Lapsi"),
    SIBLING("Sisarus"),
    LIVE_IN_PARTNER("Puoliso (avoliitto)"),
    MARRIED_PARTNER("Puoliso (avioliitto)"),
    REGISTERED_PARTNER("Puoliso (rekisteröity parisuhde)");

    String relationship;

    Relationship(String relationship) {
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }
}
