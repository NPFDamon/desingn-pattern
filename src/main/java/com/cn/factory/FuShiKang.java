package com.cn.factory;

import com.cn.factory.enums.PhoneType;

public class FuShiKang {
    public Phone getPhone(String phoneBrand){
        if (phoneBrand == null){
            return new UnKnowPhone();
        }
        if(phoneBrand.equals(PhoneType.iPhone.getBrand())){
            return new ApplePhone();
        }else if (phoneBrand.equals(PhoneType.Mi.getBrand())){
            return new MiPhone();
        }else if(phoneBrand.equals(PhoneType.Nokia.getBrand())){
            return new NokiaPhone();
        }else if (phoneBrand.equals(PhoneType.Samsung.getBrand())){
            return new SamsungPhone();
        }
        return  new UnKnowPhone();
    }
}
