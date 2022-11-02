package com.timberkito.cqytc.class07;

public class Family {
    private Tv homeTv;

    public void setHomeTv(Tv homeTv) {
        this.homeTv = homeTv;
    }

    public void changeChannel(int channel){
        this.homeTv.setChannel(channel);
    }

    public void seeTv(){
        this.homeTv.showProgram();
    }
}
