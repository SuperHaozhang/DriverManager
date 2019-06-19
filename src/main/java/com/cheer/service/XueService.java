package com.cheer.service;

import com.cheer.pojo.Xueyuan;

public interface XueService {
    Xueyuan getXueYuan(String name,String pwd);

    int update(Xueyuan x);

    Xueyuan getOne(int id);
}
