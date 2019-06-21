package com.cheer.service;

public interface UserService {
    /**
     * 校验登录信息，
     * @param uname 登录姓名
     * @param pwd   登录密码
     * @return  登录成功确认
     */
    boolean checkLogin(String uname,String pwd);
}
