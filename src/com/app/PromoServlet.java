package com.app;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PromoServlet extends GenericServlet{

	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		

		String val=req.getParameter("mny");
		double mny=Double.parseDouble(val);
		
		double disc = 0;
		
		
		if(mny > 1 && mny<= 1000) {
			
			disc=10.0;
			
		}else if (mny>1001 && mny<=10000) {
			disc=20.0;
		}else if (mny>10001) {
			disc=30.0;
		}
		
		req.setAttribute("mrp", mny);
		req.setAttribute("dicamt", disc);
		
		RequestDispatcher rd =   req.getRequestDispatcher("/payment");
		
		rd.forward(req, resp);
	}

}
