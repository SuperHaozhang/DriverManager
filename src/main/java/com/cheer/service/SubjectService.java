package com.cheer.service;

import com.cheer.pojo.Subject;

import java.util.List;

public interface SubjectService {
    /**
     * 把题目插入数据库中
     * @param sub 题目封装成对象
     * @return 成功返回 1，失败返回 0
     */
    int insert(Subject sub);

    /**
     * 获取全部题目
     * @return 保存在List容器中
     */
    List<Subject> getSubjectList();

    /**
     * 获取所有答案
     * @return 保存在List容器中
     */
    List<String> getKey();
}
