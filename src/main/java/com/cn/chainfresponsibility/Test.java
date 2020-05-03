package com.cn.chainfresponsibility;

/***
 * 责任链模式；为请求创建一个接收对象的链，职责链上的处理者负责处理请求，客户只需把请求发送到职责链上即可
 */
public class Test {

    public static void main(String[] args) {
        Vip vip = VipChain.getVip();
        vip.handleLevel(1);

    }

}
