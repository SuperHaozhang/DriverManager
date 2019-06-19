package com.cheer.servlet;

import com.cheer.pojo.Subject;
import com.cheer.service.Imp.SubjectServiceImp;
import com.cheer.service.SubjectService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "SubjectListServlet", urlPatterns = "/servlet/SubjectListServlet")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter writer = response.getWriter();
        SubjectService subjectService=new SubjectServiceImp();
        List<Subject> list=subjectService.getSubjectList();
        Gson gson=new Gson();
        String data=gson.toJson(list);
        //System.out.println(data);
        writer.println(data);
        writer.close();
    }
}
