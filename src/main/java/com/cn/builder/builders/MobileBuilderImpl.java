package com.cn.builder.builders;

import com.cn.builder.interfaces.CPU;
import com.cn.builder.interfaces.OS;
import com.cn.builder.products.ProductBuilder;

//传统方式builder
public class MobileBuilderImpl implements MobileBuilder{
    ProductBuilder phone = new ProductBuilder();

    public void setOS(OS os) {
        phone.setOs(os);
    }

    public void setCPU(CPU cpu) {
        phone.setCpu(cpu);
    }

    public void setMobileBrand(String brand) {
        phone.setBrand(brand);
    }

    public void setPrice(double price) {
        phone.setPrice(price);
    }

    public ProductBuilder getPhone() {
        return phone;
    }
}
