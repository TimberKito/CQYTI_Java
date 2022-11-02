package com.timberkito.cqytc.class07;

public class MainClass {
    public static void main(String[] args) {
        Tv hairTv = new Tv();
        hairTv.setChannel(2);
        hairTv.showProgram();

        Family wangQiHaoFamily = new Family();
        wangQiHaoFamily.setHomeTv(hairTv);
        wangQiHaoFamily.changeChannel(1);
        wangQiHaoFamily.seeTv();
    }
}
