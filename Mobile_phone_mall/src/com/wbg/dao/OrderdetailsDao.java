package com.wbg.dao;

import com.wbg.InMemory.OrderdetailsInMemory;
import com.wbg.entity.Orderdetails;
import com.wbg.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderdetailsDao  implements OrderdetailsInMemory {

    @Override
    public List<Orderdetails> finAll() {
        List<Orderdetails> list = new ArrayList<>();
        Orderdetails orderdetails = null;
        String sql = "select * from Orderdetails";
        ResultSet rs = DBUtil.executeQuery(sql);
        try {
            while (rs.next()) {
                orderdetails = new Orderdetails(
                       rs.getInt("dtid"),
                       rs.getString("dtpid"),
                        rs.getInt("dtnumber"),
                        rs.getString("dtoid")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
                list.add(orderdetails);
                return list;

    }

    @Override
    public Orderdetails finById(int oid) {

        return null;
    }

    @Override
    public List<Orderdetails> finByName(String oname) {
        return null;
    }

    @Override
    public boolean delete(int pid) {
        return false;
    }

    @Override
    public boolean add(Orderdetails orderdetails) {

        return false;
    }

    @Override
    public boolean update(Orderdetails orderdetails) {
        return false;
    }
}
