<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/24
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <title>Title</title>

<body>
<input type="checkbox" value="香蕉"/>香蕉
<input type="checkbox" value="苹果"/>苹果
<input type="checkbox" value="可乐"/>可乐
<button type="button" onclick="ddd()">测试</button>
<script src="assets/js/jquery.min.js"></script>
<script>
   function ddd() {
       var chelist=[];
       $.each($("input:checked"),function (index,obj) {
         chelist.push(obj.value);
       })
       alert(chelist.length==0?"没有选择数据":"当前选择:"+chelist.join("/"));
   }
   $("input[type=checkbox]").click(function (e) {
         $("input:checked").prop("checked",false);
         $(this).prop("checked",true);
   })
</script>
</body>
</html>
