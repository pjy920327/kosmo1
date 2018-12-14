package com.kosmo.test222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MethodCommon {
	int point;
	String nation;
	HashMap map = new HashMap();
	
	//생정자 : 클래스이름과 동일한 메서드
	//     : 리턴이 없다..void xxx..2단구성
	//     : 컴파일러는 해당 클래스 컴파일 시 
	//       생성자가 단 한개도 없을 경우 기본 생성자를 만들어 준다.
	//기본 생성자(함수) = constructor
	//***** 초기화 ******
	public MethodCommon() {
		this.map.put("key_id", "lee");
		this.map.put("key_pw", "111");
		this.map.put("key_name", "이씨");
	}
	//파라미터가 있는 생성자
	//매개변수가 있는 생성자
	public MethodCommon(int pt, String nn) {
		this.point  = pt;
		this.nation = nn;
		this.map.put("key_id", "hong");
		this.map.put("key_pw", "222");
		this.map.put("key_name", "홍씨");
	}
	
	//맵의 키를 파라미터로 받아
	//그 값을 리턴하는
	//getValueByMap 메서드 생성
	public String getValueByMap(String key) {
		String value = (String)this.map.get(key);
		return value;
	}
	
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	//입력받은 파라미터 값을 전역변수에 넣는
	//XXXXXXXXXXXXXXXXXXXXXXXXX
	//set+변수명 메서드 생성
	
	
	
	
	
	public void setPoint(int pnt) {
		this.point = pnt;
	}
	public void setNation(String nat) {
		this.nation = nat;
		System.out.println(10);
	}
	
	
	//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	//전역변수값 리턴
	//get+변수명 메서드 생성
	
	public int getPoint() {
		return this.point;
	}
	public String getNation() {
		return this.nation;
	}
	
	//아이디,비번을 파라미터로 받아
	//이름을 리턴하는
	//login 메서드 생성
	public String login(String id, String pw) {
		String name = "";
		if(id.equals("lee") && pw.equals("111")) {
			name = "홍길동";
		}
		return name;
	}
	
	
	
	//double 타입 두개를 파라미터로 받아 
	//합을 리턴하는
	//add 메서드 생성
	public double add(double aa, double bb) {
		double res = aa + bb;
		return res;
		//return aa+bb;
	}
	
	//int[] 배열을 파라미터로 받아 
	//3번째   값을 리턴하는 
	//getItem 메서드 생성
	public int getItem(int[] xxx) {
		int aa = 0;
		if(xxx.length >= 3) {
			aa = xxx[2];
		}
		return aa;
//		return xxx[2];
	}
	
	
	//HashMap을 파라미터로 받아 
	//키값이 key_name인     값을 리턴 
	//getItembyMap 메서드 생성 XXXXXXXXX
	public String getItembyMap (HashMap xxxx) {
		String name = (String)xxxx.get("key_name");
		new ArrayList().addAll(Arrays.asList(new String[5]));
		return name;
	}
	
//	문자열 배열을 파라미터로 받아 XXXXXX
//	ArrayList로 변환해서 그 ArrayList 리턴
//	메서드명 : convertArrayToList XXXXXX
	public ArrayList convertArrayToList(String[] arr) {
		ArrayList list = new ArrayList();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
	
	//숫자 배열, 인덱스   를 파라미터로 받아
	//그 인덱스의 다음 데이터를 리턴하는
	//next 메서드  ...  -1
//	0 1 2 3 4  번째.. i+1
//	1 2 3 4 5  5
	public int next(int[] iarr, int i) {
		int res = 0;
		if (iarr.length > i+1)
			res =  iarr[i+1];
		else
			res = -1;
		return res;
		
//		int res = -1;
//		if (iarr.length > i+1)
//			res =  iarr[i+1];
//		return res;
	}
	
	
	
	
}
