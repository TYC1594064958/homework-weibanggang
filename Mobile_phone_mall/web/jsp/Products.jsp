<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/23
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>我是pr</title>
<body>
<table id="tb_order"></table>

<script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>
<script>
    $(function () {
        //初始化Table
        $('#tb_order').bootstrapTable({
            url: '/Productweb.do?action=finAll',         //请求后台的URL（*）
            method: 'get',                      //请求方式（*）
            //toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: queryParams,//传递参数（*）
            dataType:'json',
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            rowStyle: function (row, index) {
                //这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
                console.log(row);
                var strclass = "";
                if (row.ORDER_STATUS == "待排产") {
                    strclass = 'success';//还有一个active
                }
                else if (row.ORDER_STATUS == "已删除") {
                    strclass = 'danger';
                }
                else {
                    return {};
                }
                return { classes: strclass }
            },
            columns: [{
                checkbox: true
            }, {
                field: 'pid',
                title: '订单编号'
            }, {
                field: 'ORDER_TYPE',
                title: '订单类型'
            }, {
                field: 'ORDER_STATUS',
                title: '订单状态'
            }, {
                field: 'REMARK',
                title: '备注'
            }, ]
        });
    })
    /**查询条件与分页数据 */
    function queryParams(pageReqeust) {
        //console.log("-----params-----");
        pageReqeust.userName = "admin";  //
        pageReqeust.querys = "123";
        pageReqeust.pageNo = "456";
        console.log(pageReqeust);
        return pageReqeust;
    }
</script>
</body>
