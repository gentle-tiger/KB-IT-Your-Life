package org.example.boardservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(urlPatterns = "/*")
public class EncodingServlet implements Filter {

    // 추상 메서드
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8"); // 요청받은 문자 인코딩을 UTP-8로 변환
        response.setContentType("text/html;charset=UTF-8"); // 응답하는 콘텐츠 타입읠 test/html로, 문자 인코딩을 UTP-8로 변환


        // 다음 filter가 doFilter() 메서드를 실행
        chain.doFilter(request, response);
    }
}
