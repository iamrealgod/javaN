package com.version.java7;

import java.util.HashMap;
import java.util.Map;

/**
 * 泛型类实例化也不用繁琐的将泛型声明再写一遍
 * @author liufei
 *
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();//
		
		map.put("aa", args);
	}
}
