package com.wbg.entity;

import java.util.Date;

public class OrderInformation {
    String oid;//订单编号
    Date otime;//下单日期
    Date osuretime;//确定订单日期
    int ouid;//用户编号
    String kd;//快递类型
    String address;//订单地址
    double omoney;//订单总价
    String ostatus;//订单状态
    String otype;//备注
    @Override
    public String toString() {
        return "OrderInformation{" +
                "oid='" + oid + '\'' +
                ", otime=" + otime +
                ", osuretime=" + osuretime +
                ", ouid=" + ouid +
                ", kd='" + kd + '\'' +
                ", address='" + address + '\'' +
                ", omoney=" + omoney +
                ", ostatus='" + ostatus + '\'' +
                ", otype='" + otype + '\'' +
                '}';
    }



    public OrderInformation() {
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public Date getOsuretime() {
        return osuretime;
    }

    public void setOsuretime(Date osuretime) {
        this.osuretime = osuretime;
    }

    public int getOuid() {
        return ouid;
    }

    public void setOuid(int ouid) {
        this.ouid = ouid;
    }

    public String getKd() {
        return kd;
    }

    public void setKd(String kd) {
        this.kd = kd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getOmoney() {
        return omoney;
    }

    public void setOmoney(double omoney) {
        this.omoney = omoney;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype;
    }

    public OrderInformation(String oid, Date otime, Date osuretime, int ouid, String kd, String address, double omoney, String ostatus, String otype) {
        this.oid = oid;
        this.otime = otime;
        this.osuretime = osuretime;
        this.ouid = ouid;
        this.kd = kd;
        this.address = address;
        this.omoney = omoney;
        this.ostatus = ostatus;
        this.otype = otype;
    }
}
