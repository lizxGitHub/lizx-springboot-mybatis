package com.lizhuxiong.lizxspringbootmybatis.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/27
 */

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
