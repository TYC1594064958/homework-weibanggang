<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/23
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <title><sitemesh:title></sitemesh:title></title>
    <meta content="Admin Dashboard" name="description"/>
    <meta content="ThemeDesign" name="author"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <%@include file="frame_css.jsp" %>
    <script src="<c:url value="/assets/js/jquery.min.js"/>"></script>
    <sitemesh:head></sitemesh:head>
</head>
<body class="fixed-left">
<!-- Loader -->
<div id="preloader">
    <div id="status">
        <div class="spinner"></div>
    </div>
</div>

<!-- Begin page -->
<div id="wrapper">
    <!--左边-->
<%@include file="frame_left.jsp"%>
    <!--右边-->
    <div class="content-page">

        <div class="content">
            <!--头部-->
            <%@include file="frame_top.jsp"%>
            <div class="page-content-wrapper ">
                    <sitemesh:body></sitemesh:body>
            </div>
        </div>

        <!--底部-->
        <footer class="footer">
            © 2018 Agency - Crafted with <i class="mdi mdi-heart text-danger"></i> by Lamarena.
        </footer>

    </div>
</div>
<!-- js -->
<%@include file="frame_js.jsp" %>
</body>