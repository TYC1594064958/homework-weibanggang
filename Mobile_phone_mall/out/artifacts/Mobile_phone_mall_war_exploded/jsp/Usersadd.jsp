<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/25
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户信息</title>
</head>
<body>
<div class="container">
    <form method="post" >
        <div class="form-group ">
            <label for="uLoginName">用户名</label>
            <input type="text" class="form-control" id="uLoginName" name="uLoginName" placeholder="用户名">
        </div>
        <div class="form-group">
            <label for="uLoginPassword">密码</label>
            <input type="text" class="form-control" id="uLoginPassword" name="uLoginPassword" placeholder="密码">
        </div>
        <div class="form-group ">
            <label for="uEmail">Email</label>
            <input type="number" class="form-control" id="uEmail" name="uEmail" placeholder="Email">
        </div>
        <div class="form-group ">
            <label for="uName">姓名</label>
            <input type="number" class="form-control" id="uName" name="uName" placeholder="姓名">
        </div>
        <div class="form-group ">
            <label for="uSex">性别</label>
            <input type="date" class="form-control" id="uSex" name="uSex" placeholder="性别">
        </div>
        <div class="form-group">
            <label for="uTel">电话</label>
            <input type="date" class="form-control" id="uTel" name="uTel" placeholder="电话">
        </div>
        <div class="form-group">
            <label for="uAddress">地址</label>
            <select type="text" class="form-control" id="uAddress" name="uAddress" placeholder="地址"></select>
        </div>
        <div class="form-group">
            <label for="ustatus">状态</label>
            <select type="text" class="form-control" id="ustatus" name="ustatus" placeholder="状态"></select>
        </div>
        <div><input type="submit" class="btn btn-primary"></div>
    </form>
</div>
</body>
</html>
