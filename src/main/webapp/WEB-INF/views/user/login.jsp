<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<script src="${rootPath}/static/js/login.js"></script>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<form class="user login" method="POST">
		<fieldset>
			<legend>Login</legend>
			<c:if test="${not empty MSG} ">
				<h3>{MSG}</h3>
			</c:if>
			<input name="user_email" type="text" placeholder="e-mail" />
			<span>*</span>
			<input name="user_password" type="password" placeholder="password" />
			<span>*</span>
			<input type="BUTTON" value="로그인"/>
		</fieldset>
	</form>
</body>
