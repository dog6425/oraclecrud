<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시글 상세보기</title>
	</head>
	
	<body>
		<h2>게시글 상세보기</h2>
		<table border="1">
		<thead>
			<tr>	
				<th>제목</th>
				<th>이름</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td>${BoardOne.boardTitle}</td>
					<td>${BoardOne.boardWriter}</td>
					<td><a href="/modifyboard/">수정</a></td>
					<td><a href="/eraseboard/">삭제</a></td>
				</tr>
		
		</tbody>
	</table>
</body>
</html>