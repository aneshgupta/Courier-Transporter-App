<% 
	session.removeAttribute("Transporter");
	session.removeAttribute("customer");
	session.invalidate();
	response.sendRedirect("index.html");

%>