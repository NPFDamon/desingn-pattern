package com.cn.filter;

public class Phone {
    private String brand;
    private String internetType;
    private String os;
    private String cpu;

    public Phone(String brand,String internetType,String os,String cpu){
        this.brand = brand;
        this.internetType = internetType;
        this.os = os;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInternetType() {
        return internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", internetType='" + internetType + '\'' +
                ", os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
