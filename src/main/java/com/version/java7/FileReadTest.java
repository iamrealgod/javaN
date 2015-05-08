package com.version.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件读写功能增强，有更简单的api调用
 * @author liufei
 *
 */
public class FileReadTest {
	public static void main(String[] args) {
		pathInfo();
	}
	
	public static void pathInfo(){
		Path path = Paths.get("d:\\log\\test\\");
		System.out.println("Number of nodes:" + path.getNameCount());
		System.out.println("FileName:" + path.getFileName());
		System.out.println("FileRoot:+"+path.getRoot());
		System.out.println("FileParent:"+path.getParent());
		//
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
