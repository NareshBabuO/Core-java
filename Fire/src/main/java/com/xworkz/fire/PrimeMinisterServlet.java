package com.xworkz.fire;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (loadOnStartup = 5,urlPatterns = "/pm")
public class PrimeMinisterServlet extends HttpServlet {
	
	public PrimeMinisterServlet() {
		System.out.println("Creating PrimeMinister Servlet using Default Constructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in PrimeMinister");
		//req.getParameter("")
		resp.setContentType("text/html");
		String name=req.getParameter("Name");
		String country=req.getParameter("Country");
		String birth=req.getParameter("birthday");
		String mStatus = req.getParameter("MStatus");
		String party = req.getParameter("Party");
		String gender = req.getParameter("Gender");
		String period = req.getParameter("Period");
		String time = req.getParameter("time");
		
		req.setAttribute("Name", name);
		req.setAttribute("Country",country);
		req.setAttribute("BirthDate",birth);
		req.setAttribute("MarriedStatus",mStatus);
		req.setAttribute("Party_as",party);
		req.setAttribute("Gender",gender);
		req.setAttribute("Period",period);
		req.setAttribute("Times",time);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/Success.jsp");
		dispatcher.forward(req, resp);
		
	}
	

}
