<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${sessionScope.id }로그인 상태
<a href="${pageContext.request.contextPath }/member/editForm">정보수정</a>
<a href="${pageContext.request.contextPath }/member/logout">로그아웃</a>
<a href="${pageContext.request.contextPath }/member/out">탈퇴</a>
<c:set var="url">/seller/allList.do</c:set>
<c:if test="${not empty url2 }">
	<c:set var="url" value="${url2 }"/>
	</c:if>
	
	<c:if test="${sessionScope.type==1 }">
	<c:set var="path" value="/seller/allList"/>
	</c:if>

<c:if test="${sessionScope.type==2 }">
	<c:set var="path" value="seller/myList"/>
	</c:if>
	
<c:if test="${sessionScope.type==3 }">
	<c:set var="path" value="member/adminPage"/>	
	</c:if>
	
	<c:import url="${path }"></c:import>

</body>
</html>