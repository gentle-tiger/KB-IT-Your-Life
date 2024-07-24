<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>

<%
  // 에러를 발생
//   throw new RemoteException("테스트 예외 발생");
    int a = 4;
    int b = 0;
    int result = a / b;

%>