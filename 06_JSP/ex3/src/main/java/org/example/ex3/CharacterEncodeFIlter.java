package org.example.ex3;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Filter;

@WebFilter (urlPatterns={ "/*" })
public class CharacterEncodeFIlter  implements Filter {

    @Override
    public void init(FilterConfig fConfig) throws ServletException {}

    @Override
    public void destory(){}

    @Override
    public void deFilter(ServletRequest request, servletResponse response, FilterChain chain)
                throws IOException, ServletException{
        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request,response);
    }
}
