package org.spring.springboot.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
@WebFilter(filterName = "doFilter", urlPatterns = "/*")
public class DoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        String URL = servletRequest.get();
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String URI = httpServletRequest.getRequestURI();
        HttpSession session = httpServletRequest.getSession();
//        if (session.getAttribute(SESSION_KEY) != null || "/login".equals(URI)) {
//            filterChain.doFilter(httpServletRequest, servletResponse);
//        } else {
//            httpServletRequest.setAttribute("", "/login");
//            filterChain.doFilter(httpServletRequest, servletResponse);
//        }
        StringBuffer URL = httpServletRequest.getRequestURL();
//        httpServletRequest.login("admin", "admin");
        String servletName = servletRequest.getServerName();
        String IP = servletRequest.getRemoteAddr();
        String webIP = servletRequest.getLocalAddr();
        filterChain.doFilter(httpServletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
