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
    <style>
        .container{
            margin-top:10px;
            width:100%;
            padding:0;
        }
        .row{
            border-bottom: 2px solid #2e6da4;
        }
    </style>
</head>
<body>

<!--搜索-->
<div class="container-fluid">
    <div class="row">
        <button class="btn btn-info" style="width: 100%">供应展示</button>
        <p>欢迎，${sessionScope.loginAdmin.name}</p>

        <form action="${pageContext.request.contextPath}/queryBy" method="post">
            <select name="by" class="col-md-2">
                <option value="name">供应商</option>
                <option value="leader">负责人</option>
            </select>
            <button class="btn btn-info"type="submit">搜索</button>
        </form>

        <button class="btn btn-info" type="button" onclick="location.href='${pageContext.request.contextPath}/add.jsp'">添加</button>
    </div>


    <!--主体内容-->
        <table class="table table-striped">
            <thead>
            <tr>
                <th>供应商-ID</th>
                <th>供应商名称</th>
                <th>负责人</th>
                <th>联系电话</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>

            <c:forEach items="${supplierList}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.leader}</td>
                <td>${s.phone}</td>
                <td>
                    <button class="btn btn-info" type="button" onclick="location.href='${pageContext.request.contextPath}/update.jsp?id=${s.id}&name=${s.name}&leader=${s.leader}&phone=${s.phone}'">编辑</button>
                    <button class="btn btn-info" type="button" onclick="location.href='${pageContext.request.contextPath}/delete?id=${s.id}'">删除</button>
                </td>
            </tr>
            </c:forEach>
         <tbody>
        </table>


        <div style="text-align: center;">
            <c:if test="${pageNum!=1}">
                <a href="${pageContext.request.contextPath}/queryAll?pageNum=${pageNum-1}" >上一页</a>
            </c:if>

            当前页：${pageNum}</li>

            <c:if test="${pageNum!=totalPage}">
                <a href="${pageContext.request.contextPath}/queryAll?pageNum=${pageNum+1}" >下一页</a>
            </c:if>
        </div>
</div>
</body>
</html>















