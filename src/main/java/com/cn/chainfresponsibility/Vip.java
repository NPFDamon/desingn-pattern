package com.cn.chainfresponsibility;

/**
 *  责任链抽象类
 */
public abstract class Vip {
    protected Integer level;

    //下一个等级
    public Vip nextLevel;

    public void setNextLevel(Vip nextLevel){
        this.nextLevel = nextLevel;
    }

    public final void handleLevel(Integer level){
        //判断哪个VIP处理
        if(levelPower(level)){
            message();
        }
        //遍历整条责任链
        if(nextLevel != null){
            nextLevel.handleLevel(level);
        }
    }

    //VIP判断方法
    private Boolean levelPower(Integer level){
        return this.level.equals(level);
    }

    //处理方法
    abstract void message();

}
