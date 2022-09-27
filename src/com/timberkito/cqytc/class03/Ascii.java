package com.timberkito.cqytc.class03;

public class Ascii {
    public static void main(String[] args) {
        char[] alp = new char[]{'a', 't', 'u', 'E', 'B', 'M'};
        for (int i = 0; i < alp.length; i++) {
            byte byteAscii = (byte) alp[i];
            System.out.println("The ASCII value is" + byteAscii);
        }
    }
}