package com.alibaba.dubbo.common.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("apple")
public interface FruitGranter {

    @Adaptive("water")
    String watering(URL url);

    @Adaptive("eat")
    String eat(URL url);
}
