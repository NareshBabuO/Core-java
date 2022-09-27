package com.xworkz.fire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet (loadOnStartup = 10,urlPatterns = "/Amku")
public class FireServlet extends HttpServlet {
	
	public FireServlet() {
		System.out.println("Created FireServlet using Default Constrcutor");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parameter=req.getParameter("aliyas");
		String parameter2=req.getParameter("Company");
		String parameter3=req.getParameter("Salary");
		
		System.out.println("running service in MoonServlet");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("</h1>").append("This Fire is Working")
		.append("<br>")
		.append("Name".concat(parameter))
		.append("<br>")
		.append("Company".concat(parameter2))
		.append("<br>")
		.append("Salary".concat(parameter3))
		.append("</body>")
		.append("</html>");


}
}
