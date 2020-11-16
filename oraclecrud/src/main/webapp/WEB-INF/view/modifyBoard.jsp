<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="/coco/resources/semantic.min.css">

<style type="text/css">
  body{
    background-color: #dadada;
  }
  body>.grid{
    height: 100%;
  }
  .image {
            margin-top: -100px;
        }
        .column {
            max-width: 1000px;
        }
        .view_btn {
            cursor: pointer;
        }
</style>
</head>

<head>
		<meta charset="UTF-8">
		<title>게시글 수정</title>
	</head>
	
	<body>
		<h2>게시글 수정</h2>
		<table border="1">
			<thead>
				<tr>
					<th>번호 수정</th><br>
					<th>제목 수정</th><br>
					<th>제목 수정</th><br>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList}">
					<tr>
						<td><a href="/boardOne/${board.boardId}">${board.boardId}</a></td>
						<td>${board.boardTitle}</td>
						<td>${board.boardWriter}</td>
						<td>${board.boardinsert}</td>
						<td>${board.boarddelete}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>