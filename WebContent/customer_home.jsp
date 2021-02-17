<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="com.goodstransporter.dto.Booking"%>
<%@page import="java.util.List"%>
<%@page import="com.goodstransporter.dao.BookingDao"%>
<%@page import="com.goodstransporter.dao.BookingDaoImple"%>
<jsp:useBean id="customer" class="com.goodstransporter.dto.Customer" scope="session"></jsp:useBean>
<%
	BookingDao bdao = new BookingDaoImple();
	List<Booking> blist = bdao.customerPendingBooking(customer.getCustomerID());

%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Courier & Transporter</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="topContainer">
  <!-- HEADER -->
  <div id="header">
  	<div id="logo">
  	<h1 style="color:yellow;font-size: 20px;">Courier</h1>
  	<h1 style="color:orange;font-size: 22px;">& Transporter</h1>
  	</div>
    <ul>
      <li ><a href="customer_home.jsp">Home</a></li>
      <li class="bullet"></li>
      <li ><a href="customer_profile.jsp">Profile</a></li>
      <li class="bullet"></li>
      <li ><a href="customer_booking_form.jsp?customerId=<%=customer.getCustomerID()%>">Booking</a></li>
      <li class="bullet"></li>
      <li ><a href="logout.jsp">Logout</a></li>
    </ul>
  </div>
  <!-- MAIN IMG -->
  <div id="mainimg">
    <div id="presentation"><a href="#"><img src="images/btn_presentation.gif" alt="" width="238" height="15" border="0" /></a></div>
    <div id="call"><img src="images/call.gif" alt="" width="213" height="70" /></div>
  </div>
  
  <br> 		
  <table align="center" border="1" width="50%" style="color: yellow; font-size: 15px; "  >
 	<% 
 		for(Booking b : blist){	
 	%>	
 	<thead>
 		<tr>
 			<td>Item</td>
 			<td>Approx Weight</td>
 			<td>Approx Distance</td>
 			<td>Pick up Location</td>
 			<td>Drop Location</td>
 			<td>Booking Date</td>
 		</tr>
 	</thead>
 	<tr>
 		<td><%= b.getItem() %></td>
 		<td><%= b.getApproxWeight() %></td>
 		<td><%= b.getApproxDistance() %></td>
 		<td><%= b.getPickUpLocation() %></td>
 		<td><%= b.getDropLocation() %></td>
 		<td><%= b.getBookingDate() %></td>
 	</tr>	
 	<%
 		} 	
 	%>
  </table>
 	
 
<div id="bottomContainer">
  <!-- FOOTER -->
  <div id="footer">
    <p><a href="#">HOME</a> | <a href="#">ABOUT US</a> | <a href="#">SERVICES</a> | <a href="#">PRICES</a> | <a href="#">NEWS</a> | <a href="#">SUPPORT</a> | <a href="#">CONTACTS</a><br/>
      Copyright &copy; Your Company Name. Designed by<a href="http://www.templatesland.com"> TemplatesLand.com</a>.</p>
  </div>
</div>
</body>
</html>