<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>Title</title>
  </head>
  <body>
        <%@ include file="header.jsp" %>
        <h1>실습 JSTL 사용하기</h1>

        <p>${condition ? msg1 : msg2}</p>

        <h2>리스트 컬렉션 출력하기</h2>
         <c:forEach var="item" items="${lunchList}">
             <li>${item}</li>
         </c:forEach>

  </body>
</html>
