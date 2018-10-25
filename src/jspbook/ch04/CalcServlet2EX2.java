package jspbook.ch04;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet2EX2
 */
@WebServlet(description = "연습하는 서블릿", urlPatterns = { "/CalcServlet2EX2" })
public class CalcServlet2EX2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet2EX2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		int num1,num2,result;
		String op;
		
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>로그인</TITLE></HEAD>");
		out.println("<BODY><H2>Hello World</H2>");
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd HH-mm");
		String a = f.format(new Date());
		out.println("Today's date and time is "+a+"</BODY>");
		out.println("</HTML>");	
		
		
//		PrintWriter out = response.getWriter();
//		
//		num1 = Integer.parseInt(request.getParameter("num1"));
//		num2 = Integer.parseInt(request.getParameter("num2"));
//		op = request.getParameter("opearator");
//		
//		Calc ob = new Calc(num1,num2,op);
//		result = ob.getResult();
//		
//		out.println("<HTML>");
//		out.println("<HEAD>");
//		out.println("</HEAD>");
//		out.println("<BODY>");
//		out.println(result);
//		out.println("</BODY>");
//		out.println("</HTML>");
	}

}
