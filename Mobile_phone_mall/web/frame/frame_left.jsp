<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/20
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- ========== Left Sidebar Start ========== -->
<div class="left side-menu">
    <button type="button" class="button-menu-mobile button-menu-mobile-topbar open-left waves-effect">
        <i class="ion-close"></i>
    </button>

    <!-- LOGO -->
    <div class="topbar-left">
        <div class="text-center">
            <!--放logo-->
            <a href="index.html" class="logo"><img src="<c:url value="/assets/images/logo.png"/>" height="33" alt="logo"></a>
        </div>
    </div>
    <div class="sidebar-inner slimscrollleft">
        <div class="user-details">
            <div class="text-center">
                <!--头像-->
                <img src="<c:url value="/assets/images/toux.png"/>" alt="" class="rounded-circle">
            </div>
            <div class="user-info">
                <!--名称-->
                <h4 class="font-16 text-white">管理员</h4>
                <span class="text-white"><i class="fa fa-dot-circle-o text-success"></i> 韦邦杠</span>
            </div>
        </div>

        <div id="sidebar-menu">
            <ul>
                <li class="has_sub active nav-active">
                    <a href="javascript:void(0);" class="waves-effect"><i class="ti-light-bulb"></i>
                        <span> 商品管理 </span> <span class="pull-right"><i class="mdi mdi-chevron-right"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="<c:url value="/jsp/Productsele.jsp"/>">查询商品信息</a></li>
                        <li><a href="<c:url value="/jsp/Productadd.jsp"/> ">添加商品信息</a></li>
                        <li><a href="<c:url value="/jsp/ProductTypesele.jsp"/>">查询商品类型</a></li>
                    </ul>
                    </a>
                </li>
                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="ti-light-bulb"></i>
                        <span> 用户管理 </span> <span class="pull-right"><i class="mdi mdi-chevron-right"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="<c:url value="/jsp/Userssele.jsp"/>">查询用户信息</a></li>
                        <li><a href="<c:url value="/jsp/Usersadd.jsp"/>">添加用户信息</a></li>
                    </ul>
                </li>
                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="ti-light-bulb"></i>
                        <span> 管理员管理 </span> <span class="pull-right"><i class="mdi mdi-chevron-right"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="<c:url value="/jsp/Adminssele.jsp"/>">查询管理员信息</a></li>
                        <li><a href="<c:url value="/jsp/Adminsadd.jsp"/>">添加管理员信息</a></li>
                    </ul>
                </li>
                <li class="has_sub">
                    <a href="javascript:void(0);" class="waves-effect"><i class="ti-light-bulb"></i>
                        <span> 订单管理 </span> <span class="pull-right"><i class="mdi mdi-chevron-right"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="<c:url value="/jsp/Productadd.jsp"/>">查询订单管理</a></li>
                    </ul>
                </li>

            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
    <!-- end sidebarinner -->
</div>
<!-- Left Sidebar End -->