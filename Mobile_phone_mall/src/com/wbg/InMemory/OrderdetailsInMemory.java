package com.wbg.InMemory;
import com.wbg.entity.Orderdetails;
import java.util.List;
public interface OrderdetailsInMemory {
    List<Orderdetails> finAll();
    Orderdetails finById(int oid);
    List<Orderdetails> finByName(String oname);
    boolean delete(int pid);
    boolean add(Orderdetails orderdetails);
    boolean update(Orderdetails orderdetails);
}
