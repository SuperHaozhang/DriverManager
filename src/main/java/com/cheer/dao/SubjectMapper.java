package com.cheer.dao;

import com.cheer.pojo.Subject;
import com.cheer.pojo.User;
import com.cheer.pojo.Xueyuan;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubjectMapper {
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


    User checkLogin(@Param("uname") String username);

    /**
     * 获取学员
     * @param name 学员的名字
     * @param pwd   学员的密码
     * @return
     */
    Xueyuan getXueYuan(@Param("name") String name,@Param("pwd") String pwd);

    /**
     * 查询学员信息
     * @param id
     * @return
     */
    Xueyuan getOne(int id);

    /**
     * 获取所有答案
     * @return 保存在List容器中
     */
    List<String> getKey();

    /**
     * 更新学员的信息
     * @param x 学员的唯一id
     * @return
     */
    int update(Xueyuan x);
}
