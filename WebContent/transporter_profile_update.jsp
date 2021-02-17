<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.goodstransporter.dao.TransporterDaoImple"%>
<%@page import="com.goodstransporter.dao.TransporterDao"%>
<jsp:useBean id="Transporter" class="com.goodstransporter.dto.Transporter" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="Transporter"/>

<%
	TransporterDao tdao = new TransporterDaoImple();
	tdao.updateProfile(Transporter);	
	
	response.sendRedirect("transporter_profile.jsp");
%>