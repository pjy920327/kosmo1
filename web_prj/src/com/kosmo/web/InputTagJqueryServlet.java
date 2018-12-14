package com.kosmo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputTagServlet
 */
@WebServlet("/input_tag_jquery")
public class InputTagJqueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
//		http://localhost:8088/input_tag
//		?uid=&
//		upw=&
//		habit=book&
//		habit=mnt&
//		gen=f&
//		bseq=1&
//		ufile=&tel=011&content=%EC%97%AC%EA%B8%B0%EA%B8%80%EC%94%A8..&x=36&y=16
//		
//	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String prm = "";
		
		String uid = request.getParameter("uid");
		prm += "uid="+uid;
				
		String upw = request.getParameter("upw");
		prm += "&upw="+upw;
		
		String[] habit = request.getParameterValues("habit");
		//System.out.println(habit);
		if(habit != null) {
			for(int i=0; i<habit.length;i++) {
				System.out.println(habit[i]);
				prm += "&habit="+habit[i];
			}
		}
		
		String gen = request.getParameter("gen");
		prm += "&gen="+gen;
		
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		prm += "&bseq="+bseq;
		
		String ufile = request.getParameter("ufile");
		prm += "&ufile="+ufile;
		
		String tel = request.getParameter("tel");
		prm += "&tel="+tel;
		
		String content = request.getParameter("content");
		prm += "&content="+content;
		
		System.out.println("회원가입 ::: 	DAO.insert(1000)");
		
		
		System.out.println("/input_tag_result3.jsp?"+prm);
		response.sendRedirect("/input_tag_result3.jsp?"+prm);
		
		
	}

}
