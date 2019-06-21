package com.cheer.servlet;

import com.cheer.pojo.Xueyuan;
import com.cheer.service.Imp.XueyuanImp;
import com.cheer.service.XueService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "OneServlet", urlPatterns = "/servlet/OneServlet")
public class OneServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置请求编码格式:
        request.setCharacterEncoding("utf-8");
        //设置响应编码格式
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //获取session对象
        HttpSession hs=request.getSession();
        //获取在session中的数据
        int id = (Integer)(hs.getAttribute("id"));
        //调用'学员'业务层获取学员对象
        XueService xueService = new XueyuanImp();
        Xueyuan x = xueService.getOne(id);
        List<Xueyuan> list = new ArrayList<Xueyuan>();
        list.add(x);
        Gson gson=new Gson();
        String data=gson.toJson(list);
        writer.println(data);
        writer.close();
    }
}
