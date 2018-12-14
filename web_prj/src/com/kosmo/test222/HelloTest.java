package com.kosmo.test222;
//2018/07/26  18:20:00
//자바첫날~~~~ :

/**
 * 이건 내가 <b>첫날</b> 만든 자바파일이다<p>
 * 그래서 어쩌구 저쩌구..<p>
 * 그래서 어쩌구 저쩌구..<p>
 * 그래서 어쩌구 저쩌구..<p>
 * 그래서 어쩌구 저쩌구..<p>
 * 그래서 어쩌구 저쩌구..<p>
 * 그래서 어쩌구 저쩌구..<p>
 * @author lee.k.h
 *
 */
public class HelloTest {
	static int allnum = 1000;
	
	//주석 
	//메서드이름 : main
	// public  __0___	main(__1_  _2_)
	//(  ) : 파라미터  parameter//매개변수,인자 
	//0 : 리턴타입 int String void(리턴이없다=줄값이없다)
	//1 : 파라미터 타입
	//2 : 파라미터명=변수명(사용자 리네임)
	
	/**
	 * 이건 내가 첫날 만든 메인이다<p>
	 * 메인 메서드는 어쩌구 저쩌구..<p>
	 * 메인 메서드는 어쩌구 저쩌구..<p>
	 * 메인 메서드는 어쩌구 저쩌구..<p>
	 * 
	 * @param xcdxc는 그냥 주는거... 내가 만든거... 
	 */
	public static void main(String[] xcdxc) {
		System.out.println(allnum);

		//add 메서드를 호출한다.
		//res : add 메서드를 호출한 결과값
		int res = add(12,3);
		System.out.println(res);
		
		//*****************************
		//메모리에 올리는 방법
		// 1. static 
		// 2. new
		//*****************************
		HelloTest aaa = new HelloTest(); //E4
		System.out.println(aaa);
		System.out.println(aaa.allnum);
		int res22 = aaa.add(55, 10);
		System.out.println(res22);
		aaa.myprint(3);
		
		HelloTest aaa2 = new HelloTest();
		
	}

//	메서드 기본 모양
//	_접근제어자_   _리턴타입__   _메서드명_ 
//	(파라미터타입  파라미터명, 파라미터타입  파라미터명) {
//		
//	}
	/**
	 * 해당 함수는 두개의 수를 받아....<p>
	 * 해당 함수는 두개의 수를 받아....<p>
	 * 해당 함수는 두개의 수를 받아....<p>
	 * 해당 함수는 두개의 수를 받아....<p>
	 * 해당 함수는 두개의 수를 받아....<p>
	 * 
	 * @param a는 숫자다
	 * @param b는 숫자다
	 * @return 두 수의 합을 준다
	 */
	public static int add(int a, int b) {
		System.out.println("----" + allnum);
		return a + b;
	}
	
	/**
	 * 해당 함수는 출력 결과를...<p>
	 * 해당 함수는 출력 결과를...<p>
	 * 해당 함수는 출력 결과를...<p>
	 * 해당 함수는 출력 결과를...<p>
	 * 
	 * @param h는 숫자다
	 */
	public void myprint(int h) {
		System.out.println("나호출" + h);
	}

}



