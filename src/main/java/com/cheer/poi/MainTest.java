package com.cheer.poi;

import com.cheer.pojo.Subject;
import com.cheer.service.Imp.SubjectServiceImp;
import com.cheer.service.SubjectService;

import java.util.List;

public class MainTest {

    public void uploadExcel(String src){
        SubjectService subjectService=new SubjectServiceImp();
        // 设定Excel文件所在路径
        String excelFileName = src;
        // 读取Excel文件内容
        List<Subject> readResult = ExcelReader.readExcel(excelFileName);

        for(Subject a:readResult){
            subjectService.insert(a);
        }
    }
}