package com.cn.porxy.staticproxy;

public class ProxyInternet implements Internet {
    private Internet internet = null;

    @Override
    public void internet() {
        if (internet == null) {
            internet = new CHNInternet();
        }
        linkToAllInternet();

        System.out.println("You have get proxy internet,you can visit all network!");
    }

    //代理增强功能
    private void linkToAllInternet() {
        System.out.println("User Static Method link to all network please wait .....");
        try {
            Thread.sleep(600);
        } catch (Exception e) {
            System.out.println("Fail,please try again");
        }
        System.out.println("Successful, you can visit all network .....");
    }
}
