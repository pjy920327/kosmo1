package com.kosmo.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileUploadServlet
 */
//@WebServlet("/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	 public void init(ServletConfig config) throws ServletException {
			String ss = config.getInitParameter("CFG");
			String xx = config.getServletContext().getInitParameter("CTX");
			System.out.println("fileup" + ss);
			System.out.println("fileup" + xx);
		}
	 
	 
//
//	public FileUploadServlet() {
//		super();
//
//	}


//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		//String fileName = request.getParameter("fname");
//		String fileName = "1.key";
//		String uploadDir = "C:/uploads";
//		String filePath = uploadDir + "/" + fileName;
//		
//		//MIME type of the file
//		ServletContext ctx = this.getServletContext();
//		String mimeType = ctx.getMimeType(filePath);
//		if (mimeType == null) {        
//			mimeType = "application/octet-stream";
//		}
//		System.out.println("MIME type: " + mimeType);
//
//		
//		//modifies HTTP header response
//		File downloadFile = new File(filePath);
//		FileInputStream inStream = new FileInputStream(downloadFile);
//		response.setContentType(mimeType);
//		response.setContentLength((int) downloadFile.length());
//
//		String headerKey = "Content-Disposition";
//		String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
//		response.setHeader(headerKey, headerValue);
//
//		
//		//send http response using output stream
//		OutputStream outStream = response.getOutputStream();
//		byte[] buffer = new byte[4096];
//		int bytesRead = -1;
//		while ((bytesRead = inStream.read(buffer)) != -1) {
//			outStream.write(buffer, 0, bytesRead);
//		}
//		inStream.close();
//		outStream.close();   
//	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		int maxSize = 10 * 1024 * 1024; // 10MB


		//------------------------------------------------
		// ServletConfig 객체 생성 / 값 추출
		ServletConfig ggg = this.getServletConfig();
		ServletContext ttt = this.getServletContext();
		System.out.println("CGF" + ggg.getInitParameter("CFG"));
		System.out.println("CTX" + ttt.getInitParameter("CTX"));
		
		//------------------------------------------------
		

		//upload폴더를 이클립스에서 만들었지만 이 폴더가 실제로는  플러그인 폴더로 재구성이 되서 실행
		//String uploadDir = request.getRealPath("/upload");
//		String uploadDir = ctx.getRealPath("/upload");
//		System.out.println(uploadDir);
		//D:\\workspaceJava\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\web\\upload
		
		//프로젝트를 재생성 하여도 변경되지 않는 경로 설정   (예)D:\\upload 
		//해당 경로는 WAS가 바로 접근 불가 -->  다운로드 전용 서블릿 필요
		String uploadDir = "C:/uploads";
		
//		try{
//			String format = "UTF-8";
//			MultipartRequest mRequest = new MultipartRequest(request, uploadDir, maxSize, format, new DefaultFileRenamePolicy());
//			String nameVal = mRequest.getParameter("name");
//			String ufileVal = mRequest.getFilesystemName("ufile");
//			
//			
//			response.sendRedirect("/fileupload/file_upload_result.jsp");
//
//		}catch(Exception e){
//			e.printStackTrace();
//		}



	}

}
