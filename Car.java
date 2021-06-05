package com.cjn.base04;
 /**
 * @Project: java28
 * @Author: cjn
 * @Create: 2021-03-30 21:25
 * @Desc：
 **/


public class Car {
    //颜色
    String color;
    //车轮
    String wheel;
    //品牌
    String brand;

    //汽车启动的方法
    public void start(){
        System.out.println(color+"的"+brand+"汽车开始启动=======");
    }

    //刹车的方法
    public void brake(){
        System.out.println("刹车======");
    }

}
