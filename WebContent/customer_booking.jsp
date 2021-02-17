<%@page import="com.goodstransporter.dao.BookingDaoImple"%>
<%@page import="com.goodstransporter.dao.BookingDao"%>
<jsp:useBean id="booking" class="com.goodstransporter.dto.Booking" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="booking"/>

<%
	BookingDao bdao  = new BookingDaoImple();
	bdao.doBooking(booking);
	
	response.sendRedirect("customer_booking_form.jsp");
%>