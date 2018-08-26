<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/25
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<div class="container">
        <div class="form-group ">
            <label for="pid">商品编号</label>
            <input type="text" class="form-control" id="pid"  placeholder="商品编号">
        </div>
        <div class="form-group">
            <label for="pname">商品名称</label>
            <input type="text" class="form-control" id="pname" placeholder="商品名称">
        </div>
        <div class="form-group ">
            <label for="pprice">价格</label>
            <input type="number" class="form-control" id="pprice" placeholder="价格">
        </div>
        <div class="form-group ">
            <label for="pnumber">库存数量</label>
            <input type="number" class="form-control" id="pnumber"  placeholder="库存数量">
        </div>
        <div class="form-group ">
            <label for="ptime">发布时间</label>
            <input type="date" class="form-control" id="ptime"  placeholder="发布时间">
        </div>
    <div class="form-group ">
        <label for="pimg">图片路径</label>
        <input type="text" class="form-control" id="pimg"  placeholder="图片路径">
    </div>
    <div class="form-group">
        <label for="pstatus" class="col-xs-1 control-label">状态</label>
        <div class="col-xs-10">
            <label class="radio-inline">
                <input type="radio"  id="pstatus" name="pstatus"value="上架中" checked>   上架
            </label>
            <label class="radio-inline">
                <input type="radio" id="nopstatus"  name="pstatus" value="已下架">   下架
            </label>
        </div>
    </div>
        <div class="form-group">
            <label for="ptid">商品类型</label>
            <select type="text" class="form-control" id="ptid" name="ptid" placeholder="press"></select>
        </div>
        <div><input type="button"  class="btn btn-primary" onclick="insert()" value="添加"/></div>
</div>
<script>
    function insert() {
        var pstatus="上架中";
        if($("#nopstatus").prop("checked")){
            pstatus="已下架";
        }
        $.ajax({
            type:"post",
            url:"/Productweb.do",
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
                if(data.msg=="添加成功"){
                location.reload();
                }
                alert(data.msg);
            }
        })
    }
    $(function () {
        $.ajax({
            type:"post",
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
</html>
