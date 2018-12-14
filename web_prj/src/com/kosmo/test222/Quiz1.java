package com.kosmo.test222;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


class BoardVO{
	private int bseq; 
	private String title;
	private String content;
	private ArrayList<ReplyVO> rlist;
	
	public ArrayList<ReplyVO> getRlist() {
		return rlist;
	}
	public void setRlist(ArrayList<ReplyVO> rlist) {
		this.rlist = rlist;
	}
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
//-------------------------------------------------
class ReplyVO {
	private int bseq; 
	private int rseq; 
	private String reply;
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
}

//-------------------------------------------------
class UserVO {
	private String gen;
	private int age;
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
//-------------------------------------------------
public class Quiz1 {

	
//	파라미터 : set
//	리턴 :  합
//	메서드 : add
public int add(HashSet<Integer> hs) {
	int sum = 0;
	Iterator<Integer> it = hs.iterator();
	while(it.hasNext()) {
		sum += (int)it.next();
	}
	return sum;
}

//	파라미터 : ArrayList
//	리턴 :  홀수합
//	메서드 : oddAdd
	public int oddAdd(ArrayList<Integer> list) {
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)%2 == 1)	
				sum += list.get(i);
		}
		return sum;
	}

//	파라미터 : ArrayList<ReplyVO>
//	리턴 :  ArrayList<BoardVO>
//	메서드 : boardList
//	조건BoardVO: bseq title content + ???
//	조건ReplyVO: bseq rseq reply
	public ArrayList<BoardVO> boardList(ArrayList<ReplyVO> rlist) {
		ArrayList<BoardVO> blist = new 
				ArrayList<BoardVO>();
		
		BoardVO vo = new BoardVO();
		vo.setBseq(1);
		vo.setTitle("제목");
		vo.setRlist(rlist);
		blist.add(vo);
		return blist;
	}

//	파라미터 : 주민번호 901130-1234567
//	리턴 :  나이, 성별
//	메서드 : getAge
	//public UserVO getAge(String ssn) {
	public HashMap<String, Object> getAge(String ssn) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		UserVO vo = new UserVO();
		String gen = "여";
		String[]  arr = ssn.split("-");
		String substr = arr[1].substring(0,1); 
		
		if( Integer.parseInt(substr)%2 == 1) {
			gen = "남";
		} 
		//현재년도
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		int age = year - Integer.parseInt("19"+ssn.substring(0,2));
		
		hm.put("KGEN", gen);
		hm.put("KAGE", age);
		return hm;
		
//		vo.setGen(gen);
//		vo.setAge(age);
//		return vo;
	}
	
	
//	파라미터 : 아이디 
//	리턴 :  (kim360!@) kim****@
//	        (namu04) nam**4
//	메서드 : getConvertId

	public String getConvertId(String userid) {
		char[] charr = userid.toCharArray();
		for(int i=0; i<charr.length; i++) {
			if(!(i<3 || i ==(charr.length-1)))
				charr[i] = '*';
		}
		return String.valueOf(charr);
//		int strlen = userid.length();
//		String id3 = userid.substring(0,3);
//		String idM = userid.substring(4,strlen-1);
//		String id1 = userid.substring(strlen-1, strlen);
		
	}
	
//	파라미터 : 파일경로+파일명
//	           (c:\etc\aa.txt)
//	리턴 :    확장자 txt
//	메서드 : getFileExt
	public String getFileExt(String path) {
		int pos = path.lastIndexOf(".");
		String ext = path.substring(pos+1, path.length());
		return ext;
	}

	
//-----------------------------------------------
	public static void main(String[] args) {
		Quiz1 quiz = new Quiz1();
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		int res1 = quiz.add(hs);
		System.out.println(res1); //12
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int res2 = quiz.oddAdd(list);
		System.out.println(res2); //4
		
		
		ArrayList<ReplyVO> rlist = new ArrayList<ReplyVO>(); 
		ReplyVO rvo = new ReplyVO();
		rvo.setBseq(1);
		rvo.setRseq(1);
		rvo.setReply("댓글1");
		rlist.add(rvo);
		ReplyVO rvo2 = new ReplyVO();
		rvo2.setBseq(1);
		rvo2.setRseq(2);
		rvo2.setReply("댓글2");
		rlist.add(rvo2);
		
		ArrayList<BoardVO> res3 = quiz.boardList(rlist);
		System.out.println("제목:" + res3.get(0).getTitle());
		ArrayList<ReplyVO> replyList = res3.get(0).getRlist();
		for(int i=0; i<replyList.size(); i++) {
			System.out.println("댓글:" + replyList.get(i).getReply());
		}
//		제목:제목
//		댓글:댓글1
//		댓글:댓글2
		
		
		HashMap<String, Object> hm = quiz.getAge("901130-1234567");
		System.out.println(hm.get("KGEN"));	//남
		System.out.println(hm.get("KAGE"));	//28

		
		
		String res5 = quiz.getConvertId("kim360!@");
		System.out.println(res5); //kim****@
		String res6 = quiz.getConvertId("namu04");
		System.out.println(res6); //nam**4
		
		
		String res7 = quiz.getFileExt("c:\\etc\\aa.txt");
		System.out.println(res7);
			
		
	}

}
