package com.wbg.InMemory;

import com.wbg.entity.Admins;

import java.util.List;

public interface AdminsInMemory {
    List<Admins> finAll();
    Admins finById(int id);
    List<Admins> finByName(String name);
    boolean delete(int id);
    boolean add(Admins admins);
    boolean update(Admins admins);
}
