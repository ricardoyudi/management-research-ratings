<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link rel="stylesheet" href="<c:url value="/resources/stylesheets/foundation.min.css"/>" />
	<link rel="stylesheet" href="<c:url value="/resources/stylesheets/style.css"/>" />
	<title><tiles:getAsString name="title" /></title>
	<script type="text/javascript" src="<c:url value="/resources/javascripts/jquery.js"/>"></script>
</head>
<body>
	
	
	<tiles:insertAttribute name="header"/>
	

	<tiles:insertAttribute name="content"/>


	<tiles:insertAttribute name="footer"/>
</body>
</html>