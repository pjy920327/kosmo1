package com.kosmo.test222;

public interface Ch07Interface 
		extends Ch07InterfaceParent {
	//public void parentInterMethod();
	
	//상수만 올 수 있다.
	//모든 변수에 public final static 키워드가 붙는
	public final static int NUM = 100;
	
	//모든 메서드는 추상(바디가 없는) 메서드이어야 한다.
	//public void myPrint() {} //에러
	//모든 메서드에 public abstract 키워드가 붙는다.
	public abstract void myPrint();
	public abstract int sendEmail(String email);
}
