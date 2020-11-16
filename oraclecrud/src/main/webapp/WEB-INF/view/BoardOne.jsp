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
			<c:forEach var="board" items="${boardOne}">
				<tr>
					<td>${board.boardTitle}</td>
					<td>${board.baordWriter}</td>
					<td><a href="/modifyBoard/${board.boardupdate}">${board.boardupdate}</a></td>
					<td><a href="/eraseBoard/${board.boarddelete}">${board.boarddelete}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>