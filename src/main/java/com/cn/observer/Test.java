package com.cn.observer;

/**
 * 定义对象间的一对多关系，当一个对象发生改变时，所有依赖的对象都得到通知并自动更新
 */
public class Test {
    public static void main(String[] args){
        MovieCenter movieCenter = new MovieCenter();
        MaoyanPlatform maoyanPlatform = new MaoyanPlatform(movieCenter);
        Taopiaopiao taopiaopiao = new Taopiaopiao(movieCenter);
        movieCenter.addPlatform(maoyanPlatform);
        movieCenter.addPlatform(taopiaopiao);

        movieCenter.newMovie("Iron Man III");

        movieCenter.movieOffLine("Iron Man II");
    }
}
