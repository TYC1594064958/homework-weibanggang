package com.wbg.service;

import com.wbg.dao.UsersDao;
import com.wbg.entity.Users;
import com.wbg.util.DBUtil;
import com.wbg.util.R;

public class Usersservice {
    static UsersDao usersDao=new UsersDao();
    static R r=new R();
    public static String finAll(){
        r.setMsg("数据加载完成");
        r.setData(usersDao.finAll());
        return DBUtil.toJson(r);
    }
    public static String finById(int id){
        r.setMsg("数据加载完成");
        r.setData(usersDao.finById(id));
        return DBUtil.toJson(r);
    }
    public  static String finByName(String name){
        r.setMsg("请求成功");
        r.setData(usersDao.finByName(name));
        return DBUtil.toJson(r);
    }
    public static String add(Users users){
        r.setMsg("添加成功");
        r.setData(usersDao.add(users));
        return DBUtil.toJson(r);
    }
    public static String update(Users users){
        r.setMsg("修改成功");
        r.setData(usersDao.update(users));
        return DBUtil.toJson(r);
    }
}
