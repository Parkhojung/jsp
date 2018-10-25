<%@page contentType="text/html; charset=UTF-8" %>
<% 
	request.setCharacterEncoding("UTF-8");
%>
<%--	response.setContentType("text/html; charset=UTF-8");--%>

footer.jsp 에서 출력한  메시지 입니다.
<HR>
<%= request.getParameter("email") %>,
<%= request.getParameter("tel") %>

<%
	out.println(request.getParameter("tel"));
%>
