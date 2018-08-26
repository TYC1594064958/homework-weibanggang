package com.wbg.InMemory;

import com.wbg.entity.ProductType;

import java.util.List;

public interface ProductTypeInMemory {
    List<ProductType> finAll();
    ProductType finById(int pid);
    List<ProductType> finByName(String pname);
    boolean delete(int pid);
    boolean add(ProductType product);
    boolean update(ProductType product);
}
