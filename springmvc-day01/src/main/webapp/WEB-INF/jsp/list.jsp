<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/14
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>展示商品信息</title>
</head>
<body>
<table>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>生产日期</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list }" var="item">
        <tr>
            <td>${item.name }</td>
            <td>${item.price }</td>
            <td><ftm:formatDate value="${item.createtime }" pattern="yyyy-MM-dd HH:mm:ss"></ftm:formatDate></td>
            <td>${item.detail }</td>
            <td><a href="#">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
