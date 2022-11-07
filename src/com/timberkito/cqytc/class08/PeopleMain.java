package com.timberkito.cqytc.class08;

public class PeopleMain {
    public static void main(String[] args) {
        People people = new People();
        ChinaPeople wqh = new ChinaPeople();
        AmericanPeople timber = new AmericanPeople();
        BeijingPeople bj = new BeijingPeople();

        people.speakHello();
        people.averageHeight();
        people.averageWeight();

        wqh.speakHello();
        wqh.averageHeight();
        wqh.averageWeight();
        wqh.chinaGongfu();

        bj.speakHello();
        bj.averageHeight();
        bj.averageWeight();
        bj.beijingOpera();

        timber.speakHello();
        timber.averageHeight();
        timber.averageWeight();
        timber.americanBoxing();
    }
}
