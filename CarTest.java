package com.cjn.base04;
 /**
 * @Project: java28
 * @Author: cjn
 * @Create: 2021-03-30 21:32
 * @Desc：
 **/


public class CarTest {
    public static void main(String[] args){
        Car car = new Car();
        car.color = "red";
        car.brand = "Shanghai";
        car.wheel = "";
        car.start();
        car.brake();
    }
}
