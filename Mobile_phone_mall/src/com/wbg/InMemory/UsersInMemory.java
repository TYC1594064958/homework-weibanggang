package com.wbg.InMemory;

import com.wbg.entity.Users;

import java.util.List;

public interface UsersInMemory {
    List<Users> finAll();
    Users finById(int oid);
    List<Users> finByName(String oname);
    boolean delete(int pid);
    boolean add(Users admins);
    boolean update(Users admins);
}
