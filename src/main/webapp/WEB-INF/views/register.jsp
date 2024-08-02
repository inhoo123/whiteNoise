<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageCntext.request.contextPath }" var="rootPath" />
<form>
<input value="id" name="id" placeholder="passowrd"/>
<input value="passowrd" name="passowrd" placeholder="password"/> 
회원가입
</form>
<a href="${rootPath }/register">Register</a>