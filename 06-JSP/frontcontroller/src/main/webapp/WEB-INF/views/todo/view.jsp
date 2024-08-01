<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <h1>Todo 목록보기</h1>
    <div>
        ${todoList}
        <a href="list">목록보기</a>
        <a href="update">수정하기</a>

    <form action="delete" method="POST">
        <input type="submit" value="삭제">
    </form>
    </div>
  </body>
</html>
