package com.wbg.entity;

public class Orderdetails {
    int dtid;//编号
    String dtpid;//产品编号
    int dtnumber;//数量
    String dtoid;//订单编号
    public Orderdetails() {
    }

    public int getDtid() {
        return dtid;
    }

    public void setDtid(int dtid) {
        this.dtid = dtid;
    }

    @Override
    public String toString() {
        return "Orderdetails{" +
                "dtid=" + dtid +
                ", dtpid='" + dtpid + '\'' +
                ", dtnumber=" + dtnumber +
                ", dtoid='" + dtoid + '\'' +
                '}';
    }

    public String getDtpid() {
        return dtpid;
    }

    public void setDtpid(String dtpid) {
        this.dtpid = dtpid;
    }

    public int getDtnumber() {
        return dtnumber;
    }

    public void setDtnumber(int dtnumber) {
        this.dtnumber = dtnumber;
    }

    public String getDtoid() {
        return dtoid;
    }

    public void setDtoid(String dtoid) {
        this.dtoid = dtoid;
    }

    public Orderdetails(int dtid, String dtpid, int dtnumber, String dtoid) {
        this.dtid = dtid;
        this.dtpid = dtpid;
        this.dtnumber = dtnumber;
        this.dtoid = dtoid;
    }
}
