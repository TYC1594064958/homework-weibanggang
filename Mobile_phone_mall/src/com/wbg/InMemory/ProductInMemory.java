package com.wbg.InMemory;

import com.wbg.entity.Product;

import java.util.List;

public interface ProductInMemory {
     List<Product> finAll();
     Product finById(String pid);
     List<Product> finByName(String pname);
     boolean delete(String pid);
     boolean add(Product product);
     boolean update(Product product);
}
