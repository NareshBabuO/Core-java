package com.xworkz.resume;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.resume.dto.JobApplicationDTO;

@WebServlet(loadOnStartup = 10, urlPatterns = "/resume")
public class JobApplicationServlet extends HttpServlet {

//	private ArrayList<JobDTO> dtos=new ArrayList<JobDTO>();
//	public ResumeServlet() 
 private List <JobApplicationDTO> dtos = new ArrayList ();

	public JobApplicationServlet() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("The Service Is Running Successfully");
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNo = req.getParameter("number");
		String altPhNo = req.getParameter("number1");
		String gender = req.getParameter("gender");
		String degree = req.getParameter("Stream");
		String yop = req.getParameter("yearOfPass");
		String university = req.getParameter("college");
		String address = req.getParameter("address");
		String skill = req.getParameter("skills");
		String s1 = req.getParameter("skills1");
		String s2 = req.getParameter("skills2");
		String s3 = req.getParameter("skills3");
		String s4 = req.getParameter("skills4");
		String s5 = req.getParameter("skills5");
		String s6 = req.getParameter("skills6");
		String s7 = req.getParameter("skills7");
		String s8 = req.getParameter("skills8");
		String s9 = req.getParameter("skills9");
		String s10 = req.getParameter("skills10");
		String s11 = req.getParameter("skills11");
		String s12 = req.getParameter("skills12");
		String s13 = req.getParameter("skills13");
		String s14 = req.getParameter("skills14");
		String salary = req.getParameter("Salary");
		String exp = req.getParameter("TotalExp");
		String idProof = req.getParameter("idproof");
		String idProofNo = req.getParameter("cardNo");

//		System.out.println("Name :" + name);
//		System.out.println("E-mail :" + email);
//		System.out.println("phoneno :" + phoneNo);
//		System.out.println("altPhno :" + altPhNo);
//		System.out.println("gen :" + gender);
//		System.out.println("qualification :" + degree);
//		System.out.println("yop :" + yop);
//		System.out.println("University :" + university);
//		System.out.println("address :" + address);
//		System.out.println("skills :" + skill);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);
//		System.out.println(s7);
//		System.out.println(s8);
//		System.out.println(s9);
//		System.out.println(s10);
//		System.out.println(s11);
//		System.out.println(s12);
//		System.out.println(s13);
//		System.out.println(s14);
//		System.out.println("salary :" + salary);
//		System.out.println("exp :" + exp);
//		System.out.println("idproof :" + idProof);
//		System.out.println("idProofNo :" + idProofNo);
		
		PrintWriter w =res.getWriter();
		w.append("<html").append("<body>").append("<h1>").append("Registation Succussfully")
		.append("<br>").append("Details->").append("</h1>")
		.append("Name:" + name).append("<br/>")
		.append("Email:" + email).append("<br/>")
		.append("Number:" + phoneNo).append("<br/>")
		.append("altPhno :" + altPhNo).append("<br/>")
		.append("gender:" + gender).append("<br/>")
		.append("Qualifiaction:" + degree).append("<br/>")
		.append("yop :" + yop).append("<br/>")
		.append("University :" + university).append("<br/>")
		.append("address :" + address).append("<br/>")
		.append("skills :" + skill).append("<br>")
		.append(s1).append("<br/>")
		.append(s2).append("<br/>")
		.append(s3).append("<br/>")
		.append(s4).append("<br/>")
		.append(s5).append("<br/>")
		.append(s6).append("<br/>")
		.append(s7).append("<br/>")
		.append(s8).append("<br/>")
		.append(s9).append("<br/>")
		.append(s10).append("<br/>")
		.append(s11).append("<br/>")
		.append(s12).append("<br/>")
		.append(s13).append("<br/>")
		.append(s14).append("<br/>")
		.append("salary :" + salary).append("<br/>")
		.append("experience :" + exp).append("<br/>")
		.append("idproof :" + idProof).append("<br/>")
		.append("idProofNo :" + idProofNo).append("<br>")
		.append("</body>")
		.append("</html>");
		
	JobApplicationDTO dto= new JobApplicationDTO(name,email,Long.parseLong(phoneNo),Long.parseLong(altPhNo),
			gender,degree,Integer.parseInt(yop),university,address,skill,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,
				Double.parseDouble(salary),Integer.parseInt(exp),idProof,idProofNo);
		
		dtos.add(dto);
		System.out.println(dtos);

	}

}
