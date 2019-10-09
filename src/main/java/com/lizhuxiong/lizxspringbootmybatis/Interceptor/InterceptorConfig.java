package com.lizhuxiong.lizxspringbootmybatis.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
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
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
