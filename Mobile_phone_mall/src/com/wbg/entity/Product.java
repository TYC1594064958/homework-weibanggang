package com.wbg.entity;

import java.util.Date;

public class Product {

    //编号
    //名称
    //价格
    //图片
    //状态
    //操作
    String pid;//编号
    String pname;//名称
    double pprice;//价格
    int pnumber;//库存数量
    String pimg;//图片
    Date ptime;//发布时间
    int ptid;//品牌类型
    String pstatus;//状态
    //商品类型
    String tname;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Product(String pid, String pname, double pprice, int pnumber, String pimg, Date ptime, int ptid, String pstatus, String tname) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.pnumber = pnumber;
        this.pimg = pimg;
        this.ptime = ptime;
        this.ptid = ptid;
        this.pstatus = pstatus;
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", pnumber=" + pnumber +
                ", pimg='" + pimg + '\'' +
                ", ptime=" + ptime +
                ", ptid=" + ptid +
                ", pstatus='" + pstatus + '\'' +
                '}';
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public int getPnumber() {
        return pnumber;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public int getPtid() {
        return ptid;
    }

    public void setPtid(int ptid) {
        this.ptid = ptid;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public Product(String pid, String pname, double pprice, int pnumber, String pimg, Date ptime, int ptid, String pstatus) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.pnumber = pnumber;
        this.pimg = pimg;
        this.ptime = ptime;
        this.ptid = ptid;
        this.pstatus = pstatus;
    }


}
