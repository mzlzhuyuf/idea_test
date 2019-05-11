<%--
  Created by IntelliJ IDEA.
  User: Hero
  Date: 2019/5/11
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户录入页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/customer/save.action" method="post">
        客户姓名：<input type="text" name="name"><br>
        客户性别：<input type="text" name="gender"><br>
        客户年龄：<input type="text" name="age"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
