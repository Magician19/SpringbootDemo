package com.example.filterdemo.config;

import com.example.filterdemo.interceptor.BaseInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author duwen
 * @className InterceptorConfig
 * @date 2018/11/22 14:33
 * @description 拦截器配置类
 */
@Slf4j
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("进入拦截器注册");
        registry.addInterceptor(handlerInterceptor())
                .addPathPatterns("/*");
    }

    /**
     * @description 返回自定义的拦截器
     * @param
     * @return org.springframework.web.servlet.HandlerInterceptor
     * @author duwen
     * @date 2018/11/22 14:36
     */
    @Bean
    public HandlerInterceptor handlerInterceptor(){
        return new BaseInterceptor();
    }
}
