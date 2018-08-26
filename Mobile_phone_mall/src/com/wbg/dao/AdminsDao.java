package com.wbg.dao;

import com.wbg.InMemory.AdminsInMemory;
import com.wbg.entity.Admins;
import com.wbg.util.DBUtil;

import java.lang.ref.SoftReference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminsDao implements AdminsInMemory {

    @Override
    public List<Admins> finAll() {
        List<Admins> list=new ArrayList<>();
                Admins admins=null;
                String sql="select * from admins";
                ResultSet rs= DBUtil.executeQuery(sql);
                try{
                    while (rs.next()){
                        admins=new Admins(
                        rs.getInt("Aid"),
                        rs.getString("aname"),
                        rs.getString("apwd"),
                        rs.getString("atype"),
                        rs.getString("astatus")
                );
                list.add(admins);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public Boolean login(String aname,String apwd){
        String sql="select count(*) from admins where aname=? and apwd=?";
        Object[]in={aname,apwd};
        ResultSet rs=DBUtil.executeQuery(sql,in);
        try{
            if(rs.next()){
                    if(rs.getInt(1)>0){
                        return true;
                    }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }
    @Override
    public Admins finById(int id) {
        Admins admins=null;
        String sql="select * from admins where Aid=?";
        Object[]in={id};
        ResultSet rs=DBUtil.executeQuery(sql,in);
        try{
            while (rs.next()){
                admins=new Admins(
                        rs.getInt("Aid"),
                        rs.getString("Aname"),
                        rs.getString("Apwd"),
                        rs.getString("Atype"),
                        rs.getString("Astatus")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return admins;
    }

    @Override
    public List<Admins> finByName(String name) {
        List<Admins> list=new ArrayList<>();
        Admins admins=null;
        Object[]in={name};
        String sql="select * from admins where Aname like '%?%'";
        ResultSet rs= DBUtil.executeQuery(sql,in);
        try{
            while (rs.next()){
                admins=new Admins(
                        rs.getInt("Aid"),
                        rs.getString("Aname"),
                        rs.getString("apwd"),
                        rs.getString("atype"),
                        rs.getString("astatus")
                );
                list.add(admins);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from admins where aid=?";
        Object [] in={id};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Admins admins) {
        String sql="insert into admins(aname,apwd,atype,astatus)values(?,?,?,?)";
        Object [] in={admins.getAname(),admins.getApwd(),admins.getAtype(),admins.getAstatus()};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Admins admins) {
        String sql="update admins set aname=?,atype=?,astatus=? where aid=?";
        Object [] in={admins.getAname(),admins.getAtype(),admins.getAstatus(),admins.getAid()};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }
    public boolean updatepwd(Admins admins) {
        String sql="update admins set apwd=? where aid=?";
        Object [] in={admins.getApwd(),admins.getAid()};
        if(DBUtil.executeUpdate(sql,in)>0){
            return true;
        }
        return false;
    }
}
