package com.version.java7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * 文件读写 会自动关闭流而不像以前那样需要在finally中显式close； 
 * @author liufei
 *
 */
public class FileStreamTest {
	
	public static void main(String[] args) {
		fsTest();
	}
	
	public static void fsTest(){
		try (FileOutputStream fos = new FileOutputStream("D:\\test.txt");
			 DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeUTF("java 7 block buster");
		} catch (Exception e) {
			// log
		}
	}
}
