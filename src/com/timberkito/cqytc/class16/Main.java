package com.timberkito.cqytc.class16;

public class Main {
    public static void main(String[] args) {
        String info = "姓名:Timber;出生时间:2000.11.09;QQ邮箱:554080105@qq.com;学号:2022231870";

        int first_colon = info.indexOf(":");
        String name = info.substring(first_colon + 1, info.indexOf(";"));
        System.out.println(name);
        System.out.println("是否以“T”字开头" + name.startsWith("T"));

        int second_colon = info.indexOf(":", first_colon + 1);
        String date = info.substring(second_colon + 1, second_colon + 8);
        System.out.println(date);

        int third_colon = info.indexOf(":", second_colon + 1);
        int index_of_number = info.indexOf("学号");
        String email = info.substring(third_colon + 1, index_of_number - 1);
        System.out.println(email);

        int last_colon = info.lastIndexOf(":");
        String stu_number = info.substring(last_colon + 1);
        System.out.println(stu_number);
    }
}
