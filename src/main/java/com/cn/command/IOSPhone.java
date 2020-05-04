package com.cn.command;

/**
 * 接收者，真正执行命令的对象
 */
public class IOSPhone implements Phone {
    public void call() {
        System.out.println("Use IOS Phone Call!");
    }

    @Override
    public void ringOff() {
        System.out.println("IOS Phone Ring Off!");
    }

    public void internet() {
        System.out.println("Use IOS Phone Internet!");
    }

    @Override
    public void internetOff() {
        System.out.println("IOS Phone Internet Off!");
    }
}
