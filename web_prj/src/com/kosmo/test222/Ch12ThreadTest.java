package com.kosmo.test222;


class MyThread implements Runnable { //extends Thread {
	//public MyThread() {super();}
	String tname;
	public MyThread(String tname) {
		this.tname = tname;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<100; i++) {
				Thread.sleep(10);
				System.out.println("일하는중..."+ this.tname);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class Ch12ThreadTest  {
	public static void main(String[] args) {
//		MyThread man1 = new MyThread("man111");	
//		man1.start();
//		man1.run("man111");  XXXXXXXXXXXXXXXXXXXXX
//
//		new MyThread("man222").start();
		
		Runnable man1 = new MyThread("man111"); //다형성
		Thread t1 = new Thread(man1);
		t1.setPriority(Thread.MIN_PRIORITY);  //1
		t1.start();
		
		Thread t2 = new Thread(new MyThread("man222"));
		t2.setPriority(Thread.MAX_PRIORITY);  //10
		t2.start();
		
		
	}

}
