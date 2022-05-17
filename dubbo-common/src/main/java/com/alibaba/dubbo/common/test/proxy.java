//package com.alibaba.dubbo.common.test;
//import com.alibaba.dubbo.common.extension.ExtensionLoader;
//
//public class FruitGranter$Adaptive implements com.alibaba.dubbo.common.test.FruitGranter {
//    public java.lang.String watering(com.alibaba.dubbo.common.URL arg0) {
//        if (arg0 == null) throw new IllegalArgumentException("url == null");
//        com.alibaba.dubbo.common.URL url = arg0;
//        String extName = url.getParameter("fruit.granter", "apple");
//        if(extName == null)
//            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.common.test.FruitGranter) name from url(" + url.toString() + ") use keys([fruit.granter])");
//        com.alibaba.dubbo.common.test.FruitGranter extension =
//                (com.alibaba.dubbo.common.test.FruitGranter)ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.common.test.FruitGranter.class)
//                        .getExtension(extName);
//        return extension.watering(arg0);
//    }
//}