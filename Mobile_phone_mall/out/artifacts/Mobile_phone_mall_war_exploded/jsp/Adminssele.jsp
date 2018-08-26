<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/25
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>查询管理员</title>
<body>
<div style="height: 50px;">
</div>
<div style="height: 500px;overflow: auto">
    <table class="table table-bordered ">
        <thead>
        <tr>
            <th><input type="checkbox" class="checked"/>&nbsp;多选</th>
            <th>用户名</th>
            <th>管理类型</th>
            <th>状态</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="tbodyProduct">
        </tbody>
    </table>
    <%@include file="Adminsupdate.jsp"%>
</div>
<script>
    $(function () {
        seleAll();
        update();
    })
    function seleAll() {
        $.ajax({
            type: "get"
            , url: "<c:url value="/Adminsweb.do?action=finAll"/>"
            , success: function (data) {
                $("#tbodyProduct tr").remove();
                $.each(data.data, function (index, obj) {
                    var tr = $("<tr/>");
                    var tdcz=$("<td/>");
                    var check = $("<input type='checkbox' value='" + obj.aid + "'/>");
                    $("<td/>").html(check).appendTo(tr);
                    $("<td/>").html(obj.aname).appendTo(tr);
                    $("<td/>").html(obj.atype).appendTo(tr);
                    $("<td/>").html(obj.astatus).appendTo(tr);
                    var button1=$("<a class='btn btn-sm btn-primary' data-toggle=\"modal\" data-target=\"#xg\" data-id=\""+obj.aid+"\" >修改</a>");
                    var button2=$("<a class='btn btn-sm btn-primary'  onclick='deleteid("+obj.aid+")'>删除</a>");
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
                    url: "<c:url value="/Adminsweb.do?action=delete"/>"
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
        var astatus="不可用";
        if($("#astatus").prop("checked")){
            astatus="可用";
        }
        $.ajax({
            type:"post"
            , url: "<c:url value="/Adminsweb.do?action=update"/>"
            ,data:{
                aid: $("#aid").val(),
                aname: $("#aname").val(),
                atype: $("#atype").val(),
                astatus: astatus
            }
            ,success:function (data) {
                if(data.msg=="修改成功"){
                    $("#close").trigger("click");
                    seleAll();
                }
                alert(data.msg);
            }
        })
    }
    function update() {
        $("#xg").on("show.bs.modal",function(e){
            $.ajax({
                type:"get"
                , url: "<c:url value="/Adminsweb.do?action=finById"/>"
                ,data:{id:event.target.dataset['id']}
                ,success:function (data) {
                    $("#aid").val(data.data.aid);
                    $("#aname").val(data.data.aname);
                    $("#atype").val(data.data.atype);
                  data.data.astatus=="可用"?$("#astatus").prop("checked",true):$("#noastatus").prop("checked",true);

                }
            })
        })
    }
</script>
