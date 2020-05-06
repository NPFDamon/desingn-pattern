package com.cn.nullobject;

public class PhoneFactory {
    private static final String[] brands = {"IPhone", "Mi", "Samsung"};

    public static Phone getPhone(String brand) {
        for (String s : brands) {
            if (s.equalsIgnoreCase(brand)) {
                return new RealPhone(brand);
            }
        }
        return new NullPhone();
    }
}
