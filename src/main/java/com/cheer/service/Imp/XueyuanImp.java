package com.cheer.service.Imp;

import com.cheer.dao.Imp.SubjectMapperImp;
import com.cheer.dao.SubjectMapper;
import com.cheer.pojo.Xueyuan;
import com.cheer.service.XueService;

public class XueyuanImp implements XueService {
    SubjectMapper subjectMapper = new SubjectMapperImp();

    /**
     *
     * @param name 学员的名字
     * @param pwd   学员的密码
     * @return
     */
    @Override
    public Xueyuan getXueYuan(String name, String pwd) {
        Xueyuan x = subjectMapper.getXueYuan(name,pwd);
        if(x==null){
            System.out.println("用户不存在");
            return null;
        }else{
            return x;
        }
    }

    /**
     *
     * @param x 学员的唯一id
     * @return
     */
    @Override
    public int update(Xueyuan x) {
        int i = subjectMapper.update(x);
        if(i>0){
            System.out.println("修改成功");
            return i;
        }else{
            System.out.println("修改失败");
            return i;
        }

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Xueyuan getOne(int id) {
        Xueyuan x = subjectMapper.getOne(id);
        if(x==null){
            System.out.println("用户不存在");
            return null;
        }else{
            return x;
        }
    }
}
