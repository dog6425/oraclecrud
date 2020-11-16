<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
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
		<title>게시글 목록</title>
	</head>
	
	<body>
		<h2>게시글 목록</h2>
		<table border="1">
			<thead>
				<tr>
					<th>이름</th>
					<th>제목</th>
					<th>내용</th>
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