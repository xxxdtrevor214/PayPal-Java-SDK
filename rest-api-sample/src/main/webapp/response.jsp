<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Response Page</title>
<script type="text/javascript">
	function stringify() {

		// Iterate through each element of class req, and resp, and preetify it.
		var els = document.getElementsByClassName("req");

		Array.prototype.forEach.call(els, function(el) {
			if (el.innerHTML.trim() != '') {
				var data = JSON.parse(el.innerHTML.trim());
				el.innerHTML = '';
				el.innerHTML = JSON.stringify(data, null, 2);
				console.log(el.innerHTML.trim());
			} else {
				el.innerHTML = 'No DATA'
			}
		});
		
		var els = document.getElementsByClassName("resp");

		Array.prototype.forEach.call(els, function(el) {
			if (el.innerHTML.trim() != '') {
				var data = JSON.parse(el.innerHTML.trim());
				el.innerHTML = '';
				el.innerHTML = JSON.stringify(data, null, 2);
				console.log(el.innerHTML.trim());
			} else {
				el.innerHTML = 'No DATA'
			}
		});
	}
</script>
</head>
<body onload="stringify();">
	<a href="index.html">Back</a>
	<br />
	<%
		if (request.getAttribute("redirectURL") != null) {
	%>
	<a href=<%=(String) request.getAttribute("redirectURL")%>>Redirect
		to PayPal to approve the payment</a>
	<br />
	<%
		}
	%>
	<%
		List<String> responses = (List<String>) request
				.getAttribute("responses");
		List<String> requests = (List<String>) request
				.getAttribute("requests");
		List<String> messages = (List<String>) request
				.getAttribute("messages");
		for (int i = 0; i < responses.size(); i++) {
			String resp = responses.get(i);
			String req = requests.get(i);
			String message = messages.get(i);
	%>
	<h2><%= i+1 %>) <%= message %></h2>
	<table border="1px" style="border-collapse: collapse">
		<tr>
			<th>Request</th>
			<th>Response</th>
		</tr>
		<tr>
			<td valign="top"><pre class="req"><%=req%></pre></td>
			<td valign="top"><pre class="resp"><%=resp%></pre></td>
		</tr>
	</table>

	<%
		}
	%>
	<a href="index.html">Back</a>
</body>
</html>