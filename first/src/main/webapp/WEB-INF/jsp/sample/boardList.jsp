<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	<p>
	<p><p>
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성시간</td>
			<td>조회수</td>
		</tr>
		<c:forEach var="onemap" items="${list}">
			<c:if test="${empty onemap.pageid}">
				<tr>
					<td><c:out value="${onemap.IDX}" /></td>
					<td><a
						href="/first/sample/readBoardItemView.do?IDX=${onemap.IDX}&pageid=${onemap.pageid}">
							<c:out value="${onemap.TITLE}" />
					</a></td>
					<td><c:out value="${onemap.CREA_ID}" /></td>
					<td><c:out value="${onemap.CREA_DTM}" /></td>
					<td><c:out value="${onemap.HIT_CNT}" /></td>
				</tr>
			</c:if>
			<c:if test="${!empty onemap.pageid}">
				<tr>
					<c:forEach begin="1" end="${onemap.totalpagecnt}" var="pagecnt"
						step="1">
						<td><a
							href="/first/sample/openSampleList.do?pageid=${pagecnt}">${pagecnt}</a></td>
					</c:forEach>
				</tr>
			</c:if>
		</c:forEach>
	</table>
</body>
</html>