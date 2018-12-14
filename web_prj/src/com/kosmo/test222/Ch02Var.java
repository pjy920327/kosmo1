package com.kosmo.test222;
//인스턴스 : 메모리에 올라가 주소를 갖는 변수,메서드
//인스턴스화 : 주소를 만든다(new)

public class Ch02Var {
	//클래스 안에는 변수,메서드 들이 올 수 있다.
	
	//전역변수는 초기화하지 않으면 기본 값으로 초기화된다.
	static int point; //static변수=클래스변수
	       int point2;//인스턴스변수
	static final int NOT_EDIT_NUM = 500;
	
	 public static void main(String[] sss) {
		
		 byte a = 10;
		 byte b = 20; 
		 byte c = (byte)(a + b);
		 
		 double divres = 10/8; //1.25
		 System.out.println(divres);
		 
		 int tot = 80;
//		 String totres = (tot==90)?"같다":"다르다";
		           //docode(tot,90,'같다','다르다')
//		 int totres = (tot==90)?1:0;
		 boolean totres = (tot==90)?true:false;
		 System.out.println(totres);
		 
		 
		 
		 int score = 80;
		 char cres = (score>90)?'A': (score>80)?'B':'C';
		
		 
		 
		 
		 
		 int n1 = 100000;
		 int n2 = 200000;
		 long nres = n1 * n2;
		 System.out.println("===>" + nres);
		 //===>552894464
		 
		 
		//static 변수는 메모리에 자동으로 올라감으로 그냥 사용
		System.out.println(point);
		System.out.println(Ch02Var.point);
		
		//변수는 new해서 메모리에 올려놓고 사용
		Ch02Var v = new Ch02Var();
		System.out.println(v.point2);
		System.out.println(v.point);
		//---------------------------------------
		
		//지역변수는 반드시 초기화(최초로 값을 할당)
//		int a;	//변수 선언
//		a = 4;	//초기화
//		System.out.println(a);
//		
//		int b = 10;	//선언,초기화
//		b = 7;	//값을 재할당(값을다시넣다)
		
		//기본(primitive)타입:8개
		//참조(reference)타입:주소값(4byte)
		
		boolean bool = false; //true
//		char c = 'c';
		byte bt = 127; // 2^7 -1;
		
		short s = 32767;  
		int i = 2147483647;		//정수
		long l = 555;	
		
		float f = 3.0f;		//리터럴 f,d
		double d2 = 5.0d;  	//소수점
		
		String aa = "hello";
		//String aa2 = new String("hello");
		System.out.println(aa);
		
		Ch02Var v$_2 = new Ch02Var();
		
		
		
		
		//상수 : final이 붙은 변수
		System.out.println(NOT_EDIT_NUM);
		
		//에러:상수는 값을 초기화한후 재할당못한다
		//NOT_EDIT_NUM = 2000;
		
		String str1 = null;
		String str2 = "";
		char ic = '\u0000';
//		char ic2 = ''; //에러
		String str3 = " ";
		//String에 어떠한 연산을 해도 String
		int h = 100;
		int z = 50;
		System.out.println(str3 + h + z);
		System.out.println(str3 + (h + z));
		
		
		
		
		
		//int보다 작은 크기의 타입들을 더하면 결과는 int
		char calph = 'A';
		System.out.println(calph+1);
		
		double dnum = 4.0f;
		float fnum = (float)4.0;
		int inum = 10;
		double dnum2 = 10;  //10.0
		int inum2 = (int)4.7;  //4
		
		String ssn1 = "920101-1234567";
		
				
		
		String str = "1112545";
		int res = Integer.parseInt(str);
				
		
		//캐스팅:형변환 (바꾸고싶은타입)
		System.out.println((char)(calph + 1));
		//기본타입8개중 boolean을 제외한 나머지는 서로 캐스팅가능
		boolean bl = true;
		
		//참조타입 <--> 기본타입 XXXXX 캐스팅불가
		String numstr = "11";
//		System.out.println((int)numstr);
		
		Boolean bw; 
		//Boolean.parseBoolean("true");
		Character cw;
		//
		Byte btw;
		
		Short sw;
		//Short.parseShort("14")
		Integer it;
		Long lw;
		
		Float fw;
		Double dw;
		double dp = Double.parseDouble("3.4");
		
		//참조타입 <--> 기본타입 Wrapper 클래스 사용
		int pint = Integer.parseInt("115");
		System.out.println(pint+5);
		
		String hanstr = "한";
		byte[] byteStr = hanstr.getBytes();
		for(int k=0; k<byteStr.length; k++) {
			System.out.print("==" + byteStr[k]);
		}
		char cDD = ' ';
		
		int 자바 = 10;
		System.out.println("=====>"+자바);
		
	}

}
