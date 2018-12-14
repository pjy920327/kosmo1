package com.kosmo.test222;

public class Ch02LocalVar {
	int num;
	public void myprint() {
		int num = 9;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		int num = 555;
		Ch02LocalVar v = new Ch02LocalVar();
		v.myprint();
		
		Ch02LocalVar v2 = new Ch02LocalVar();
		v2.myprint();
	
		
		System.out.println(num);
		System.out.println(v.num);
		//System.out.println(this.num);
		
	}
}
