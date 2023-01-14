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

<p>成績登録</p>
<p>${massage}</p>
<form action="/springMvc/register" method="post">
	<table border="1px">
			<tr>
				<td><label>学生ID：</label></td>
				<td><input type="text" name="student_id"></td>
			</tr>
			<tr>
				<td><label>学科：</label></td>
				<td><input type="text" name="subject"></td>
			</tr>
			<tr>
				<td><label>成績：</label></td>
				<td><input type="text" name="score"></td>
			</tr>
		</table>
	<p>
	<input type="submit" value="登録">&nbsp&nbsp
	<a href="/springMvc/login?username=${username}&password=${password}">学生一覧画面へ戻る</a>
	</p>
</form>
</body>
</html>