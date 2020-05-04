package com.cn.command;

/**
 * 接收者接口，真正执行命令的对象接口
 */
public interface Phone {
    void call();

    void ringOff();

    void internet();

    void internetOff();
}
