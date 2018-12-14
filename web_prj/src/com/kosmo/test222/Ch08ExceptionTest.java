package com.kosmo.test222;
//import java.lang.ArrayIndexOutOfBoundsException;

//예외처리란 : 코드를 끝까지 수행하기 위해서 발생된 예외를 처리해 주는 것
//try{} XXXX
//try{}catch{}
//try{}catch{}finally{}
//try{}       finally{} : 의미없음


public class Ch08ExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[2];
		
		
//		try {
//			System.out.println(arr[9]);
//		} finally {
//			System.out.println("ddd");
//		}
		
		
		try {
			System.out.println("1"); 
			System.out.println(arr[2]);
			int res = 10/0;
			System.out.println("2");
//catch{} exception은 작은타입 --> 큰타입으로 적어라			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:잡았다");
		}catch(ArithmeticException aaa) {
			System.out.println("산술적 예외 발생 잡았다..");	
		}catch(Exception aaa) {
			System.out.println("혹시나...");
		}
		
		
		try {
//ArrayIndexOutOfBounds에러가 아니여도 try에 묶여도 상관은 없다
			System.out.println("1"); 
			System.out.println(arr[2]);
//System.out.println("3"); ??결과가 달라질 수는 있다
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:잡았다");
//			System.out.println("메세지:"+e.getMessage());
//			System.out.println("원인:"+e.getCause());
//			System.out.println("클래스:"+e.getClass());
			//e.printStackTrace();
		} finally {
			//예외발생 여부와 관계없이 해당 블럭은 실행
			System.out.println("무조건 실행");
		}
		
		
//하나의 메서드에서  try{}catch{} 여러번 사용 가능
		try {
			System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:잡았다22");
			
//try{}catch{} 안에서 또 다른 try{}catch{} 중첩 가능		
			try {
				System.out.println(arr[7]);
			}catch(ArrayIndexOutOfBoundsException ec) {
				System.out.println("catch:잡았다333");
			}
		}	
		
		System.out.println("3");
		

	}

}
