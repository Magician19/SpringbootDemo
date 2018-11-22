package com.example.filterdemo.config;

import com.example.filterdemo.filter.BaseFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author duwen
 * @className FilterConfig
 * @date 2018/11/22 14:12
 * @description filter的配置类
 */

@Slf4j
public class FilterConfig {

    /**
     * @description filter注册器
     * @param 	
     * @return org.springframework.boot.web.servlet.FilterRegistrationBean  
     * @author duwen 
     * @date 2018/11/22 14:15 
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        log.info("进入filter注册器");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new BaseFilter());
        filterRegistrationBean.setName("BaseFilter");
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
    
}
