package com.cn.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CPUCriteria implements Criteria{
    public List<Phone> filter(List<Phone> phones) {
        List<Phone> qualcommPhone = new ArrayList<>();
        phones.forEach(p ->{
            if(p.getCpu().equals("Qualcomm")){
                qualcommPhone.add(p);
            }
        });
        return qualcommPhone;
    }
}
