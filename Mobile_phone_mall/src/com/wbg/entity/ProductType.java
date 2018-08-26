package com.wbg.entity;

public class ProductType {
    int tid;
    String tname;
    String timg;


    public ProductType() {
    }

    public ProductType(String tname, String timg) {
        this.tname = tname;
        this.timg = timg;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }





    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", timg='" + timg + '\'' +
                '}';
    }

    public ProductType(int tid, String tname, String timg) {
        this.tid = tid;
        this.tname = tname;

        this.timg = timg;
    }
}
