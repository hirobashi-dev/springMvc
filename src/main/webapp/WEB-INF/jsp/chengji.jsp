<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

学生：${name} <br>
成績が下記のとおりです。

<%-- out.println("hello test"); --%>

<table border="1px">
<c:forEach var="chengji" items="${chengji}">
	<tr>
		<td style="width:200px"><c:out value="${chengji.subject}" /></td>
		<td style="width:100px"><c:out value="${chengji.score}" /></td>

	</tr>
</c:forEach>
</table>
<p>
<a href="/springMvc/login?username=${username}&password=${password}">学生一覧画面へ戻る</a>
</p>
</body>
</html>