package com.alibaba.dubbo.common.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class Test {
    public static void main(String[] args) {
        URL url = URL.valueOf("dubbo://127.0.0.1:20880?water=apple&eat=banana");
        final ExtensionLoader<FruitGranter> extensionLoader = ExtensionLoader.getExtensionLoader(FruitGranter.class);

        final FruitGranter granter = extensionLoader.getAdaptiveExtension();

        System.out.println(granter.watering(url));
        System.out.println(granter.eat(url));
    }
}
