package com.timberkito.cqytc.class14;

public class DangerException extends Exception {
	   String message;
	   public DangerException() {
	       message = "危险品!";
	   }
	   public void toShow() {
	       System.out.println("属于" +message);//输出异常信息
	   }

}
