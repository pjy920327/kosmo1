package com.kosmo.test222;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodCallTest {
//javac MethodCallTest.java
//      MethodCallTest.class 
//java MethodCallTest	
// 오버로딩 : over loading	
//	:하나의 클래스안에서 n개의 메서드 관계 : 오버로딩
//	이름이 같고 , 매개변수의 타입이 다른것
	
//	public static void main(double a, int b) {
//		System.out.println("dddd");
//	}	
//	public static void main(int c) {
//		System.out.println("HELLO");
//	}
	public static void main(String[] dfdfd) {
		//1. static static
		//제 클래스이름.메서드명
		//(내 클래스이름.)메서드명 
		//MethodCommon.add(4.0, 5.0);
		MethodCommon mc =  new MethodCommon();
		String res9 = mc.getValueByMap("key_pw");
		System.out.println(res9); //111
		
		MethodCommon mc2 = new MethodCommon(1000, "japan");
		String res10 = mc2.getValueByMap("key_id"); //222
		System.out.println(res10); //222
		
		double res = mc.add(4.0, 5.0);
		
		System.out.println(mc.add(4.0, 5.0));
		System.out.println(res);
		
		int[] iarr = new int[] {1,2};
		int res2 = mc.getItem(iarr);
		System.out.println(res2);
		
		HashMap map = new HashMap();
		map.put("key_name", "아무개");
		map.put("key_age",25);
		String res3 = mc.getItembyMap(map);
		System.out.println(res3);
		
		String[] sarr = new String[]{"aa","bb","cc"};
		ArrayList reslist = mc.convertArrayToList(sarr);
		System.out.println(reslist.size());
		for(int i=0; i<reslist.size(); i++) {
			System.out.println(reslist.get(i));
		}
		
		int[] iarry = new int[]{1,2,3,4,5};
		int res5 = mc.next(iarry, 4);
		System.out.println(res5);
		
		
		
//		mc.setPoint(9999);
//		mc.setNation("jp");
		
		int res7 = mc.getPoint();
		System.out.println(res7);
		
		
		
		String res8 = mc.getNation();
		System.out.println(res8);
		
		String vname = mc.login("kim", "111");
		System.out.println(vname);
		
		
		
		//회귀 알고리즘
//		1-2+3-4+5+6-7... 50
//		int sum = 0;
//		int i = 1;
//		while(sum >50) {
//			sum += i;
//			i = (-1)*i++;
//		}
//		int s = 5;
//		s *= -1;
//		System.out.println(s);
		
//		for(int i=0 ,j=0; i<10 && j<10; i++, j++) {
//			System.out.println(i + "," + j);
//		}
		
//		System.out.println("시작");
//		MethodCallTest.main("111");
		
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += Integer.parseInt(arr[i]);
//		}
//		System.out.println(sum);
	}

}
