<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JS = Hello World</title>
  </head>
  <body>
   <%@ include file="header.jsp" %>
   <h1>컨트롤러에 의해 배달된 about.jsp 파일입니다</h1>
   <h2>${msg}</h2>
   <img src=${img} alt="어서와" />
  </body>
</html>
