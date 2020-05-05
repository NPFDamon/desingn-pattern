package com.cn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 国家电影中心 负责电影的发行和买票机构的对接
 * 主题Subject(被观察者)
 */
public class MovieCenter {
    private final List<SaleTicketPlatform> list = new ArrayList<>();

    private String movieName;

    public String getMovieName() {
        return movieName;
    }

    public void newMovie(String movieName){
        this.movieName = movieName;
        notifyAllObservers("New");
    }

    public void movieOffLine(String movieName){
        this.movieName = movieName;
        notifyAllObservers("Off");
    }

    public void addPlatform(SaleTicketPlatform saleTicketPlatform) {
        list.add(saleTicketPlatform);
    }

    public void deletePlatform(SaleTicketPlatform saleTicketPlatform) {
        list.remove(saleTicketPlatform);
    }

    public void notifyAllObservers(String type) {
        list.forEach(l-> l.update(type));
    }
}
