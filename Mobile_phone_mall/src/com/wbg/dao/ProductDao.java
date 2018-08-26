package com.wbg.dao;

import com.wbg.InMemory.ProductInMemory;
import com.wbg.entity.Product;
import com.wbg.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDao implements ProductInMemory {

    public  List<Product> finAll(){
        List<Product> list=new ArrayList<>();
        Product product=null;
        String sql="select * from Product";
        ResultSet rs= DBUtil.executeQuery(sql);
        try{
            while (rs.next()){
                product=new Product(
                     rs.getString("pid"),
                     rs.getString("pname"),
                        rs.getDouble("pprice"),
                        rs.getInt("pnumber"),
                        rs.getString("pimg"),
                        rs.getDate("ptime"),
                        rs.getInt("ptid"),
                        rs.getString("pstatus")
                );
                list.add(product);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Product finById(String pid) {
        Product product=null;
        String sql="select * from Product where pid=?";
        Object[] in={pid};
        ResultSet rs= DBUtil.executeQuery(sql,in);
        try{
            if (rs.next()){
                product=new Product(
                        rs.getString("pid"),
                        rs.getString("pname"),
                        rs.getDouble("pprice"),
                        rs.getInt("pnumber"),
                        rs.getString("pimg"),
                        rs.getDate("ptime"),
                        rs.getInt("ptid"),
                        rs.getString("pstatus")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return product;
    }


    public  List<Product> finByName(String pname){
        List<Product> list=new ArrayList<>();
        Product product=null;
        String sql="select * from Product where pname like '%?%'";
        Object[] in={pname};
        ResultSet rs= DBUtil.executeQuery(sql,in);
        try{
            while (rs.next()){
                product=new Product(
                        rs.getString("pid"),
                        rs.getString("pname"),
                        rs.getDouble("pprice"),
                        rs.getInt("pnumber"),
                        rs.getString("pimg"),
                        rs.getDate("ptime"),
                        rs.getInt("ptid"),
                        rs.getString("pstatus")
                );
                list.add(product);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delete(String pid) {
        String sql="delete from Product where pid=?";
        Object[] in={pid};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }
    public  boolean add(Product product){
        String sqls="select count(*) from product where pname=? or pid=?";
        Object[] ins={product.getPname(),product.getPid()};
        ResultSet rs=DBUtil.executeQuery(sqls,ins);
        try {
            if(rs.next()){
                if(rs.getInt(1)>0)
                    return false;
            }
        }catch (SQLException E){
            E.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        String sql="insert into Product(pid,pname,pprice,pnumber,pimg,ptime,ptid,pstatus)values(?,?,?,?,?,?,?,?);";
        Object[] in={product.getPid(),product.getPname(),product.getPprice(),product.getPnumber(),product.getPimg(),product.getPtime(),product.getPtid(),product.getPstatus()};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }
    public  boolean update(Product product){
        String sql="update Product set pname=?,pprice=?,pnumber=?,pimg=?,ptime=?,ptid=?,pstatus=? where pid=?";
        Object[] in={product.getPname(),product.getPprice(),product.getPnumber(),product.getPimg(),product.getPtime(),product.getPtid(),product.getPstatus(),product.getPid()};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }
}
