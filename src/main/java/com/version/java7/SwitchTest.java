package com.version.java7;

/**
 * switch可以接受string类型而不像以前仅仅是int
 * @author liuf
 *
 */
public class SwitchTest {
	public static void main(String[] args) {
		testSwitchString(StatusEmun.THREE.getValue());
	}
	
	public static void testSwitchString(String status) {
		if (null == status) return;
		switch (status) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}

enum StatusEmun{
	ONE("one"),
	TWO("two"),
	THREE("three");
	
	private String value;
	
	public String getValue() {
		return value;
	}

	private StatusEmun(String value) {
		this.value = value;
	}
}

