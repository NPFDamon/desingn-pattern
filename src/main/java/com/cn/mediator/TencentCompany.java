package com.cn.mediator;

public class TencentCompany implements GameCompany {

    @Override
    public String getCompanyName() {
        return "Tencent";
    }

    @Override
    public String publishGame() {
        return "LOL";
    }
}
