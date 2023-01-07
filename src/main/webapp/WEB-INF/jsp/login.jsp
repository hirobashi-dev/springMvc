<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生成績管理</title>
</head>
<body>

	<h2>学生成績管理</h2>

	<form action="/springMvc/login" method="get">
		<table>
			<tr>
				<td>
					<p>管理者名：</p>
				</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>
					<p>パスワード：</p>
				</td>
				<td><input type="text" name="password"></td>
		</table>
		<p>
			<input type="checkbox" name="chek">内容確認
		</p>
		<p>
			<input type="submit" value="登録">
		</p>
	</form>

</body>
</html>