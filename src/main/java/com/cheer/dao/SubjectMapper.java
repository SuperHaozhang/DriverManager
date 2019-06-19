package com.cheer.dao;

import com.cheer.pojo.Subject;
import com.cheer.pojo.User;
import com.cheer.pojo.Xueyuan;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubjectMapper {
    int insert(Subject sub);

    List<Subject> getSubjectList();

    /**
     *
     */
    User checkLogin(@Param("uname") String username);

    Xueyuan getXueYuan(@Param("name") String name,@Param("pwd") String pwd);

    Xueyuan getOne(int id);

    List<String> getKey();

    int update(Xueyuan x);
}
