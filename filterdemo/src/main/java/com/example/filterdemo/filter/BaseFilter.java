package com.example.filterdemo.filter;

import com.example.filterdemo.config.FilterConfig;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author duwen
 * @className BaseFilter
 * @date 2018/11/22 13:42
 * @description filter学习demo
 */
@Slf4j
public class BaseFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
       log.info("baseFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         log.info("servletRequest: {}",servletRequest.getAttributeNames());
         log.info("baseFilter doFilter");
         filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("baseFilter destory");
    }
}
