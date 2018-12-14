package com.kosmo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class JSONListServlet
 */
@WebServlet("/list")
public class JSONListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String empno = request.getParameter("empno");
		Ch99JDBCImpl t = new Ch99JDBCImpl();
		Gson gson = new Gson();
		
		ArrayList<EmpVO> list = t.empList();
				
		String gsonStr = gson.toJson(list);							//String변환
		System.out.println(gsonStr);

		PrintWriter out = response.getWriter(); 					//응답 데이터 타입:String
		out.println(gsonStr);
	}

}
