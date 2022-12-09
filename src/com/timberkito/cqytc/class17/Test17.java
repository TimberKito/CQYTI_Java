package com.timberkito.cqytc.class17;
import java.io.*;
public class Test17 {

	public static void main(String[] args) {
		byte[] a = "这是Java实验课程，实验内容为I/O输入输出流".getBytes();
		File file1 = new File("src\\com\\timberkito\\cqytc\\class17\\1.txt");
		File file2 = new File("src\\com\\timberkito\\cqytc\\class17\\2.txt");
		try {
			// 向file1中写字节
			FileOutputStream out1 = new FileOutputStream(file1);  //建立写入（输出）通道，将内容写入file1中
			out1.write(a);  //写入file2中
			System.out.println("写入完成。");
			out1.close();
			
			// 将file1中的内容复制到file2中
			FileInputStream in = new FileInputStream(file1); //建立读取（输入）通道，读取file1里的内容
			FileOutputStream out2 = new FileOutputStream(file2);//建立写入（输出）通道，将内容写入file2中
			byte[] b = in.readAllBytes(); // 读取file1中的所有内容
			out2.write(b);  // 写入file2中
			System.out.println("复制完成!");
			in.close();
			out2.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
