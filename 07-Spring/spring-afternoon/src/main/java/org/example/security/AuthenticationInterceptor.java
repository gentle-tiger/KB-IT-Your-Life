package org.example.security;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// HandlerInterceptor는 3가지 핸들러를 등록할 수 있다.
public class AuthenticationInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
//        String requestURI = request.getRequestURI();
//        System.out.println("요청 URI : " + requestURI);
//
//        HttpSession session = request.getSession();  // 로그인 정보는 주로 세선에 저장함.
//        if (session.getAttribute("loginUser") == null) {
//            System.out.println("로그인이 안 된 상태입니다. 리다이렉트중 : /user/login ");
//            response.sendRedirect("/user/login");
//            return false;
//        }
//        return true;
//    }
}