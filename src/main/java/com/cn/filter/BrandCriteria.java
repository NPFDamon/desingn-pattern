package com.cn.filter;

import java.util.ArrayList;
import java.util.List;

public class BrandCriteria implements Criteria{
    @Override
    public List<Phone> filter(List<Phone> phones) {
        List<Phone> applePhone = new ArrayList<>();
        phones.forEach(p ->{
            if (p.getBrand().equals("Apple")){
                applePhone.add(p);
            }
        });
        return applePhone;
    }
}
