<%@page import="com.goodstransporter.dao.BookingInterestDaoImple"%>
<%@page import="com.goodstransporter.dao.BookingInterestDao"%>
<jsp:useBean id="bookingInterest" class="com.goodstransporter.dto.BookingInterest" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="bookingInterest"/>

<%
	BookingInterestDao bidao = new BookingInterestDaoImple();
	bidao.add(bookingInterest);
	
	response.sendRedirect("transporter_booking_accept_form.jsp");

%>