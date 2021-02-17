<%@page import="com.goodstransporter.dao.CustomerDaoImple"%>
<%@page import="com.goodstransporter.dao.CustomerDao"%>
<jsp:useBean id="customer" class="com.goodstransporter.dto.Customer" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="customer"/>

<%
	CustomerDao cdao = new CustomerDaoImple();
	cdao.addCustomer(customer);
	
	response.sendRedirect("customer_reg_form.jsp");
%>