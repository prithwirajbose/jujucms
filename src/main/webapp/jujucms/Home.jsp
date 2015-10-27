<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title><s:property value="page.pageTitle" escapeHtml="true" /></title>
<meta name="description" content="<s:property value="page.pageDescription" escapeHtml="true" />" />
</head>
<body>
<div id="container">
<div id="header">
<h1><s:property value="page.pageTitle" escapeHtml="true" /></h1>
</div>
<div id="maincontent">
<s:property value="page.pageContent" escapeHtml="false" />
</div>
</div>
</body>
</html>