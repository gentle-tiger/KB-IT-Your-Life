<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
        <%@ include file="header.jsp" %>
        <h1>SCOPE_CHECK</h1>

        <h2>Request 스코프</h2>
        <p>${request != null ? request : "request 없는데요"}</p>
        <hr/>
        <!--  브라우저가 종료되었을 때 데이터가 사라지므로 데이터가 남아 있다. -->
        <h2>Session 스코프</h2>
        <p>${session != null ? session : "session 없는데요"}</p>
        <hr/>
        <!--  서버가 종료되었을 때 데이터가 사라지므로 데이터가 남아 있다. -->
        <h2>Application 스코프</h2>
        <p>${application != null ? application : "application 없는데요"}</p>
        <hr/>

        <h2>Page 스코프</h2>
        <p>${page != null ? page : "page 없는데요"}</p>
  </body>
</html>
