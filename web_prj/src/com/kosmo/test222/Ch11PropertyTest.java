package com.kosmo.test222;

import java.util.ArrayList;

public class Ch11PropertyTest {

	public static void main(String[] args) {
		
		ArrayList<MemberVO> list 
		     = new ArrayList<MemberVO>();
		
		MemberVO mvo = new MemberVO(); //A5
		mvo.setMseq(1);
		mvo.setMid("lee");
		mvo.setMpw("111");
		mvo.setMname("이씨");
		mvo.setMgubun("u");
		list.add(mvo);
		
		MemberVO mvo2 = new MemberVO();
		mvo2.setMseq(2);
		mvo2.setMid("lee2");
		mvo2.setMpw("1112");
		mvo2.setMname("이씨2");
		mvo2.setMgubun("u");
		list.add(mvo2);
		
		for(int i=0; i<list.size(); i++) {
			
			//MemberVO vo = (MemberVO)list.get(i);
			System.out.print(list.get(i).getMseq()+"\t");
			System.out.print(list.get(i).getMid()+"\t");
			System.out.print(list.get(i).getMpw()+"\t");
			System.out.print(list.get(i).getMname()+"\t");
			System.out.println(list.get(i).getMgubun());	
		}
		
		
		
		

	}

}
