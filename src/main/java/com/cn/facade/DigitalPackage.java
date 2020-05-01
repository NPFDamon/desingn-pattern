package com.cn.facade;

public class DigitalPackage {

    private Camera camera;
    private Computer computer;
    private EarPhone earPhone;
    private Phone phone;

    public DigitalPackage(){
        camera = new Camera();
        computer = new Computer();
        earPhone = new EarPhone();
        phone = new Phone();
    }


    public void package1(){
        System.out.println("Package1 is sale");
        phone.sale();
        earPhone.sale();
    }

    public void package2(){
        System.out.println("Package 2 sale");
        camera.sale();
        computer.sale();
    }

    public void package3(){
        System.out.println("Package3 sale");
        phone.sale();
        earPhone.sale();
        computer.sale();
        camera.sale();
    }


}
