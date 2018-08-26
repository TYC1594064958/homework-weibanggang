package com.wbg.InMemory;

import com.wbg.entity.OrderInformation;

import java.util.List;
public interface OrderInformationInMemory {
    List<OrderInformation> finAll();
    OrderInformation finById(int oid);
    List<OrderInformation> finByName(String oname);
    boolean delete(int pid);
    boolean add(OrderInformation orderInformation);
    boolean update(OrderInformation orderInformation);
}
