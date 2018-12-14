package com.kosmo.test222;

import java.util.concurrent.SynchronousQueue;

public class Ch05Array {

	public static void main(String[] args) {
		//타입[] ____ = new 타입[크기];
		//numArr[0] ~ numArr[크기-1]		
		//Hello _h_ = new Hello();
		//x번째 : 인덱스 x
				
		//선언 + new 생성  후 --> 사용
		int[] numArr; 
		numArr = new int[5];
		
		int[] numArr2 = new int[3];
		
		int[] numArr3 = new int[]{10,30,50};
		int[] numArr4 = new int[4];
		
		numArr4 = new int[]{10,30,50};
		int[] numArr5 = new int[3];
		numArr5[0] = 10;
		numArr5[1] = 30;
		numArr5[2] = 50;
		
		
		System.out.println(numArr);
		
//		Ch02Var[] crr = new Ch02Var[3];
//		crr[0] crr[1] crr[2]
		Ch02Var c1 = new Ch02Var();
		Ch02Var c2 = new Ch02Var();
		Ch02Var c3 = new Ch02Var();   
		//new Ch02Var()[3]; 문법주의 () <--빼고...
		//Ch02Var[] carr = new Ch02Var()[3];
		
		System.out.println(c1.point);
		c1.point = 5000;
		System.out.println(c2.point);
		//--------------
		System.out.println(c1.point2);
		c1.point2 = 5000;
		System.out.println(c2.point2);
		
		
		Ch02Var[] carr = new Ch02Var[3];
		
		for(int i=0; i<3; i++) {
			carr[i] = new Ch02Var();
			System.out.println(carr[i]);
		}
		System.out.println(carr[0].point2);
		carr[0].point2 = 3000;
		System.out.println(carr[1].point2);
//		
//		
//		
		int[] aa1 = new int[] {1,2,3,4,5};
		int[] aa2 = {1,2,3,4,5};
		
		//String[] sarr = new String[]{"aa", "bb"};
		String[] sarr = {"aa", "bb"};
		
		//char[] charr = new char[3];
		//char[] charr = new char[]{'a','b','c'};
		char[] charr = {'a','b','c'};
		System.out.println(charr[1]);
		//Character[]
		
//		String str1 = new String("hello");
//		String[] str1 = new String[]{"hello","bb","cc"};
		
//		String[] str2 = {"hello","bb","cc"};
//		String[] str2 = {"hello"};
		
		char[] str3 = new char[]{'h','e','l','l','0'};
		
		String[] strArr1 = new String[2];
		String[] strArr2 = new String[]{"aa", "bb"};
		
		System.out.println(strArr2[0]);
		boolean[] brr = new boolean[] {true,true,false};
		
//		String name = "lkh";
//		String name = new String("lkh");
//		char[] name = new char[]{'l','k','h'};
//		String name = "lkh";
		
//		int score[] = new int[3];
//		int score[] = new int[] {88,77,88};
		int score1[] = {88,77,88};
		int score2[] = {55,66,44};
//		1차원배열 = 배열 = [] 갯수				
//		arr[1][][]  = { 
//						{
//							{88,77,88}, 
//							{88,77}, 
//							{88}
//						},
//						 {
//							{88,77,88}, 
//							{}, 
//							{88,77,88}
//						}
//				  };
//				
		char[] aa = {'a','b'};
		int[] ddd = {1,2};
		Ch02Var[] ccc = new Ch02Var[2];
		System.out.println(ddd + "=====");
		
		int[] arrnum = {1,2};
		String str = "ab";
		System.out.println(aa); //ab
		
int[][]score = 
		{
			{88,77,88}, 
			{88,77}, 
			{88}
		};
			
int[] arr = {88,77};


System.out.println(score[1].length);			
		               // 0 1 2 3 4
	int[] dan = new int[]{1,2,3,4,5}; 
	for(int i=0;i<3;i++) {
		System.out.println(dan[i+2]);
	}

		for(int i=1; i<6; i++) {
			System.out.println(i);
		}
		//{1,2,3,4,5};
//		int[] dan = new int[]{2,3,4,5,6}; 
//		int[] gob = new int[]{1,2,3,4,5,6,7,8,9}; 
//		for(int d=0;d<dan.length;d++) {
//			System.out.println(dan[d]+"단");
//			for(int g=0;g<gob.length;g++) {
//				System.out.println(gob[g]);
//			}
//		}
		
		
		int[] stu = {100,84,93,100};
		//for : 총합, 평균 출력
		//stu.length
		int sum = 0;
		for(int i=0; i<stu.length; i++) {
			//sum = sum + stu[i];
			sum += stu[i];
		}
		System.out.println("총합"+sum);
		System.out.println("평균"+ sum/(double)stu.length);
		
		String[] astr2 = new String[1];
		String[] oarr = new String[]{"ABC"};
//		astr2[0] = {"ABC"};

//--------------------------------------------
//		String[] astr = new String[] {"ABCDE"};
		String[] astr = {"ABCDE"};
		for(int i=0; i<astr.length; i++) {
			System.out.println(astr[i]);
		}
		
		String strs = "ABCDE";
		for(int i=0; i<strs.length(); i++) {
			char c = strs.charAt(i);
			System.out.println(c);
		}
		
		char[] eqstrs = strs.toCharArray(); 
		System.out.println(eqstrs);
		//-----------------------------------
		
					
//		int[][] jtScore = 
//				{
//					{100,	90,	80,1} ,// 271
//					{88,	87,	86,1} ,// 261
//					{44,	47,	49,1} ,// 146
//					//232    224 215 3    678
//				};
		int[][] jtScore = 
			{
				{1,		2,	3	, 4} ,// 271
				{11,	12,	13	,14} ,// 261
				{21,	22,	23	,24} ,// 146
				//232    224 215 3    678
			};
		
//		[[1,	2, 		3, 		4, 		10], 
//		 [11,	12, 	13, 	14, 	50], 
//		 [21, 	22, 	23, 	24, 	90], 
//		 [33, 	36, 	39, 	42, 	150]]
				
		int[][] jtcp = new int[jtScore.length+1][jtScore[0].length+1];
		for(int j=0; j<jtScore.length; j++ ) {
			for(int k=0; k<jtScore[j].length; k++ ) {
				jtcp[j][k] = jtScore[j][k];
				jtcp[j][jtScore[j].length] += jtScore[j][k];  	//가로합
				jtcp[jtScore.length][k] += jtScore[j][k];		//세로합
			}
			jtcp[jtScore.length][jtScore[j].length] += jtcp[j][jtScore[j].length];		
		}
		
//		1.각 학생별 평균점수 계산
		for(int i=0;i<jtScore.length; i++) {
			int stusum = 0;
			//System.out.println(jtScore[i]);
			for(int s=0; s<jtScore[i].length; s++) {
//				System.out.println(jtScore[i][s]);
				stusum = stusum + jtScore[i][s];
			}
			System.out.println("---학생별평균점수:" + stusum/jtScore[i].length);
		}
		
		//2.각 회차별 평균점수 계산
		for(int i=0;i<jtScore[0].length; i++) {
			int sum1 = 0;
			for(int s=0; s<jtScore.length; s++) {
				sum1 += jtScore[s][i];
			}
			System.out.println(i+1+"회차:" + sum1 / jtScore.length);
		}
		
		int[] arrdd[];
		//System.out.println(arrdd);
		
			
		
		int[] answer = { 1,4,4,3,2 };
//		1 : *
//		4 : ****
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + ":");
			for(int s=1;s<=answer[i];s++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
	}

}
