package com.cheer.service;

import com.cheer.pojo.Subject;

import java.util.List;

public interface SubjectService {
    int insert(Subject sub);
    List<Subject> getSubjectList();
    List<String> getKey();
}
