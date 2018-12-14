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
@WebServlet("/input_tag")
public class InputTagServlet extends HttpServlet {
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
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		String[] habit = request.getParameterValues("habit");
		//System.out.println(habit);
		if(habit != null) {
			for(int i=0; i<habit.length;i++)
				System.out.println(habit[i]);
		}
		String gen = request.getParameter("gen");
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		String ufile = request.getParameter("ufile");
		String tel = request.getParameter("tel");
		String content = request.getParameter("content");
		System.out.println(ufile); //path + aa.jpg
		System.out.println(bseq*2);
		
		//PrintWriter out = response.getWriter();
		//out.write("<font color='red'>ddddd</font>");
		//response.getWriter().append(uid).append(request.getContextPath());
		
		
		System.out.println("회원가입 ::: 	DAO.insert(1000)");
		
		ArrayList<String> mlist = new ArrayList<String>();
		mlist.add("아무개");
		mlist.add("홍길동");
		
		ArrayList<String> clist = new ArrayList<String>();
		clist.add("주전자");
		clist.add("노트북");
		
		request.setAttribute("KEY_STRING", "나이름");
		request.setAttribute("KEY_MLIST", mlist);
		request.setAttribute("KEY_CLIST", clist);
		request.getRequestDispatcher("/input_tag_result2.jsp")
		.forward(request, response);
		
		//input_tag_result.jsp?uid=kim&upw=111&list=mlist
		//response.sendRedirect("/input_tag_result.jsp?aaa="+uid+"&bbb="+upw+"&ccc="+mlist);
		
		
	}

}
