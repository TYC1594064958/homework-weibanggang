package com.wbg.dao;

import com.wbg.InMemory.ProductTypeInMemory;
import com.wbg.entity.Product;
import com.wbg.entity.ProductType;
import com.wbg.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductTypeDao implements ProductTypeInMemory {
    public  List<ProductType> finAll(){
        List<ProductType> list=new ArrayList<>();
        String sql="select * from ProductType";
        ResultSet rs= DBUtil.executeQuery(sql);
        ProductType productType=null;
        try{
            while (rs.next()){
                productType=new ProductType(
                        rs.getInt("tid"),
                        rs.getString(2),
                        rs.getString("timg")
                );
                list.add(productType);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public  List<ProductType> finByName(String tname){
        List<ProductType> list=new ArrayList<>();
        String sql="select * from ProductType where tname=?";
        Object[]in={tname};
        ResultSet rs= DBUtil.executeQuery(sql,in);
        ProductType productType=null;
        try{
            while (rs.next()){
                productType=new ProductType(
                        rs.getInt("tid"),
                        rs.getString("tname"),
                        rs.getString("timg")
                );
                list.add(productType);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delete(int pid) {
        String sql="delete from productType where tid=?";
        Object[]in={pid};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;

    }

    public  ProductType finById(int tid){
        String sql="select * from ProductType where tid=?";
        Object[]in={tid};
        ResultSet rs= DBUtil.executeQuery(sql,in);
        ProductType productType=null;
        try{
            if (rs.next()){
                productType=new ProductType(
                        rs.getInt("tid"),
                        rs.getString("tname"),
                        rs.getString("timg")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return productType;
    }
    public  boolean add(ProductType productType){
        String sqls="select count(*) from ProductType where tname=?";
        Object[] ins={productType.getTname()};
        ResultSet rs=DBUtil.executeQuery(sqls,ins);
        try {
            if(rs.next()){
                    if(rs.getInt(1)>0)
                        return false;
            }
        }catch (SQLException E){
            E.printStackTrace();
        }

       String sql=" insert into ProductType(tname,timg) values(?,?)";
       Object[] in={productType.getTname(),productType.getTimg()};
       if(DBUtil.executeUpdate(sql,in)>0){
           return true;
       }
        return false;
    }
    public  boolean update(ProductType productType){
        String sql=" update ProductType set tname=? ,timg=? where tid=?";
        Object[] in={productType.getTname(),productType.getTimg(),productType.getTid()};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }
}
