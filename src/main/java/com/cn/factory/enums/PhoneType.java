package com.cn.factory.enums;

public enum PhoneType {
    iPhone("iPhone","iPhone"),
    Mi("Mi", "Mi"),
    Nokia("Nokia", "Nokia"),
    Samsung("Samsung", "Samsung");

    private String brand;
    private String des;

    private PhoneType(String brand, String des) {
        this.brand = brand;
        this.des = des;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
