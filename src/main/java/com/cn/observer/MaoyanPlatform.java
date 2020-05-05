package com.cn.observer;

/**
 * 具体观察者
 */
public class MaoyanPlatform extends SaleTicketPlatform {

    public MaoyanPlatform(MovieCenter movieCenter) {
        this.movieCenter = movieCenter;
    }

    @Override
    protected void update(String type) {
        if (type.equals("New")) {
            System.out.println("[MaoYan]--New movie: " + movieCenter.getMovieName() + " is on line!");
        } else if (type.equals("Off")) {
            System.out.println("[MaoYan]--Movie: " + movieCenter.getMovieName() + "is off line!");
        }
    }
}
