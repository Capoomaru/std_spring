<%--
  Created by IntelliJ IDEA.
  User: KangChanghan
  Date: 2022-07-19
  Time: 오후 5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="member.register" /></title>
</head>
<body>
<h2><spring:message code="term" /></h2>
<p>약관 내용</p>
<form action="step2" method="post">
    <label>
        <input type="checkbox" name="agree" value="true">
        <spring:message code="term.agree" />
    </label>
    <input type="submit" value="<spring:message code="next.btn" />"/>
</form>
</body>
</html>
