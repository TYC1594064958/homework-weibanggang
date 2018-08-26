package com.wbg.dao;

import com.wbg.InMemory.UsersInMemory;
import com.wbg.entity.Users;

import java.util.List;

public class UsersDao implements UsersInMemory {
    @Override
    public List<Users> finAll() {
        return null;
    }

    @Override
    public Users finById(int oid) {
        return null;
    }

    @Override
    public List<Users> finByName(String oname) {
        return null;
    }

    @Override
    public boolean delete(int pid) {
        return false;
    }

    @Override
    public boolean add(Users admins) {
        return false;
    }

    @Override
    public boolean update(Users admins) {
        return false;
    }
}
