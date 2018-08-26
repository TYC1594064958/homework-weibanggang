package com.wbg.entity;

public class Admins {
    int aid;
    String aname;
    String apwd;
    String atype;
    String astatus;

    public Admins() {
    }

    public Admins(String aname, String apwd, String atype, String astatus) {
        this.aname = aname;
        this.apwd = apwd;
        this.atype = atype;
        this.astatus = astatus;
    }

    @Override
    public String toString() {
        return "admins{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apwd='" + apwd + '\'' +
                ", atype='" + atype + '\'' +
                ", astatus='" + astatus + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public String getAstatus() {
        return astatus;
    }

    public void setAstatus(String astatus) {
        this.astatus = astatus;
    }

    public Admins(int aid, String aname, String apwd, String atype, String astatus) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
        this.atype = atype;
        this.astatus = astatus;
    }
}
