package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PaymentServlet extends GenericServlet{

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		Object amt=req.getAttribute("mrp");
		
		double d1=(Double)amt;
		
		
		Object disc=req.getAttribute("dicamt");
		
		double d2=(Double)disc;
		
		double dicv=d1*d2/100;
		double fnamt=d1-dicv;
		
		
		PrintWriter out=res.getWriter();
		
		out.println("-----payment details----");
		
		out.println(d1);
		out.println(dicv);
		out.println(fnamt);
				
	}

}
