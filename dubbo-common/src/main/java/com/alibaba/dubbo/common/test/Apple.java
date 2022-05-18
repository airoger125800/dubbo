package com.alibaba.dubbo.common.test;

import com.alibaba.dubbo.common.URL;

public class Apple implements FruitGranter{
    @Override
    public String watering(URL url) {
        System.out.println("watering apple");
        return "apple";
    }

    @Override
    public String eat(URL url) {
        System.out.println("eat apple");
        return "apple";
    }
}
