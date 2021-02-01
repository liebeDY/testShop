<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>정보수정</h4>
<form action="${pageContext.request.contextPath }/member/edit" method="post">

아이디:<input type="text" name="id" value="${m.id }" readonly><br />
비밀번호:<input type="text" name="pwd" value="${m.pwd }" ><br />
이름:<input type="text" name="name" value="${m.name }" ><br />
닉네임:<input type="text" name="nickname" value="${m.nickname }" ><br />
전화번호:<input type="text" name="tel" value="${m.tel }" ><br />
이메일:<input type="text" name="email" value="${m.email }" ><br />
우편번호:<input type="text" name="postcode" value="${m.postcode }" ><br />
주소:<input type="text" name="addr1" value="${m.addr1 }" ><br />
상세주소:<input type="text" name="addr2" value="${m.addr2 }" ><br />
type:
<c:choose>
	<c:when test="${m.type==1 }">구매자</c:when>
	<c:when test="${m.type==2 }">판매자</c:when>
	<c:when test="${m.type==3 }">관리자</c:when>
	<c:otherwise>잘못된 type</c:otherwise>
</c:choose>
<br>
<input type="reset" value="취소"/>
<input type="submit" value="수정완료"/>



</form>
</body>
</html>