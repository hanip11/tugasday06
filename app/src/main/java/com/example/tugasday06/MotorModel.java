package com.example.tugasday06;

public class MotorModel {
    private final String namaItem;
    private final String deskripsiItem;
    private final String hargaItem;
    private final int logoMotor;

    public MotorModel(String namaItem, String deskripsiItem, String hargaItem, int logoMotor) {
        this.namaItem = namaItem;
        this.deskripsiItem = deskripsiItem;
        this.hargaItem = hargaItem;
        this.logoMotor = logoMotor;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public String getDeskripsiItem() {
        return deskripsiItem;
    }

    public String getHargaItem() {
        return hargaItem;
    }

    public int getLogoMotor() {
        return logoMotor;
    }

}
