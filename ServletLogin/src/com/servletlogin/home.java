package com.servletlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String user=req.getParameter("uname");
		String password=req.getParameter("psw");
		PrintWriter pw=res.getWriter();
		pw.print("welcome"+user);
	   
	}

}
