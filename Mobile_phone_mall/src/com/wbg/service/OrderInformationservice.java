package com.wbg.service;

import com.wbg.dao.OrderInformationDao;
import com.wbg.entity.OrderInformation;
import com.wbg.util.DBUtil;
import com.wbg.util.R;

public class OrderInformationservice {
    static OrderInformationDao orderdetailsDao=new OrderInformationDao();
    static R r=new R();
    public static String finAll(){
        r.setMsg("数据加载完成");
        r.setData(orderdetailsDao.finAll());
        return DBUtil.toJson(r);
    }
    public static String finById(int id){
        r.setMsg("数据加载完成");
        r.setData(orderdetailsDao.finById(id));
        return DBUtil.toJson(r);
    }
    public  static String finByName(String name){
        r.setMsg("请求成功");
        r.setData(orderdetailsDao.finByName(name));
        return DBUtil.toJson(r);
    }
    public static String add(OrderInformation orderInformation){
        r.setMsg("添加成功");
        r.setData(orderdetailsDao.add(orderInformation));
        return DBUtil.toJson(r);
    }
    public static String update(OrderInformation orderInformation){
        r.setMsg("修改成功");
        r.setData(orderdetailsDao.update(orderInformation));
        return DBUtil.toJson(r);
    }
}
