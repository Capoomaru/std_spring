<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KangChanghan
  Date: 2022-07-19
  Time: 오후 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>응답 내용</title>
</head>
<body>
<p>응답 내용:</p>
<ul>
    <c:forEach var="resopnse" items="${answerData.responses}"
    varStatus="status">
        <li>${status.index+1}번 문항: ${resopnse}</li>
    </c:forEach>
</ul>
<p>응답자 위치: ${answerData.respondent.location}</p>
<p>응답자 나이: ${answerData.respondent.age}</p>
</body>
</html>
