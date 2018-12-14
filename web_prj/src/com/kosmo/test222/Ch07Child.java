package com.kosmo.test222;

import com.kosmo.other.Ch07Other;
import com.kosmo.other.Ch07Parent;

public class Ch07Child extends Ch07Parent {
    		static int pnum = 99;
	public        int cpoint = 1000;
//	public static int ppoint = 5000;

	//overriding : 오버라이딩
	//메서드의 선언부는 같고 바디를 변경 or [그데로사용xxxx]한 것
	//접근제어자는 같거나 커진다
	//예외는 부모가 가지고 있는 예외보다 같거나 적다
	//@Override
	public void parentPrint()   {
		boolean res = true;
		System.out.println("p5");
	} 
	public void childFunc() {
		System.out.println("childFunc"); 
	}
	public static void main(String[] args) {
		//Ch07Parent p = new Ch07Parent();
		
		Ch07Other o = new Ch07Other();
		o.myPrint();
		System.out.println(Ch07Other.otherNum);
		System.out.println(o.otherNum);
	
		//System.out.println(pnum);
		
		Ch07Child2 c2 = new Ch07Child2();
		int res = Ch07Child2.add();
		System.out.println(res);

	}

}
