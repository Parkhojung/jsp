package jspbook.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "처음 만드는 서블릿", urlPatterns = { "/HelloWorldServlet" })
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");		
		out.println("<HEAD>");
		out.println("<META charset=\"UTF-8\">");
		out.println("<TITLE>Hello World Servlet</TITLE>");
		out.println("</HEAD>");		
		
		out.println("<BODY>");
		for(int i = 0 ; i < 10 ; i ++)
		out.println("Hello World<BR>");
		out.println("</Body>");
		out.println("</HTML>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
