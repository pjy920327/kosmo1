package com.kosmo.test222;

import com.kosmo.other.Ch07Parent;

//구현하다 : implements
public class Ch07InterfaceImpl 
				extends Ch07Parent
				implements Ch07Interface
				//implements Ch07Interface,  Ch07Interface2
				{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void parentInterMethod() {
		//500
		
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

}
