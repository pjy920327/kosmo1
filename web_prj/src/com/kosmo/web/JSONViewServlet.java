package com.kosmo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class JSONListServlet
 */
@WebServlet("/view")
public class JSONViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String으로 들어온 경우
		//String empnostr = request.getParameter("empno");
		//int empno = Integer.parseInt(empnostr);
		
		Ch99JDBCImpl t = new Ch99JDBCImpl();
		Gson gson = new Gson();
		
		String jsonStr = request.getReader().lines().collect(Collectors.joining());	//전달된  Json데이터
		EmpVO evo2 = gson.fromJson(jsonStr, EmpVO.class);
		
		//ArrayList<EmpVO> list = t.empList("empno", empno);
		EmpVO evo = t.empView(evo2.getEmpno());
		String gsonStr = gson.toJson(evo);							//String변환
		System.out.println(gsonStr);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter(); 					//응답 데이터 타입:String
		out.println(gsonStr);
	}

}
