<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<% response.setStatus(404); %>
<html>
<head>
<title>Page Not Found</title>
</head>
<body>
<h1>Page Not Found</h1>
<p>The requested URL <s:property value="requestUri" /> could not be found on this server</p>
</body>
</html>