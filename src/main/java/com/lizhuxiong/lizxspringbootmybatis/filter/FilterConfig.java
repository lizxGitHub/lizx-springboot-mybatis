package com.lizhuxiong.lizxspringbootmybatis.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * Filter是基于函数回调的，而Interceptor则是基于Java反射的。
 * Filter依赖于Servlet容器，而Interceptor不依赖于Servlet容器。
 * Filter对几乎所有的请求起作用，而Interceptor只能对action请求起作用。
 * Interceptor可以访问Action的上下文，值栈里的对象，而Filter不能。
 * 在action的生命周期里，Interceptor可以被多次调用，而Filter只能在容器初始化时调用一次。
 *
 *
 *
 *
 *
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/27
 */
@Configuration
public class FilterConfig {

    /**
     * filter的一种配置方法 filter执行顺序由order设置 注意urlPatterns路径务必要写对
     *
     * 还有一种配置方法参见https://blog.csdn.net/fxbin123/article/details/82558174
     * @ServletComponentScan("com.pandy.blog.filters")
     *
     */

    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/teacher/getTeacherOne/*");
        registration.setName("MyFilter");
        registration.setOrder(2);
        return registration;
    }

    @Bean
    public FilterRegistrationBean secondFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SecondFilter());
        registration.addUrlPatterns("/teacher/getTeacherMany/*");
//        registration.addUrlPatterns("/*");
        registration.setName("secondFilter");
        registration.setOrder(1);
        return registration;
    }

}
