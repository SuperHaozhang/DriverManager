package com.cheer.servlet;

import com.cheer.pojo.Xueyuan;
import com.cheer.service.Imp.SubjectServiceImp;
import com.cheer.service.Imp.XueyuanImp;
import com.cheer.service.SubjectService;
import com.cheer.service.XueService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "AnswerServlet", urlPatterns = "/servlet/AnswerServlet")
public class AnswerServlet extends HttpServlet {
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

        int id = (Integer)(hs.getAttribute("id"));
        String name = (String)(hs.getAttribute("username"));
        System.out.println(id+name);
        SubjectService ss = new SubjectServiceImp();
        List<String> keyList = ss.getKey();
        String[] ans = request.getParameterValues("ans");
        int j = 0;
        int k = 0;
        for (int i = 0; i <ans.length ; i++) {
            if(ans[i].equals(keyList.get(i).split("：")[1])){
                j++;
            }else{
                k++;
            }
        }
        //System.out.println(j+k);
        Xueyuan x = new Xueyuan(id,name,null,j,k,0,j);
        XueService xueService = new XueyuanImp();
        int update = xueService.update(x);
        writer.println(update);
        writer.close();
        //response.sendRedirect("/driver/result.html");
    }
}
