package com.cheer.servlet;

import com.cheer.pojo.Xueyuan;
import com.cheer.service.Imp.UserServiceImp;
import com.cheer.service.Imp.XueyuanImp;
import com.cheer.service.UserService;
import com.cheer.service.XueService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet2", urlPatterns = "/servlet/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
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
        System.out.println(username+password);
        XueService xueService = new XueyuanImp();
        if(xueService.getXueYuan(username,password)!=null){
            //获取session对象
            HttpSession hs=request.getSession();
            Xueyuan x = xueService.getXueYuan(username,password);
            int i = x.getId();
            //将用户数据存储到session对象中
            hs.setAttribute("id",i);
            hs.setAttribute("username",username);
            //重定向
            response.sendRedirect("/driver/answer1.html");
            return;
        }else{
            response.sendRedirect("/driver/xueyuan.html");
            return;
        }
    }
}
