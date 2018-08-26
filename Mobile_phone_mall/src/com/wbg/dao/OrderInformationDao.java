package com.wbg.dao;

import com.wbg.InMemory.OrderInformationInMemory;
import com.wbg.entity.OrderInformation;

import java.util.List;

public class OrderInformationDao implements OrderInformationInMemory {

    @Override
    public List<OrderInformation> finAll() {
        return null;
    }

    @Override
    public OrderInformation finById(int oid) {
        return null;
    }

    @Override
    public List<OrderInformation> finByName(String oname) {
        return null;
    }

    @Override
    public boolean delete(int pid) {
        return false;
    }

    @Override
    public boolean add(OrderInformation orderInformation) {
        return false;
    }

    @Override
    public boolean update(OrderInformation orderInformation) {
        return false;
    }
}
