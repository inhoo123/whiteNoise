<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<script src="${rootPath}/static/js/join.js"></script>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<form class="user join" method="POST">
		<fieldset>
			<legend>회원가입</legend>
			<c:if test="${JOIN_MSG == 'FAIL' } ">
				<h3>회원가입에 실패 했습니다</h3>
			</c:if>
			<input name="user_email" type="text" placeholder="e-mail" />
			<span>*</span>
			<input name="user_password" type="password" placeholder="password" />
			<span>*</span>
			<input name="user_nick" type="text"placeholder="NickName" />
			<span>*</span>
			<input type="BUTTON" value="회원가입" />
		</fieldset>
	</form>
</body>
