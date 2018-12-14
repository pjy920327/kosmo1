package com.kosmo.test222;

public class Ch04If {

	public static void main(String[] args) {

//		int sal = 6000;
//		if(sal>2000)  
//			System.out.println("a");
//		
//		 else 
//			System.out.println("b");
//		
//			System.out.println("b");
//			System.out.println("b");
//			System.out.println("b");
		

		//where empno=7733 or sal>2000
		int empno = 7733;
		int sal = 2000;
		//and or --> && ||
		//DB   : empno=7733 and sal>2000
		//java : empno==7733 && sal>2000
		if(empno==7733 || sal>2000) {
			System.out.println("true 그렇다");
		} else {
			System.out.println("false 아니다");
		}

		//decode(deptno,
		//		10,'10번부서',
		//		20,'20번부서',
		//		30,'30번부서',
		//		   '해당없음')

		int deptno = 10;
		if(deptno == 10) {
			System.out.println("10번부서");
		} else if(deptno == 20) {
			System.out.println("20번부서");
		} else if(deptno ==30) {
			System.out.println("30번부서");
		} else {
			System.out.println("해당없음");
		}


		int comm = 70;
		//		switch(comm) {
		//		case 90,91,92,93: ㅌㅌㅌ
		//			System.out.println("90크다");
		//			//break;
		//		case 80: case 81: case 82:
		//			System.out.println("20");
		//			//break;
		//		default:
		//			System.out.println("해당없음");
		//	}



		if(comm >= 90) {
			System.out.println("90");
		} else if(comm >= 80) {
			System.out.println("80");
		} else {
			System.out.println("해당없음");
		}

		//		create table test(
		//		  bseq number primary key,
		//		  regdate date default sysdate
		//		)
		switch(deptno) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		default:
			System.out.println("해당없음");
			//break;
		}

		System.out.println("===done===");


	}

}
