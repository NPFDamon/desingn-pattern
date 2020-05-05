package com.cn.mediator;

/**
 * 具体中介者  steam
 */
public class Steam implements GamePlatform {

    @Override
    public void publishGame(GameCompany gameCompany) {
        System.out.println(gameCompany.getCompanyName() + " publish game " + gameCompany.publishGame() + " to Steam");
    }

    @Override
    public void saleGame(User user, GameCompany gameCompany) {
        System.out.println(user.getUserName() + " buy Game：" + gameCompany.publishGame() + " From Steam");
    }

}
