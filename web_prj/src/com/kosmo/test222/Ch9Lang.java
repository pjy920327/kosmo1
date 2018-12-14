package com.kosmo.test222;

import java.io.IOException;

public class Ch9Lang  {
/**
dfjkdjfkld
 */
	static int num = 10;
	int num2 = 10;
	public static void main(String[] args) {
		String sss = "   aBcDe801130-  1234567-999 ";
		System.out.println("'"+sss+"'");  
		System.out.println(sss.charAt(1));  // 0
		System.out.println(sss.length());  //14
		System.out.println(sss.substring(0, 6));  //801130 
		System.out.println(sss.concat("000"));
		System.out.println(sss.indexOf("-"));
		System.out.println(sss.lastIndexOf("-"));
		System.out.println(sss.replace("-", "**"));
		String[] aa =sss.split("-");
		System.out.println(aa[1]);
		
		System.out.println(sss.toLowerCase());
		System.out.println(sss.toUpperCase());
		System.out.println(sss.trim());
		
		System.out.println("outout");
		System.err.println("errereerere");
		try {
			int aaa = System.in.read();
			System.out.println(aaa);
		} catch (IOException e) {
			System.out.println("에러가 났어요..");
			e.printStackTrace();
		}
		
		
		Ch9Lang lang = new Ch9Lang();
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		if(!str1.equals(str4)) { //값이같다
		//if(str1 == str2) {  	//주소가같다
		//if(str3 == str4) { 	//주소가다르다
			System.out.println();
		} else {
			System.out.println("222");
		}
		
		int a = 10;
		String astr = a+"";
		System.out.println(astr + 3);
		
		String cname = lang.getClass().toString();
		System.out.println(cname);
		
		String str = "aaaa";
		for(int i=0; i<10; i++) {
			str = str+i;
		}
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer("abc");
		for(int i=0; i<10; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		
		String res = sb.toString();
		System.out.println(res);
		
	}
	
	

}
