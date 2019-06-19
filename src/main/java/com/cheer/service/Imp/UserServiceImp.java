package com.cheer.service.Imp;


import com.cheer.dao.Imp.SubjectMapperImp;
import com.cheer.dao.SubjectMapper;
import com.cheer.pojo.User;
import com.cheer.service.UserService;
import com.cheer.utils.StringUtils;


public class UserServiceImp implements UserService {
    SubjectMapper subjectMapper = new SubjectMapperImp();
    @Override
    public boolean checkLogin(String uname, String pwd) {
        User user = subjectMapper.checkLogin(uname);
        if(user!=null){
            // 比较密码是否相同
            if (StringUtils.encrypt(pwd).equals(user.getPassword())) {
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
}
