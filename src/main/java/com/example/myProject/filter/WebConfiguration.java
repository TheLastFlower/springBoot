package com.example.myProject.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;

/**
 * 自定义拦截器
 */
@Configuration  //将自定义过滤器加入到过滤链
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    public class myFilter implements Filter {
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {



        }

        @Override
        public void destroy() {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        }
    }
}
