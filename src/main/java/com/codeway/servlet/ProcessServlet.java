package com.codeway.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static String gradeCalc(String val) {
		double mark = Double.parseDouble(val);
		int marks = (int) mark;
		marks /= 10;
		switch (marks) {
			case 10: 
			case 9: 
				return "O";
			case 8: 
				return "E";
			case 7: 
				return "A";
			case 6: 
				return "B";
			case 5: 
				return "C";
			case 4: 
				return "D";
			case 3: 
			case 2: 
			case 1: 
			case 0: 
				return "F";
			default:
					return "Error Grade";
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname = request.getParameter("sname");
		String sroll = request.getParameter("sroll");
		double totalMarks = 0.0;
		double avgMarks = 0.0;
		
		String[] subnames = request.getParameterValues("subjectName");
		for (String str : subnames) {
			System.out.print(str);
		}
		String[] submarks = request.getParameterValues("subjectMarks");
		for (String str : submarks) {
			System.out.print(str);
			totalMarks += Double.parseDouble(str);
		}
		
		avgMarks = totalMarks/submarks.length;
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String printStr = null;
		
		printStr = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Display Result</title>\r\n"
				+ "<link\r\n"
				+ "    href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n"
				+ "    rel=\"stylesheet\"\r\n"
				+ "    integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n"
				+ "    crossorigin=\"anonymous\"\r\n"
				+ "/>\r\n"
				+ "<link rel=\"stylesheet\" href=\"style.css\" />\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<div class=\"studentDetails\">\r\n"
				+ "	    <h1>Student details</h1>\r\n"
				+ "	    <table>\r\n"
				+ "	        <tr>\r\n"
				+ "	            <td><h3>Name:  </h3></td>\r\n"
				+ "	            <td><h3>"+ sname +" </h3></td>\r\n"
				+ "	        </tr>\r\n"
				+ "	        <tr>\r\n"
				+ "	            <td><h3>Roll:  </h3></td>\r\n"
				+ "	            <td><h3>"+ sroll +" </h3></td>\r\n"
				+ "	        </tr>\r\n"
				+ "	    </table>\r\n"
				+ "	</div>\r\n"
				+ "	<table class=\"table table-striped table-hover result_table\">\r\n"
				+ "	    <tr class=\"table-dark\">\r\n"
				+ "	        <th>Subject name</th>\r\n"
				+ "	        <th>marks</th>\r\n"
				+ "	        <th>Grade</th>\r\n"
				+ "	    </tr>\r\n";
//				+ "	        <td>Lorem</td>\r\n"
//				+ "	        <td>ipsum</td>\r\n"
//				+ "	        <td>dolor</td>\r\n";
		for (int i = 0; i < submarks.length; i++) {
			printStr += "	    <tr>\r\n";
			printStr += "<td>"+ subnames[i] +"</td>\r\n";
			printStr += "<td>"+ submarks[i] +"</td>\r\n";
			printStr += "<td>"+ gradeCalc(submarks[i]) +"</td>\r\n";
		}
	printStr +=	"	    </tr>\r\n"
				+ "	    <tr>\r\n"
				+ "	        <td>Total marks</td>\r\n"
				+ "	        <td colspan=\"2\">"+ totalMarks +"</td>\r\n"
				+ "	    </tr>\r\n"
				+ "	    <tr>\r\n"
				+ "	        <td>Grade</td>\r\n"
				+ "	        <td colspan=\"2\">"+ gradeCalc(Double.toString(avgMarks)) +"</td>\r\n"
				+ "	    </tr>\r\n"
				+ "	</table>\r\n"
				+ "	<center>\r\n"
				+ "     <a href=\"index.jsp\"\r\n"
				+ "          ><button type=\"button\" class=\"btn btn-primary\">\r\n"
				+ "                Goto Home\r\n"
				+ "          </button></a\r\n"
				+ "        >\r\n"
				+ "     </center>\r\n"
				+ "	<script\r\n"
				+ "	    src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "	    integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n"
				+ "	    crossorigin=\"anonymous\">\r\n"
				+ "	</script>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		pw.println(printStr);
		pw.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);		
	}
}
