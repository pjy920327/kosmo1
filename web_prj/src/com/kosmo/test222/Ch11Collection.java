package com.kosmo.test222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ch11Collection extends Object {

	public static void main(String[] args) {
	
//		---------------------------------
//		배열 {	arr[0] = "aa";
//		        syso(arr[0])
//		---------------------------------
//		리스트       list.add("aa");
//		        list.get(i)
//		---------------------------------
//		셋          	set.add("aa")
//		        iterator.next()
//		---------------------------------
//		맵          	map.put("k","aa")
//		        map.get("k")
//		---------------------------------

		ArrayList<HashMap<String,String>> mlist 
		= new ArrayList<HashMap<String,String>>();
		for(int i=0; i<2; i++) {
			HashMap<String,String> map1 
			= new HashMap<String,String>();
			map1.put("name", "lee"+i);
			map1.put("age", i+10+"");
			mlist.add(map1);
		}
		
		System.out.println("총회원수:" + mlist.size());
		for(int i=0; i<mlist.size();i++) {
			HashMap<String,String> hm = mlist.get(i);
			String v = hm.get("name");
			System.out.println(v);
			System.out.println(hm.get("name")  + "\t" 
			+ mlist.get(i).get("age"));
		}
		
		
		//((HashMap)mlist.get(0)).get("name")
		
//		char c = 'A';  //65
//		char res = (char)(c + 1);
		
		
		
		
		
		
		
		
		int[] numarr = new int[]{1,2,3};
		Ch02Var chVar = new Ch02Var();
		
		//***************************************
		//초기 사이즈가 있다/없다.
		ArrayList list = new ArrayList();
		Object[] arr = new Object[5];
		//***************************************
		
		list.add("aa");   //arr[0] = "aa";
		list.add("bb");   //arr[1] = "bb";
		list.add(69);	  //arr[2] = 69;
		list.add(numarr); //arr[3] = numarr;
		list.add(chVar);  //arr[4] = chVar;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
				
		int[] res = (int[])list.get(3); //numarr
		//int[] rr = (int[])arr[3];
		System.out.println(res.length);
		
		
		
		Ch02Var res2 = (Ch02Var)list.get(4); //chVar
		//Ch02Var rrr = (Ch02Var)arr[4];
		System.out.println(res2.point2);
		
		String res3 = (String)list.get(1); //aa
		//String rrrr = (String)arr[1];
		System.out.println(res3);
		
		int res4 = (int)list.get(2); //69
		//int rrrrr = (int)arr[2];
		System.out.println(res4);
		
		
		//------------------------------------------
		HashSet set  = new HashSet();
		Ch02Var ccc = new Ch02Var();
		
		set.add("1");
		set.add("1");
		set.add("3");
		System.out.println(set);  //[1, 3]
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(int i=0; i<set.size();i++) { XXXXXXXXXX
//		}
		
		//---------------------------------------
		
		HashMap map = new HashMap();
		//The method put(Object, Object) 
		map.put("name" , "lkh");
		map.put("age"  , 20);
		map.put("arr"  , numarr);
		map.put(1      , chVar);
		
//		for(int i=0; i<map.size(); i++) {
//			System.out.println(map.get("key"+i));
//		}
							//map[0] map.get(0)	
		String mres1  = (String)map.get("name");
		int mres2 	  = (int)map.get("age");
		int[] mres3   = (int[])map.get("arr");
		Ch02Var mres4 = (Ch02Var)map.get(1);
		System.out.println(mres1);
		
		
		
		
		
		
		
		
		
		
	}

}
