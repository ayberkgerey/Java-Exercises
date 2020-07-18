package com.geray.vehicles.airVehicles;

import com.geray.vehicles.AirVehicle;

public class Jet extends AirVehicle {

    private boolean isGunned;
    private boolean isSupersonic;

    public Jet() {
        this.isGunned = isGunned;
        this.isSupersonic = isSupersonic;
    }

    public boolean isGunned() {
        return isGunned;
    }

    public void setGunned(boolean gunned) {
        isGunned = gunned;
    }

    public boolean isSupersonic() {
        return isSupersonic;
    }

    public void setSupersonic(boolean supersonic) {
        isSupersonic = supersonic;
    }
}
