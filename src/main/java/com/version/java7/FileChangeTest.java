package com.version.java7;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchService;

/**
 * 文件改变的事件通知功能
 * 
 * @author liufei
 *
 */
public class FileChangeTest {
	
	private WatchService watchService;
	
	private Path path;
	
	public Path getPath() {
		return path;
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		FileChangeTest fct = new FileChangeTest();
		
	}

	/**
	 * 获取一个watch实例
	 */
	public synchronized WatchService getWatchService() throws IOException{
		if (null == watchService) {
			return FileSystems.getDefault().newWatchService();
		}
		return watchService;
	}
	
}
