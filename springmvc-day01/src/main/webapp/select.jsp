<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/15
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/springmvc-day01/item/select.action" method="post">
    根据id查询:<input type="text" name="item.id" value=""/>
    根据商品名称进行查询:<input type="text" name="item.name" value=""/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>
