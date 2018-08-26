package com.wbg.service;

import com.wbg.dao.AdminsDao;
import com.wbg.entity.Admins;
import com.wbg.util.DBUtil;
import com.wbg.util.R;

import java.util.Date;

public class Adminsservice {
    static AdminsDao adminsDao=new AdminsDao();
    static R r=new R();
    public static String finAll(){
        r.setMsg("数据加载完成");
        r.setData(adminsDao.finAll());
        return DBUtil.toJson(r);
    }
    public static String login(String aname,String apwd){
        if(adminsDao.login(aname,apwd))
            r.setMsg("ok");
        else {
            r.setMsg("账号密码不一致");
        }
        return DBUtil.toJson(r);
    }
    public static String finById(int id){
        r.setMsg("数据加载完成");
        r.setData(adminsDao.finById(id));
        return DBUtil.toJson(r);
    }
    public  static String finByName(String name){
        r.setMsg("请求成功");
        r.setData(adminsDao.finByName(name));
        return DBUtil.toJson(r);
    }
    public static String add(Admins admins){
        if(adminsDao.add(admins))
            r.setMsg("操作时间:"+DBUtil.toJson(new Date())+",添加用户名为："+admins.getAname()+"添加成功!");
        else {
            r.setMsg("操作时间:"+DBUtil.toJson(new Date())+",添加用户名为："+admins.getAname()+"添加失败!");
        }
        return DBUtil.toJson(r);
    }
    public static String update(Admins admins){
        if(adminsDao.update(admins))
            r.setMsg("修改成功");
        else {
            r.setMsg("修改失败");
        }
        return DBUtil.toJson(r);
    }
    public static String updatepwd(Admins admins){
        if(adminsDao.updatepwd(admins))
            r.setMsg("修改成功");
        else {
            r.setMsg("修改失败");
        }
        return DBUtil.toJson(r);
    }
    public static String delete(int id){
        if(adminsDao.delete(id))
        r.setMsg("删除成功");
        else {
            r.setMsg("删除失败");
        }
        return DBUtil.toJson(r);
    }
    public static String logingo(int id){
        if(adminsDao.delete(id))
            r.setMsg("删除成功");
        else {
            r.setMsg("删除失败");
        }
        return DBUtil.toJson(r);
    }
}
