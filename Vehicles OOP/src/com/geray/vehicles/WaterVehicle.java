package com.geray.vehicles;

import com.geray.Vehicle;

public class WaterVehicle extends Vehicle implements Modeling{

    private boolean isPlasticMaterialUsed;
    private boolean isWooden;
    private boolean isSailed;
    private boolean isBedded;

    @Override
    public String toString() {
        return "WaterVehicle{" +
                "isPlasticMaterialUsed=" + isPlasticMaterialUsed +
                ", isWooden=" + isWooden +
                ", isSailed=" + isSailed +
                ", isBedded=" + isBedded +
                '}';
    }

    public boolean isPlasticMaterialUsed() {
        return isPlasticMaterialUsed;
    }

    public void setPlasticMaterialUsed(boolean plasticMaterialUsed) {
        isPlasticMaterialUsed = plasticMaterialUsed;
    }

    public boolean isWooden() {
        return isWooden;
    }

    public void setWooden(boolean wooden) {
        isWooden = wooden;
    }

    public boolean isSailed() {
        return isSailed;
    }

    public void setSailed(boolean sailed) {
        isSailed = sailed;
    }

    public boolean isBedded() {
        return isBedded;
    }

    public void setBedded(boolean bedded) {
        isBedded = bedded;
    }

    @Override
    public void engineSound() {
        if(isPlasticMaterialUsed || isWooden)
            System.out.println("Tkrtkrtkrtkrtkr");
        else
            System.out.println("Brbrbrbrbrbrmbrmbrmbrm");
    }

    @Override
    public void writeInfo() {
        System.out.println(toString() + super.toString());
    }
}
