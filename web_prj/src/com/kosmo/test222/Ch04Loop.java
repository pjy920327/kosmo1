package com.kosmo.test222;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Ch04Loop {
	public static void main(String[] a) throws InterruptedException {
		//for(_s_;조건(e);_증감_) { ... }
		//while(조건) { ... }
		//do{ ...} while(조건)
			for(int i=1; i<3; i++ ) {
				System.out.println(i);
			}
		
		for(int dan=2; dan<10; dan++) {
			System.out.println(dan+"단"); 
			for(int gob=1; gob<10; gob++) {
				System.out.print(dan + "*" + gob + "=" + (dan*gob) +"\t" );
				//Thread.sleep(100);
			}
			//System.out.print("\n");
			System.out.println();
		}
	
//		2단
////	2*1=2 2*2=4 2*3=6
//		3단
////	3*1=3 3*2=6 3*3=6
//		4단
////	4*1=4 4*2=8 4*3=6
		
			
//		int i=1;
//		for(  ;i<3; ) {
//			System.out.println(i);
//			 i=i+1;
//		}
		
//		//디버깅한다...
//		//버그:벌레
//		for(int i=3;i>0;i--) {
//			System.out.println(i);
//			myprint();
//			System.out.println("a"+i);
//		}
		
		String job = "SALES";
		int num =3;
		while(job == "SALES") {
			System.out.println("true");
			num--;
			if(num == 0) break;
		}
		System.out.println("===done===");
		
		int dan = 2;
		while(dan<=9) {
			System.out.println(dan);
			int gob = 1;
			while(gob<=9) {
				System.out.println(gob);
				gob++;	
			}
			dan++;
		}
		
		
		
		
		
		
//		int dan = 2;
//		while( true ) {
//			System.out.println(dan);
//			//------------
//			int gob = 1;
//			
//			while( true ) {
//				System.out.println(dan+"*"+gob);
//				gob++;
//				if(gob ==9) break;
//			}
//			//------------
//			dan++;
//			if(dan ==9) break;
//		}
//		for(int i=0; i<5; i++)
//			
//		int i=0;
//		for(;;) {
//		while(true) {
//		do {
//			System.out.println(i);
//		}while(true);
		
		
//		int score =0;
//		do {
//			System.out.println("성적:");
//			Scanner s  = new Scanner(System.in);
//			score = s.nextInt();
//			//if(line.equals("q")) break;
//		} while(score<95);
//		
//		
//		String line =null;
//		do {
//			System.out.println("메세지:");
//			Scanner s  = new Scanner(System.in);
//			line = s.nextLine();
//			//if(line.equals("q")) break;
//		} while(!line.equals("q"));
//		
//		
		//1~10까지의 합 출력
		String str = "";
		int sum = 0;
		for(int i=1; i<=10 ; i++) {
//			if(i==1) {
//				str = str + i;  //1
//			} else {
//				str = str + "+" + i; //1+2+3+4
//			}
//			str = str + (i + "+");
			if(i<10) {
				str += (i + "+");
			} else { 
				str += i;
			}
			sum = sum + i;
		}
		System.out.println("계산식" + str);
		System.out.println("합" + sum);
		
		int nums=1;
		while(nums<=10) {
//			num = num+1;
			nums += 1;
			System.out.println(""+nums+"+");
		}
		System.out.println(nums);
		
//		*
//		**
//		***
//		****
//		*****
		String strs = "";
		for(int s=0; s<5; s++) {
			strs += "*";
			System.out.println(strs);
		}
		
		for(int s=0; s<5; s++) {
			for(int k=0; k<5; k++) {
				if(k<=s)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	} //end of main()
	
	public static void myprint() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
	
}
