package com.servletlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class OnServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public OnServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String user=req.getParameter("uname");
		String password=req.getParameter("psw");
		if(user.equals("abhi")&&password.equals("1289")){
			RequestDispatcher rd=req.getRequestDispatcher("/home");
			rd.forward(req, res);
		}
		else{
			pw.println("wrong user");
		}
		pw.close();
		
	}

	
	

}
