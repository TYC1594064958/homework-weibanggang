<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/25
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加管理员</title>
</head>
<div class="alert alert-primary" role="alert" id="zt">
    状态栏:
</div>
<div class="container">
        <div class="form-group ">
            <label for="aname">用户名</label>
            <input type="text" class="form-control" id="aname" placeholder="用户名">
        </div>
        <div class="form-group">
            <label for="apwd">密码</label>
            <input type="password" class="form-control" id="apwd"  placeholder="密码">
        </div>
        <div class="form-group ">
            <label for="Atype">管理员类型</label>
            <select type="text" class="form-control" id="atype"  >
                <option value="高级管理">高级管理</option>
                <option value="高级管理">普通管理</option>
            </select>
        </div>
        <div class="form-group">
            <label for="astatus" class="col-xs-1 control-label">状态</label>
            <div class="col-xs-10">
                <label class="radio-inline">
                    <input type="radio"  id="astatus" name="astatus"value="可用" checked>   可用
                </label>
                <label class="radio-inline">
                    <input type="radio" id="noastatus"  name="astatus" value="不可用">   不可用
                </label>
            </div>
        </div>
        <div><input type="button" value="添加" class="btn btn-primary" onclick="add()"></div>
</div>
<script>
    function add() {
        var astatus="不可用";
        if($("#astatus").prop("checked")){
            astatus="可用";
        }
        $.ajax({
            type:"post"
            , url: "<c:url value="/Adminsweb.do?action=add"/>"
            ,data:{
                aid: $("#aid").val(),
                aname: $("#aname").val(),
                apwd: $("#apwd").val(),
                atype: $("#atype").val(),
                astatus: astatus
            }
            ,success:function (data) {
                $("#zt").html("状态栏:"+data.msg);
            }
        })
    }
</script>