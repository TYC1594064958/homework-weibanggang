package com.wbg.service;

import com.wbg.dao.ProductDao;
import com.wbg.entity.Product;
import com.wbg.util.DBUtil;
import com.wbg.util.R;
import java.util.List;

public class Productservice {
    static ProductDao productDao=new ProductDao();
    static R r=new R();
    public static String finAll(){
        r.setMsg("数据加载");
        r.setData(productDao.finAll());
        System.out.println(DBUtil.toJson(r));
        return DBUtil.toJson(r);
    }
    public static String finById(String id){
        r.setMsg("数据加载完成");
        r.setData(productDao.finById(id));
        return DBUtil.toJson(r);
    }
    public  static String finByName(String name){
        r.setMsg("请求成功");
        r.setData(productDao.finByName(name));
        return DBUtil.toJson(r);
    }
    public static String add(Product product){
        if(productDao.add(product))
            r.setMsg("添加成功");
        else
            r.setMsg("添加失败");
        return DBUtil.toJson(r);
    }
    public static String update(Product product){
        if(productDao.update(product))
        r.setMsg("修改成功");
        else
            r.setMsg("修改失败");
        return DBUtil.toJson(r);
    }
    public static String delete(String pid){
        if(productDao.delete(pid))
            r.setMsg("删除成功");
        else
            r.setMsg("删除失败");
        return DBUtil.toJson(r);
    }
}
