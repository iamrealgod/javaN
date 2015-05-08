package com.version.java7;

/**
 * 异常catch可以一次处理完而不像以前一层层的surround； 
 * @author liufei
 *
 */
public class TryCatchTest {
	public static void main(String[] args) {
		testTryCatch();
	}
	
	public static void testTryCatch() {
		try {
			throwEO();
			throwET();
		} catch (ExceptionOne | RuntimeException | ExceptionTwo e) {
			System.out.println("catch exception");
		}
	}
	
	public static void throwEO() throws ExceptionOne {
		throw new ExceptionOne();
	}
	public static void throwET() throws ExceptionTwo {
		throw new ExceptionTwo();
	}
}

@SuppressWarnings("serial")
class ExceptionOne extends Exception {

}
@SuppressWarnings("serial")
class ExceptionTwo extends Exception {
	
}
