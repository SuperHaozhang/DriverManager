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
        //获取登录学员的id
        int id = (Integer)(hs.getAttribute("id"));
        //获取登录学员的名字
        String name = (String)(hs.getAttribute("username"));
        //调用题目业务层代码
        SubjectService ss = new SubjectServiceImp();
        //获取数据库中的所有答案
        List<String> keyList = ss.getKey();
        //获取前台发送过来的答案
        String[] ans = request.getParameterValues("ans");
        int j = 0;//记录正确答案
        int k = 0;//记录错误答案
        for (int i = 0; i <ans.length ; i++) {
            if(ans[i].equals(keyList.get(i).split("：")[1])){
                j++;
            }else {
                k++;
            }
        }
        //创建答题对象，存储提交答案的数据
        Xueyuan x = new Xueyuan(id,null,null,j,k,keyList.size()-(j+k),j*10);
        //调用'学员'业务层
        XueService xueService = new XueyuanImp();
        int update = xueService.update(x);
        writer.println(update);
        writer.close();
    }
}
