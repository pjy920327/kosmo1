package com.kosmo.test222;

//http://propedit.sourceforge.jp/eclipse/updates/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Properties;

public class Ch00File {

	public static void main(String[] args) {
		String fileName = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\db.properties";
		try {
			//Reader reader = Resources.getResourceAsReader(fileName);
			//InputStream is = new Ch00File().getClass().getClassLoader().getResourceAsStream(fileName);
			//properties.load(is);
			
			Properties properties = new Properties();
			
			properties.load(new FileInputStream(fileName));
			System.out.println(properties.getProperty("username"));
			System.out.println(properties.getProperty("password"));

			
			  
			properties.setProperty("DUMY", "한글");
			System.out.println(properties.getProperty("DUMY"));
			
			FileOutputStream fos = new FileOutputStream(fileName);
			properties.store(new FileOutputStream(fileName), "DB Propertis");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
