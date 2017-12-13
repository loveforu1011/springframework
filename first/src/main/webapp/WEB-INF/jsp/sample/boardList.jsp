<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>작성시간</td>
			<td>조회수</td>
		</tr>

		<c:forEach var="lists" items="${list}">
			<tr>
				<c:forEach var="list_temp" items="${lists}">
					${list_temp}
				</c:forEach>
			</tr>
			<p>
		</c:forEach>
	</table>

</body>
</html>