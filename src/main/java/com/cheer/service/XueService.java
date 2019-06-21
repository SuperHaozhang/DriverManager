package com.cheer.service;

import com.cheer.pojo.Xueyuan;

public interface XueService {
    /**
     * 获取学员
     * @param name 学员的名字
     * @param pwd   学员的密码
     * @return
     */
    Xueyuan getXueYuan(String name,String pwd);

    /**
     * 更新学员的信息
     * @param x 学员的唯一id
     * @return
     */
    int update(Xueyuan x);

    /**
     * 查询学员信息
     * @param id
     * @return
     */
    Xueyuan getOne(int id);
}
