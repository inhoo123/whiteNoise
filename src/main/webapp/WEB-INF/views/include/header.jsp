<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<div class="title">
<h1>WhiteNoise</h1>
<p>meditation sounds</p>
</div>
<nav class="main">
	<ul>
		<li class="login"><a href="${rootPath}/user/login">Log in</a></li>
	</ul>
</nav>