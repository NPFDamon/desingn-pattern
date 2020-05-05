package com.cn.mediator;

public class EACompany implements GameCompany {

    @Override
    public String getCompanyName() {
        return "Electronic Arts";
    }

    @Override
    public String publishGame() {
        return "FIFA 15";
    }
}
