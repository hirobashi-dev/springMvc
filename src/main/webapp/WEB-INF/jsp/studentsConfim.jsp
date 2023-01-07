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
	<p>学生確認</p>
	<p>${massage}</p>
	<c:if test="${err=='1'}">
		<a style="width: 300px" href="/springMvc/Studentsinit">戻る</a>
	</c:if>
	<c:if test="${err=='0'}">
		<form action="/springMvc/studentsdl" method="post">
			<table>
				<tr>
					<td><label>学生ID：</label></td>
					<td style="width: 300px">${student.id}</td>
					<input type="hidden" name="id" value=${student.id}>
				</tr>
				<tr>
					<td><label>姓名：</label></td>
					<td>${student.name}</td>
					<input type="hidden" name="name" value=${student.name}>
				</tr>
				<tr>
					<td><label>性別：</label></td>
					<td>${student.gende}</td>
					<input type="hidden" name="gende" value=${student.gende}>
				</tr>
				<tr>
					<td><label>年齢：</label></td>
					<td>${student.age}</td>
					<input type="hidden" name="age" value=${student.age}>
				</tr>
				<tr>
					<td><label>住所：</label></td>
					<td>${student.jyusyo}</td>
					<input type="hidden" name="jyusyo" value=${student.jyusyo}>
				</tr>
			</table>
			<p>
				<input style="width: 300px" type="submit" value="登録">&nbsp&nbsp
				<a href="/springMvc/login?username=${username}&password=${password}">学生一覧画面へ戻る</a>
			</p>
		</form>
	</c:if>

</body>
</html>