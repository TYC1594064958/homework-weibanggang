<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/23
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <style>
        img{
            width: 40px;
            height: 30px;
        }
        .marin{
            margin-left:10px ;
        }
    </style>
</head>
<title>查询产品信息</title>
<body>
<div style=" height: 50px;">
    <button class="btn btn-primary marin">多选下架</button><button class="btn btn-primary marin">多选上架</button>
</div>
<div style="height: 500px;overflow: auto">
<table class="table table-bordered ">
    <thead>
    <tr>
        <th><input type="checkbox" class="checked "/>&nbsp;全选</th>
        <th>编号</th>
        <th>名称</th>
        <th>价格</th>
        <th>图片</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody id="tbodyProduct">
    </tbody>
</table>
</div>
<%@include file="Productupdate.jsp"%>
<script>
    $(function () {
        seleAll();
        update();
    })

    function seleAll() {
        $.ajax({
            type: "get"
            , url: "<c:url value="/Productweb.do?action=finAll"/>"
            , success: function (data) {
                $.each(data.data, function (index, obj) {
                    var tr = $("<tr/>");
                    var tdcz=$("<td/>");
                    var check = $("<input type='checkbox' value='" + obj.pid + "'/>");
                    $("<td/>").html(check).appendTo(tr);
                    $("<td/>").html(obj.pid).appendTo(tr);
                    $("<td/>").html(obj.pname).appendTo(tr);
                    $("<td/>").html(obj.pprice).appendTo(tr);
                    var imgs=$("<img/>");
                    $(imgs).prop("src","/assets/imag/"+obj.pimg);
                    $("<td/>").html(imgs).appendTo(tr);
                    $("<td/>").html(obj.pstatus).appendTo(tr);
                    var button1=$("<a class='btn  btn-primary marin' data-toggle=\"modal\" data-target=\"#xg\" data-id="+obj.pid+">修改</a>");
                    var button2=$("<a class='btn  btn-primary marin'  onclick='selexx("+obj.pid+")' >详细</a>");
                    tdcz.append(button1).append(button2).appendTo(tr);
                    $("#tbodyProduct").append(tr);
                })
            }
            , error: function () {

            }
        })
    }
    function update() {
        $("#xg").on("show.bs.modal",function(e){
            $.ajax({
                type:"get"
                , url: "<c:url value="/Productweb.do?action=finById"/>"
                ,data:{pid:event.target.dataset['id']}
                ,success:function (data) {
                   $("#pid").val(data.data.pid),
                   $("#pname").val(data.data.pname),
                   $("#pprice").val(data.data.pprice),
                   $("#pnumber").val(data.data.pnumber),
                    $("#pimg").val(data.data.pimg),
                    $("#ptime").val(data.data.ptime),
                    $("#ptid").val(data.data.ptid),
                    data.data.pstatus=="上架中"?$("#pstatus").prop("checked",true):$("#nopstatus").prop("checked",true);
                }
            })
        })
    }
    function upda() {
        var pstatus="上架中";
        if($("#nopstatus").prop("checked")){
            pstatus="已下架";
        }
        $.ajax({
            type:"get",
            url:"/Productweb.do?action=update",
            data:{
                pid:$("#pid").val(),
                pname:$("#pname").val(),
                pprice:$("#pprice").val(),
                pnumber:$("#pnumber").val(),
                pimg:$("#pimg").val(),
                ptime:$("#ptime").val(),
                ptid:$("#ptid").val(),
                pstatus:pstatus,
            },
            success:function (data) {
                if(data.msg=="修改成功"){
                    location.reload();
                }
                alert(data.msg);
            }
        })
    }
    $(function () {
        $.ajax({
            type:"get",
            url: "<c:url value="/ProductTypeweb.do?action=finAll"/>",
            success:function (data) {
                var pid=$("#ptid");
                $.each(data.data,function (index,obj) {
                    var op=$("<option value='"+obj.tid+"'/>").html(obj.tname);
                    pid.append(op);
                })
            }
        })
    })
</script>
</body>
