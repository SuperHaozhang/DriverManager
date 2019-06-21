package com.cheer.service.Imp;

import com.cheer.dao.Imp.SubjectMapperImp;
import com.cheer.dao.SubjectMapper;
import com.cheer.pojo.Subject;
import com.cheer.service.SubjectService;

import java.util.List;

public class SubjectServiceImp implements SubjectService {
/*    public static void main(String[] args) {
        SubjectServiceImp a = new SubjectServiceImp();
        a.getKey();
    }*/
    SubjectMapper subjectMapper = new SubjectMapperImp();

    /**
     *
     * @param sub 题目封装成对象
     * @return
     */
    @Override
    public int insert(Subject sub) {
        int i = subjectMapper.insert(sub);
        if(i>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        return i;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Subject> getSubjectList() {
        List<Subject> subjectList=subjectMapper.getSubjectList();
        return subjectList;
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> getKey() {
        List<String> keyList=subjectMapper.getKey();
        return keyList;
    }
}
