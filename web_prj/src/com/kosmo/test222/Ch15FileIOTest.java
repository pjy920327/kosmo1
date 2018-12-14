package com.kosmo.test222;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ch15FileIOTest {
	static int num = 100;
	
	
	public static void main(String[] args) {
		System.out.println(num);
		System.out.println(Ch15FileIOTest.num);
		
		
		//InputStream is = new InputStream();
		
		String source = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\aae.txt";
		String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\cp.txt";		
		
		File sfile = new File(source);
		File dfile = new File(dest);
		if(sfile.isDirectory() || dfile.isDirectory()) 
			System.exit(0);
		
		FileInputStream fis = null;		
		FileOutputStream fos = null;
//		BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos= null;
		try { 
			fis = new FileInputStream(sfile);
			fos = new FileOutputStream(dfile, true);
			
			dis = new DataInputStream(fis);
			dos = new DataOutputStream(fos);
			int num = 0;
			while(dis.available() > 0 ) {
				num=dis.readInt();
				System.out.println(num + "\t");
				//dos.writeInt(num);
			}
			
			
			/*
			bis = new BufferedInputStream(fis);  //다형성
			bos = new BufferedOutputStream(fos);
			int res = 0;
			while((res = bis.read()) != -1 ) {
				System.out.println((char)res);
				bos.write(res);
			}
			bos.flush(); //버퍼를 비우다
			*/
			
//			while(true) {
//				int res = fis.read();
//				System.out.println((char)res);
//				if(res == -1)
//					break;
//			}
			
			
			
			
			
			
//			byte[] b = {65,66,67,68};
//			int num = 65;
//			String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\cp.txt";
//			fos = new FileOutputStream(dest);
//			fos.write(num);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				bis.close();
//				bos.close();
				
				dis.close();
				dos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--done--");
	}

}
