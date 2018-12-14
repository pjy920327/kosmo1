package com.kosmo.test222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Ch15FileRWTest {

	public static void main(String[] args) {
		String source = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\aak.txt";
		String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\cp.txt";		
		
		//Reader r = new Reader();  //abstarct class new xxx
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//char[] carr = {'j','a','v','a'};
		//CharArrayReader car = 
		
		try {
			fr = new FileReader(source);
			fw = new FileWriter(dest);
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line = null;
			while((line=br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
			}
			
			bw.flush();
			
//			int res = 0;
//			while((res=br.read()) != -1) {
//				System.out.println((char)res);
//				bw.write(res);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("===done===");
		
		

	}

}
