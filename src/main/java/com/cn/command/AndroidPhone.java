package com.cn.command;

/**
 * 接收者，真正执行命令的对象
 */
public class AndroidPhone implements Phone {

    public void call() {
        System.out.println("Use Android Phone Call!");
    }

    @Override
    public void ringOff() {
        System.out.println("Android Phone Ring Off!");
    }

    public void internet() {
        System.out.println("Use Android Phone Internet!");
    }

    @Override
    public void internetOff() {
        System.out.println("Android Phone Internet Off!");
    }
}
