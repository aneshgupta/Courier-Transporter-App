<%!
	static String transportertypes[] = {"footer","hand cart","cycle","two wheeler","loading auto","mini truck","truck","bus"};
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<jsp:useBean id="Transporter" class="com.goodstransporter.dto.Transporter" scope="session"></jsp:useBean>
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
      <li ><a href="transporter_home.jsp">Home</a></li>
      <li class="bullet"></li>
      <li ><a href="transporter_profile.jsp">Update Profile</a></li>
      <li class="bullet"></li>
      <li ><a href="logout.jsp">Logout</a></li>
    </ul>
  </div>
  <!-- MAIN IMG -->
  <div id="mainimg">
    <div id="presentation"><a href="#"><img src="images/btn_presentation.gif" alt="" width="238" height="15" border="0" /></a></div>
    <div id="call"><img src="images/call.gif" alt="" width="213" height="70" /></div>
  </div>
  <!-- CONTENT -->
  <div id="form">	
	<form action="transporter_profile_update.jsp" method="post" style="font-size: 13px; color: aqua; fon">
	<table align="center" border="0" >
	<tr>
		<td><input type="hidden" name="transporterId" value="<%=Transporter.getTransporterId() %>" > </td>
	</tr>
	<tr>
	<td>Email:<br>
	<input type="text" name="email" placeholder="Enter email" value="<%= Transporter.getEmail()%>" ></td>
	</tr>
	<tr>
	<td>Mobile No:<br>
	<input type="text" name="mobileNo" placeholder="Enter mobile no" value="<%= Transporter.getMobileNo()%>"></td>
	</tr>
	<tr>
	<td>Name:<br>
	<input type="text" name="name" placeholder="Enter name" value="<%= Transporter.getName()%>" ></td>
	</tr>
	<tr>
	<td>Gender:<br>
	<% if(Transporter.getGender()!=null && Transporter.getGender().equals("male")){ %>
	<input type="radio" name="gender" value="male" checked="checked">Male
	<% }else{ %>
	<input type="radio" name="gender" value="male">Male <%} %>
	<% if(Transporter.getGender()!=null && Transporter.getGender().equals("female")){ %>
	<input type="radio" name="gender" value="female" checked="checked">Female
	<% }else{ %>
	<input type="radio" name="gender" value="female">Female <%} %> </td>
	</tr> 
	<tr>
	<td>Address:<br>
	<textarea rows="5" cols="15" name="address"><%= Transporter.getAddress()%></textarea></td>
	</tr>
	<tr>
	<td>Type:<br><select name="type" >
		<option value="0">Select type</option>
		<% 
			for(String x : transportertypes){
				if(Transporter.getType()!=null && Transporter.getType().equals(x)){
		%>
		<option value="<%=x%>" selected="selected"><%=x%></option>
		<%
			}else{
		%>
		<option value="<%=x%>"><%=x%></option>
		<%}
			}
		%>
	</select> 
	</tr>
	<tr>
	<td><br><input type="submit" value="Update"></td>
	</tr>
	</table>
	</form> 
  </div> 		
 
<div id="bottomContainer">
  <!-- FOOTER -->
  <div id="footer">
    <p><a href="#">HOME</a> | <a href="#">ABOUT US</a> | <a href="#">SERVICES</a> | <a href="#">PRICES</a> | <a href="#">NEWS</a> | <a href="#">SUPPORT</a> | <a href="#">CONTACTS</a><br/>
      Copyright &copy; Your Company Name. Designed by<a href="http://www.templatesland.com"> TemplatesLand.com</a>.</p>
  </div>
</div>
</body>
</html>