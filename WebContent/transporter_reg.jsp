<%@page import="com.goodstransporter.dao.TransporterDaoImple"%>
<%@page import="com.goodstransporter.dao.TransporterDao"%>
<jsp:useBean id="Transporter" class="com.goodstransporter.dto.Transporter" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="Transporter"/>

<%
	TransporterDao tdao = new TransporterDaoImple();
	tdao.addTransporter(Transporter);
	response.sendRedirect("transporter_login_form.jsp");
%>