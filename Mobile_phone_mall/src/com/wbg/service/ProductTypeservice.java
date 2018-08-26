package com.wbg.service;

import com.wbg.dao.ProductTypeDao;
import com.wbg.entity.Product;
import com.wbg.entity.ProductType;
import com.wbg.util.DBUtil;
import com.wbg.util.R;

public class ProductTypeservice {
    static  ProductTypeDao productTypeDao=new ProductTypeDao();
    static  R r=new R();
    public static String finAll(){
        r.setMsg("数据加载完成");
        r.setData(productTypeDao.finAll());
        return DBUtil.toJson(r);
    }
    public  static String delete(int id){
        if(productTypeDao.delete(id)){
            r.setMsg("删除成功");
        }
        else {
            r.setMsg("删除失败");
        }
        return DBUtil.toJson(r);
    }
    public  static String finById(int id){
        r.setMsg("数据加载完成");
        r.setData(productTypeDao.finById(id));
        return DBUtil.toJson(r);
    }
    public  static String finByName(String name){
        r.setMsg("请求成功");
        r.setData(productTypeDao.finByName(name));
        return DBUtil.toJson(r);
    }
    public static String add(ProductType productType){
        if(productTypeDao.add(productType))
        r.setMsg("添加成功");
        else
            r.setMsg("添加失败");
        return DBUtil.toJson(r);
    }
    public static String update(ProductType productType){

        if(productTypeDao.update(productType)){
            r.setMsg("修改成功");
        }
        else {
            r.setMsg("修改失败");
        }
        return DBUtil.toJson(r);
    }

}
