package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==================拦截前============");

        HttpSession session = request.getSession();
        if(session.getAttribute("username")!=null){
            return true;
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
        System.out.println("拦截后");

            return false;
    }
}
