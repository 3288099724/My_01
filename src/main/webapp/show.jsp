<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<!--顶部导航-->
<div class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#cc">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="" class="navbar-brand">Brand</a>
        </div>
        <div class="navbar-collapse collapse" id="cc">
            <ul class="nav navbar-nav">
                <li><a href="">首页</a></li>
                <li><a href="">用户中心</a></li>
                <li><a href="">联系我们</a></li>
                <li><a href="">客服</a></li>
            </ul>
        </div>
    </div>
</div>
<!--主体内容-->
<div class="container">
    <div class="row">
        <!--左侧导航-->
        <div class="col-md-3">
            <div class="panel-group" id="acc">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <a href="#pc1" class="panel-title" data-toggle="collapse" data-parent="#acc">库存管理</a>
                    </div>
                    <div class="panel-collapse collapse" id="pc1">
                        <div class="panel-body">
                            <div class="list-group">
                                <a href="${pageContext.request.contextPath}/category/queryAll" class="btn btn-info list-group-item">库存</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <a href="#pc2" class="panel-title" data-toggle="collapse" data-parent="#acc">出入库管理</a>
                    </div>
                    <div class="panel-collapse collapse" id="pc2">
                        <div class="panel-body" style="text-align: center">
                            <div>
                                <a href="${pageContext.request.contextPath}/product/queryAll" class="btn btn-info" style="width: 80%">出入库</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <a href="#pc3" class="panel-title" data-toggle="collapse" data-parent="#acc">人员管理</a>
                    </div>
                    <div class="panel-collapse collapse" id="pc3">
                        <div class="panel-body" style="text-align: center">
                            <div>
                                <a href="${pageContext.request.contextPath}/user/queryAll" class="btn btn-info" style="width: 80%">人员</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <a href="#pc4" class="panel-title" data-toggle="collapse" data-parent="#acc">基础数据</a>
                    </div>
                    <div class="panel-collapse collapse" id="pc4">
                        <div class="panel-body" style="text-align: center">
                            <div>
                                <a href="${pageContext.request.contextPath}/queryAll?pageNum=1" class="btn btn-info" style="width: 80%">数据</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <a href="#pc5" class="panel-title" data-toggle="collapse" data-parent="#acc">系统维护</a>
                    </div>
                    <div class="panel-collapse collapse" id="pc5">
                        <div class="panel-body" style="text-align: center">
                            <div>
                                <a href="${pageContext.request.contextPath}/user/queryAll" class="btn btn-info" style="width: 80%">维护</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
</body>
</html>















