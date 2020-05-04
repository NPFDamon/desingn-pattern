package com.cn.command;

/***
 * 命令模式；将一个请求封装成一个对象，从而可以用不同的请求对客户进行参数化
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new AndroidPhone();
        Phone ap = new MobilePhone("IPhone XII", "IOS 14");
        Phone sP = new MobilePhone("Samsung Galaxy S20u", "Android R");

        CallCommand callCommand = new CallCommand(phone);
        InternetCommand internetCommand = new InternetCommand(phone);

        CallCommand aCommand = new CallCommand(ap);
        CallCommand sCommand = new CallCommand(sP);


        Broker broker = new Broker();
        broker.takeCommand(callCommand);
        broker.takeCommand(internetCommand);
        broker.placeCommands();
        broker.cancelCommands();

        Broker callBroker = new Broker();
        callBroker.takeCommand(callCommand);
        callBroker.takeCommand(aCommand);
        callBroker.takeCommand(sCommand);
        callBroker.placeCommands();
    }
}
