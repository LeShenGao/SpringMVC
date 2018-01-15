<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/15
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/item/updateItem.action" method="post">
    <input type="hidden" name="id" value="${item.id}"/><br/>
    <input type="text" name="name" value="${item.name}"/><br/>
    <input type="text" name="price" value="${item.price}"/><br/>
    <input type="text" name="createtime"
           value="<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" /><br/>
    <textarea name="detail">${item.detail}</textarea><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>
