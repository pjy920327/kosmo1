package com.kosmo.test222;

public class Ch08ThrowsTest {

	public static void main(String[] args) { //throws Exception {
		System.out.println(1);
		try {
			myPrint();
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(2);	
		} catch (Exception e) {
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	}

	
	public static void myPrint() throws ArithmeticException, Exception {
		System.out.println("myPrint111");
		try {
			int res = 10/0;
		}catch(ArithmeticException e) {
			System.out.println("연산에러..");
		}
		System.out.println("myPrint222");
		/*Exception e = new Exception();
		throw e;*/
		throw new ArithmeticException();
	}

}
