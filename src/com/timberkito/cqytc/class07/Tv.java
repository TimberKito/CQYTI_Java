package com.timberkito.cqytc.class07;

public class Tv {
    private int channel;

    public void showProgram() {
        switch (this.channel) {
            case 1:
                System.out.println("少儿频道");
                break;
            case 2:
                System.out.println("金鹰卡通");
                break;
            case 3:
                System.out.println("CCTV1");
                break;
            default:
                System.out.println("没有这个频道");
                break;
        }
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
