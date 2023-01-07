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
<p>管理者：${username}</p>
<p>学生登録</p>
<p>${massage}</p>
<form action="/springMvc/StudentsReg" method="post">
	<table border="1px">
			<tr>
				<td><label>学生ID：</label></td>
				<td >
				<input style="width:300px" type="text" name="id"></td>
			</tr>
			<tr>
				<td><label>姓名：</label></td>
				<td><input style="width:300px" type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>性別：</label></td>
				<td><input type="radio" name="gende" value="男">男
				    <input type="radio" name="gende" value="女">女
				</td>
			</tr>
			<tr>
				<td><label>年齢：</label></td>
				<td><input style="width:300px" type="text" name="age"></td>
			</tr>
			<tr>
				<td><label>住所：</label></td>
				<td><input style="width:300px" type="text" name="jyusyo"></td>
			</tr>
		</table>
	<p>
	<input style="width:300px" type="submit" value="確認">&nbsp&nbsp
	<a href="/springMvc/login?username=${username}&password=${password}">学生一覧画面へ戻る</a>
	</p>
</form>
</body>
</html>