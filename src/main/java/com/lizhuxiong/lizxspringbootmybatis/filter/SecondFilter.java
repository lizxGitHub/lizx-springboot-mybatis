package com.lizhuxiong.lizxspringbootmybatis.filter;


import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/27
 */
public class SecondFilter implements Filter {

    private static Map<String, String> urlToDataSourceMap = new HashMap();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        System.out.println("SecondFilter" + requestURI);
        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {

    }

}
