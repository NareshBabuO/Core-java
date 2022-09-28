package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.company.dto.CompanyDTO;

@WebServlet (loadOnStartup = 10, urlPatterns = {"/company","/show details"})
public class CompanyServlet extends HttpServlet {
	
	public CompanyServlet() {
		System.out.println(getClass().getSimpleName());
	}
	private List<CompanyDTO> dtos = new ArrayList<CompanyDTO> ();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost Method SuccessFully");
		resp.setContentType("text/html");
		String name=req.getParameter("Name");
		String founder=req.getParameter("Founder");
		String since=req.getParameter("Since");
		String employees=req.getParameter("employees");
		String address=req.getParameter("Address");
		String business=req.getParameter("business");
		System.out.println("Company Name:"+name);
		System.out.println("Founder is "+founder);
		System.out.println("Company Started From :"+since);
		System.out.println("Employes are:"+employees);
		System.out.println("Company Address:"+address);
		System.out.println("Business is:"+business);
		
		PrintWriter writer=resp.getWriter();
		writer.append("<html>")
		.append("<body>").append("<h1>").append("Showing Details")
		.append("</h1>")
		.append("Name :"+name)
		.append("Founder :"+founder)
		.append("Since :"+since)
		.append("employees :"+employees)
		.append("address :"+address)
		.append("business :"+business)
		.append("</body>")
		.append("</html>");
		
//		CompanyDTO dto = new CompanyDTO("Apple", "Steve Jobs", 1976,, address, business)
		CompanyDTO dto = new CompanyDTO(name, founder, since, employees, address, business);
		dtos.add(dto);	
		
		
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DoGet Method");
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1>").append("Showing Details")
		.append("<table>");
		for (CompanyDTO companyDTO:dtos) {
			writer.append("<tr>")
			.append("<td>")
			.append(companyDTO.getName()).append("</td>")
			.append("<td>")
			.append(companyDTO.getFounder()).append("</td>")
			.append("<td>")
			.append(companyDTO.getSince()).append("</td>")
			.append("<td>")
			.append(companyDTO.getEmployees()).append("</td>")
			.append("<td>")
			.append(companyDTO.getAddress()).append("</td>")
			.append("<td>")
			.append(companyDTO.getBusiness()).append("</td>")
			.append("</tr>");
		}
		writer.append("</table>")
		.append("</body>")
		.append("</html>");
	
	}
}
