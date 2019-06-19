package com.cheer.servlet;

import com.cheer.service.Imp.UserServiceImp;
import com.cheer.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/servlet/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置请求编码格式:
        request.setCharacterEncoding("utf-8");
        //设置响应编码格式
        response.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //获取请求信息
        String username=request.getParameter("uname");
        String password =request.getParameter("pwd");
        UserService userService = new UserServiceImp();
        if(userService.checkLogin(username,password)){
            //获取session对象
            HttpSession hs=request.getSession();
            //将用户数据存储到session对象中
            hs.setAttribute("username",username);

            //重定向
            response.sendRedirect("/driver/SubjectList.html");
            return;
        }else{
            //获取session对象
            HttpSession hs=request.getSession();
            hs.setAttribute("flag",0);
            response.sendRedirect("/driver/admin_login.html");
            return;
        }
    }
}
