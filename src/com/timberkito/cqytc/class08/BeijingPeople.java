package com.timberkito.cqytc.class08;

public class BeijingPeople extends ChinaPeople {
    public void beijingOpera() {
        System.out.println("我会京剧！");
    }

    @Override
    public void speakHello() {
        System.out.println("我是北京人噢！");
    }

    @Override
    public void averageWeight() {
        System.out.println("北京人平均体重为：70kg");
    }

    @Override
    public void averageHeight() {
        System.out.println("北京人平均身高为：170cm");
    }
}
