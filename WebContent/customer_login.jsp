<%@page import="com.goodstransporter.dao.CustomerDaoImple"%>
<%@page import="com.goodstransporter.dao.CustomerDao"%>
<jsp:useBean id="customer" class="com.goodstransporter.dto.Customer" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="customer"/>

<%
	CustomerDao cdao = new CustomerDaoImple();
	boolean b = cdao.login(customer);
	if(b){
		response.sendRedirect("customer_home.jsp");
		
	}else{
		response.sendRedirect("customer_login_form.jsp");
		
	}
%>