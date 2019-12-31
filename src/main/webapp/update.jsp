<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

</head>
<body>

<!--主体内容-->
<div class="container">
    <form action="${pageContext.request.contextPath}/update" method="post">
        <input type="hidden" name="id"  class="form-control" value="${param.id}" />
        <div class="form-group has-success">
            <label class="control-label">供应商名称</label>
            <input type="text" name="name"  class="form-control" value="${param.name}" />
        </div>
        <div class="form-group has-error">
            <label class="control-label">负责人</label>
            <input type="text" name="leader" class="form-control" value="${param.leader}" />
        </div>
        <div class="form-group has-success">
            <label class="control-label">联系电话</label>
            <input type="text" name="phone" class="form-control" value="${param.phone}" />
        </div>
      <%--  <div class="form-group has-error">
            <label class="control-label">添加日期</label>
            <input type="text" name="create_date" class="form-control" value="${param.create_date}"/>
        </div>--%>
        <button type="submit" class="btn btn-primary">修改</button>
    </form>

</div>
</body>
</html>















