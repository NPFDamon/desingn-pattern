package com.cn.builder.builders;

import com.cn.builder.interfaces.CPU;
import com.cn.builder.interfaces.OS;
import com.cn.builder.products.ProductBuilder;

public interface MobileBuilder {
    void setOS(OS os);
    void setCPU(CPU cpu);
    void setMobileBrand(String brand);
    void setPrice(double price);
    ProductBuilder getPhone();
}
