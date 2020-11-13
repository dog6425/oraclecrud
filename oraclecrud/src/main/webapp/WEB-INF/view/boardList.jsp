<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시글 목록</title>
	</head>
	
	<body>
		<h2>게시글 목록</h2>
		
		<table border="1">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>이름</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList}">
					<tr>
						<td><a href="/boardOne/${board.boardId}">${board.boardId}</a></td>
						<td>${board.boardTitle}</td>
						<td>${board.boardWriter}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>

<!-- 목록, 상세보기, 추가, 수정, 삭제 -->