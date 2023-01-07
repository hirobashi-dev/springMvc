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

管理者：${username} で登録しています。<br>
<p>学生一覧：</p>

<%-- out.println("hello test"); --%>

<table border="1px">
<c:forEach var="student" items="${students}" varStatus="status">
	<c:if test="${status.index == 0}" >
		<tr>
			<td style="width:80px">学生ID</td>
			<td style="width:200px">名前</td>
			<td style="width:100px">性別</td>
			<td style="width:100px">年齢</td>
			<td style="width:100px">住所</td>
			<td style="width:100px">成績詳細</td>
		</tr>
	</c:if>
	<tr>
		<td > <c:out value="${student.id}" /></td>
		<td ><c:out value="${student.name}" /></td>
		<td ><c:out value="${student.gende}" /></td>
		<td ><c:out value="${student.age}" /></td>
		<td ><c:out value="${student.jyusyo}" /></td>
		<td ><a href="/springMvc/chengji?id=${student.id}">成績</a></td>
	</tr>
</c:forEach>
</table>

<p>
<span>
	<a href="/springMvc/registerres">成績登録</a>&nbsp&nbsp
	<a href="/springMvc/Studentsinit">学生登録</a>&nbsp&nbsp
	<a href="/springMvc/chengjilist">成績一覧</a>
</p>

</body>
</html>