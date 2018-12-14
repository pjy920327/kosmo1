package com.kosmo.test222;

import java.util.ArrayList;

class Cart {
	ArrayList<CartVO> clist = new ArrayList<CartVO>();
	public Cart() {
		//샘플데이터 생성
		for(int i=0; i<5; i++) {
			CartVO cvo = new CartVO();
			cvo.setCseq(i);
			cvo.setUserid("kim"+i);
			cvo.setGcode("gcode_12345"+i);
			cvo.setGname("상품명"+i);
			this.clist.add(cvo);
		}
	}
	public void cartListView() {
		for(CartVO vo : this.clist) {
			System.out.print(vo.getCseq() + "\t");
			System.out.print(vo.getGcode() + "\t");
			System.out.print(vo.getGname() + "\t");
			System.out.print(vo.getUserid() + "\n");
		}
	}
	public void cartListView(ArrayList<CartVO> listPrm) {
		for(CartVO vo : listPrm) {
			System.out.print(vo.getCseq() + "\t");
			System.out.print(vo.getGcode() + "\t");
			System.out.print(vo.getGname() + "\t");
			System.out.print(vo.getUserid() + "\n");
		}
	}
	public ArrayList<CartVO> cartList() {
		return this.clist;
	}
	
//	-- Cart class에 작성 : 상품담기
//	파라미터 : 상품코드(포맷 : gcode_6자리숫자)
//	리턴 :  성공/실패 
//	메서드 : addCart
	public boolean addCart(String gcode) {
		CartVO cvo = new CartVO();
		cvo.setCseq(99);
		cvo.setUserid("kim1");
		cvo.setGcode(gcode);
		cvo.setGname("신상(바이오노트북)");
		this.clist.add(cvo);
		return true;
	}
	
//	-- Cart class에 작성 : 상품목록
//	파라미터 : userid
//	리턴 :  상품목록 
//	메서드 : cartList
	public ArrayList<CartVO> cartList(String uesrid) {
		ArrayList<CartVO> list = new ArrayList<CartVO>();
		for(int i=0; i<this.clist.size(); i++) {
			if(this.clist.get(i).getUserid().equals(uesrid)) {
				list.add(this.clist.get(i));
			}
		}
		return list;
	}	
}

class CartVO { 	
	private int cseq; 
	private String userid; 
	private String gcode; //(상품코드) 
	private String gname; //(상품명)
	public int getCseq() {
		return cseq;
	}
	public void setCseq(int cseq) {
		this.cseq = cseq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getGcode() {
		return gcode;
	}
	public void setGcode(String gcode) {
		this.gcode = gcode;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}	
}
//--------------------------------------------------
class Pay {
	ArrayList<PayVO> plist = new ArrayList<PayVO>();
	public Pay() {
		//샘플데이터 생성
		for(int i=0; i<5; i++) {
			PayVO pvo = new PayVO();
			pvo.setPseq(i);
			pvo.setOrderno("123456"+i);
			pvo.setPrice(10000);
			pvo.setUserid("kim"+i);
			this.plist.add(pvo);
		}
	}	
	public void payListView() {
		for(PayVO vo : this.plist) {
			System.out.print(vo.getPseq() + "\t");
			System.out.print(vo.getOrderno() + "\t");
			System.out.print(vo.getPrice() + "\t");
			System.out.print(vo.getUserid() + "\n");
		}
	}
	public void payListView(ArrayList<PayVO> listPrm) {
		for(PayVO vo : listPrm) {
			System.out.print(vo.getPseq() + "\t");
			System.out.print(vo.getOrderno() + "\t");
			System.out.print(vo.getPrice() + "\t");
			System.out.print(vo.getUserid() + "\n");
		}
	}
	public ArrayList<PayVO> payList() {
		return this.plist;
	}
	
//-- Pay class에 작성 : 결제
//	파라미터 : 결제금액
//	리턴 :  성공/실패 
//	메서드 : pay
	public boolean pay(int price) {
		PayVO pvo = new PayVO();
		pvo.setPseq(99);
		pvo.setOrderno("123499");
		pvo.setPrice(price); //-------------------
		pvo.setUserid("kim1");
		this.plist.add(pvo);
		return true;
	}
	
//	-- Pay class에 작성 : 결제목록
//	파라미터 : userid
//	리턴 :  결제목록 
//	메서드 : payList
	public ArrayList<PayVO> payList(String userid) {
		ArrayList<PayVO> list = new ArrayList<PayVO>();
		for(int i=0; i<this.plist.size(); i++) {
			if(this.plist.get(i).getUserid().equals(userid)) {
				list.add(this.plist.get(i));
			}
		}
		return list;
	}
	
//	-- Pay class에 작성 : 우수회원선정(사용자별 총 결제금액)
//	파라미터 : userid
//	리턴 :  총결제금액 
//	메서드 : payPrice
	public int payPrice(String userid) {
		int sum = 0;
		for(int i=0; i<this.plist.size(); i++) {
			if(this.plist.get(i).getUserid().equals(userid)) {
				sum +=  this.plist.get(i).getPrice();
			}
		}
		return sum;
	}
}
class PayVO {
	private int pseq;
	private String userid;
	private String orderno; //(주문번호)
	private int price;		//(결제금액)
	public int getPseq() {
		return pseq;
	}
	public void setPseq(int pseq) {
		this.pseq = pseq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}
//--------------------------------------------------
public class Quiz22 {

	//	파라미터 : Cart 또는 Pay
	//	리턴 :  payList() 또는 cartList() 호출 결과
	//	메서드 : myPageView
	public ArrayList myPageView(Object o) {
		ArrayList list = new ArrayList();
		if(o.getClass().getSimpleName().equals("Cart")) {
			Cart c = (Cart)o;
			list = c.cartList();
		} else if(o.getClass().getSimpleName().equals("Pay")) {
			Pay p = (Pay)o;
			list = p.payList();
		}
		return list;
	}
	
	
	public static void main(String[] a) {
		Quiz22 quiz = new Quiz22();
		
		Cart c = new Cart();
		System.out.println("\n카트 초기데이터-----------------------");
		ArrayList<CartVO> list0 = quiz.myPageView(c);
		//ArrayList<CartVO> list0 = c.cartList();
		c.cartListView(list0);
		
		System.out.println("\ngcode_000000 카트담기-----------------------");
		boolean res2 = c.addCart("gcode_000000");
		System.out.println("카트담기결과:"+res2);
		c.cartListView();
		
		System.out.println("\nkim1 카트목록 -----------------------");
		ArrayList<CartVO> res3 = c.cartList("kim1");
		c.cartListView(res3);
		
	
		
		Pay p = new Pay();
		System.out.println("\n결제 초기데이터-----------------------");
		ArrayList<PayVO> list1 = quiz.myPageView(new Pay());
		//ArrayList<PayVO> list1 = p.payList();
		p.payListView(list1);
		
		
		System.out.println("\nkim1 3680000 결제-----------------------");
		boolean res5 = p.pay(3680000);
		System.out.println("결제결과:" + res5);
		p.payListView();
		
		
		System.out.println("\nkim1 결제목록-----------------------");
		ArrayList<PayVO> res6 = p.payList("kim1");
		p.payListView(res6);
		
		System.out.println("\nkim1 총 결제금액-----------------------");
		int res7 = p.payPrice("kim1");
		System.out.println("총결제금액:" + res7);
	}

}
