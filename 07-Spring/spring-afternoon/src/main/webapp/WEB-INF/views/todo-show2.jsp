<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Member List</title>
  </head>
  <body>
      <%@ include file="header.jsp" %>
      <h1>TODO 목록 V2</h1>
      <ul>
            <li><b>ID - NAME</b></li>
            <c:forEach var="todo" items="${todoList}">
                <li>${todo.todo}</li>
            </c:forEach>

      <ul>


  </body>
</html>
