package com.kosmo.test222;

public class Ch07AbstractChild 
		extends Ch07AbstractClass 
{

	public void absFunc() {}
	
	public void logWrite() {}
	
	public void sms() {}
	
	public boolean ipinCheck(String pinNo) {
		//500
		return true;
	}
	
	public static void main(String[] args) {
//		Ch07AbstractClass ab = new Ch07AbstractClass();
//		boolean res = ab.ipinCheck("123456748");

	}

	@Override
	public void myPrint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sendEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void parentInterMethod() {
		// TODO Auto-generated method stub
		
	}

}
