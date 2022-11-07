package com.timberkito.cqytc.class08;

public class ChinaPeople extends People {
    public void chinaGongfu() {
        System.out.println("我会中国功夫！");
    }

    @Override
    public void speakHello() {
        System.out.println("我是中国人！");
    }

    @Override
    public void averageHeight() {
        System.out.println("我的身高为：170cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("我的体重为：65kg");
    }
}
