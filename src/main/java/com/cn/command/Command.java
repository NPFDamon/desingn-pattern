package com.cn.command;

/**
 * 命令的接口
 */
public interface Command {
    void execute();

    void undo();
}
