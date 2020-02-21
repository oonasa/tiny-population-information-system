package com.codingtask.PopulationInformationApp;

import java.util.List;

public class BirthCertificate {

    private Long id;
    private BasicPersonInfo userBasicInfo;
    private BasicPersonInfo parentBasicInfo1;
    private BasicPersonInfo parentBasicInfo2;

    public BirthCertificate(BasicPersonInfo userBasicInfo, List<Long> parentIds) {
        this.userBasicInfo = userBasicInfo;

        //next get parents' info using IDs
    }

    public String toString() {
        return "UserBasicInfo: " + this.userBasicInfo +
                ", parentBasicInfo1: " + this.parentBasicInfo1 +
                ", parentBasicInfo2: " + this.parentBasicInfo2;
    }
}
