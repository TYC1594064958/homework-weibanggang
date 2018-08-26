package com.wbg.entity;

public class Users {
    int uid;
    String uLoginName;
    String uLoginPassword;
    String uEmail;
    String uName;
    String usex;
    String uTel;
    String uAddress;
    String ustatus;

    @Override
    public String toString() {
        return "users{" +
                "uid=" + uid +
                ", uLoginName='" + uLoginName + '\'' +
                ", uLoginPassword='" + uLoginPassword + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uName='" + uName + '\'' +
                ", usex='" + usex + '\'' +
                ", uTel='" + uTel + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    public Users() {
    }

    public Users(int uid, String uLoginName, String uLoginPassword, String uEmail, String uName, String usex, String uTel, String uAddress, String ustatus) {
        this.uid = uid;
        this.uLoginName = uLoginName;
        this.uLoginPassword = uLoginPassword;
        this.uEmail = uEmail;
        this.uName = uName;
        this.usex = usex;
        this.uTel = uTel;
        this.uAddress = uAddress;
        this.ustatus = ustatus;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName;
    }

    public String getuLoginPassword() {
        return uLoginPassword;
    }

    public void setuLoginPassword(String uLoginPassword) {
        this.uLoginPassword = uLoginPassword;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
