package com.cn.builder.products;

import com.cn.builder.interfaces.CPU;
import com.cn.builder.interfaces.OS;

public class ProductBuilder {
    public CPU cpu;
    public OS os;
    public String brand;
    private double price;

    public ProductBuilder() {
    }

    private ProductBuilder(Builder builder) {
        this.cpu = builder.cpu;
        this.os = builder.os;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Builder 链式组装
    public static class Builder {
        public CPU cpu;
        public OS os;
        public String brand;
        private double price;

        public Builder setCPU(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setOS(OS os) {
            this.os = os;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder builder() {
            return new ProductBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "cpu=" + cpu.CPUBrand() +
                ", cpu version=" + cpu.version() +
                ", os=" + os.OS() +
                ", os version =" + os.version() +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
