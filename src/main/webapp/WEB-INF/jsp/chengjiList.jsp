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
<p>成績一覧：</p>

<%-- out.println("hello test"); --%>
<form action="/springMvc/chengjidel" method="post">
<table border="1px">
<c:forEach var="chengji" items="${chengjilist}" varStatus="status">
	<c:if test="${status.index == 0}" >
		<tr>
			<td style="width:80px">学生ID</td>
			<td style="width:200px">名前</td>
			<td style="width:100px">学科</td>
			<td style="width:100px">成績</td>
			<td style="width:100px">選択</td>
		</tr>
	</c:if>
	<tr>
		<td > <c:out value="${chengji.student_id}" /></td>
		<td ><c:out value="${chengji.name}" /></td>
		<td ><c:out value="${chengji.subject}" /></td>
		<td ><c:out value="${chengji.score}" /></td>
		<td ><input type="checkbox" name="chenk" value="${status.index}"></td>
	</tr>
		<input type="hidden" name="STUDENT_ID" value="${chengji.student_id}">
		<input type="hidden" name="NAME" value="${chengji.name}">
		<input type="hidden" name="SUBJECT" value="${chengji.subject}">
		<input type="hidden" name="SCORE" value="${chengji.score}">
</c:forEach>
</table>

<p>
	<input type="submit"  value="成績削除">&nbsp&nbsp
<a href="/springMvc/login?username=${username}&password=${password}">学生一覧画面へ戻る</a>
</p>
</form>
</body>
</html>