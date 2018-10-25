<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.text.*"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");

	String msg= request.getParameter("msg");
	Object username = session.getAttribute("user");
	
	ArrayList<String> msgs=(ArrayList<String>)application.getAttribute("msgs");
	if(msgs==null){
		msgs=new ArrayList<String>();
		application.setAttribute("msgs",msgs);
	}
	
	Date  date = new Date();
	SimpleDateFormat f = new SimpleDateFormat("E MMM dd일 HH:mm",Locale.KOREA);
	msgs.add(username+" :: "+msg+" , "+f.format(date));
//	msgs.add(username+" :: "+msg+ " "+ new Date() );
	
	application.log(msg+"추가됨");
	response.sendRedirect("twitter_list.jsp");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>