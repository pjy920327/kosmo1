package com.kosmo.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CtxServlet
 */
@WebServlet("/CtxServlet")
public class CtxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    public void init(ServletConfig config) throws ServletException {
		String ss = config.getInitParameter("CFG");
		String xx = config.getServletContext().getInitParameter("CTX");
		System.out.println("ctxServlet:" + ss);
		System.out.println("ctxServlet:" + xx);
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("PATHDIR " + this.getServletContext().getInitParameter("PATHDIR"));
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
