package com.geray.vehicles.landVehicles;

import com.geray.vehicles.LandVehicle;

public class Car extends LandVehicle {

    private String caseType; //hatchpack sedan bla bla

    public Car(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }
}
