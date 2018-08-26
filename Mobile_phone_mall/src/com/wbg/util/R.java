package com.wbg.util;
public class R {
    int count;
    String msg;
    Object data;
    int code;

   public String toJson(){
       return DBUtil.toJson(this);
   }

    public R() {
    }

    public R(int count, String msg, Object data, int code) {
        this.count = count;
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
