<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/25
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <style>
        img{
            width: 80px;
        }
        .main{
            margin-left: 5px;
        }
    </style>
</head>
<title>查询商品类型</title>
<body>
<div style="height: 50px;">
    <button class='btn btn-sm btn-primary' data-toggle="modal" data-target="#xg" onclick="insert()" >添加新类型</button>
</div>
<div style=" height: 500px;overflow: auto">
    <table class="table table-bordered ">
        <thead>
        <tr>
            <th><input type="checkbox" class="checked"/>&nbsp;多选</th>
            <th>编号</th>
            <th>类型名称</th>
            <th>图片</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="tbodyProduct">
        </tbody>
    </table>
    <%@include file="ProductTypeupdate.jsp"%>
</div>
<script>
    $(function () {
        seleAll();
    })
    function seleAll() {
        $.ajax({
            type: "get"
            , url: "<c:url value="/ProductTypeweb.do?action=finAll"/>"
            , success: function (data) {
                $("#tbodyProduct tr").remove();
                $.each(data.data, function (index, obj) {
                    var tr = $("<tr/>");
                    var tdcz=$("<td/>");
                    var check = $("<input type='checkbox' value='" + obj.tid + "'/>");
                    $("<td/>").html(check).appendTo(tr);
                    $("<td/>").html(obj.tid).appendTo(tr);
                    $("<td/>").html(obj.tname).appendTo(tr);
                    var imgs=$("<img/>");
                    $(imgs).prop("src","/assets/imag/"+obj.timg);
                    $("<td/>").html(imgs).appendTo(tr);
                    var button1=$("<a class='btn main btn-primary' data-toggle=\"modal\" data-target=\"#xg\" onclick='update("+obj.tid+")'>修改</a>");
                    var button2=$("<a class='btn main btn-primary'  onclick='deleteid("+obj.tid+")'>删除</a>");
                    tdcz.append(button1).append(button2).appendTo(tr);
                    $("#tbodyProduct").append(tr);
                })
            }
            , error: function () {

            }
        })
    }
    function deleteid(id){
        if(confirm("是否删除?")){
            $.ajax({
                type:"get",
                url: "<c:url value="/ProductTypeweb.do?action=delete"/>"
                ,data:{id:id}
                ,success:function (data) {
                    if(data.msg==="删除成功"){
                        seleAll();
                    }
                    alert(data.msg);
                },
                error:function () {

                }
            })
        }
    }
    function upda() {
       if($("#oks").html()=="确认修改"){
           $.ajax({
               type:"get"
               , url: "<c:url value="/ProductTypeweb.do?action=update"/>"
               ,data:{
                   tid: $("#tid").val(),
                   tname: $("#tname").val(),
                   timg: $("#timg").val()
               }
               ,success:function (data) {
                   if(data.msg=="修改成功"){
                   }
                   alert(data.msg);
               }
           })
       }else {
           $.ajax({
               type:"post"
               , url: "<c:url value="/ProductTypeweb.do"/>"
               ,data:{
                   tname: $("#tname").val(),
                   timg: $("#timg").val()
               }
               ,success:function (data) {
                   if(data.msg=="添加成功"){
                   }
                   alert(data.msg);
               }
           })
       }

    }
    function update(id) {
        $("#tiddiv").prop("hidden","");
        $("#exampleModalLabel").html("修改信息");
        $("#oks").html("确认修改");
            $.ajax({
                type:"get"
                , url: "<c:url value="/ProductTypeweb.do?action=finById"/>"
                ,data:{id:id}
                ,success:function (data) {
                    $("#tid").val(data.data.tid);
                    $("#tname").val(data.data.tname);
                    $("#timg").val(data.data.timg);
                }
            })
    }
    function insert() {
        $("#tiddiv").prop("hidden","hidden");
            $("#exampleModalLabel").html("添加商品类型");
            $("#oks").html("添加");
            $("#tname").val("");
            $("#timg").val("");
    }
</script>

