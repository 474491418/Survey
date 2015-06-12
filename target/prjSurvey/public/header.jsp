<%--
  User: envy15
  Date: 2015/4/10 0010
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>

    <script type="text/javascript" src="../javascript/jquery-2.0.2.js"></script>
    <script type="text/javascript" src="dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="javascript/jquery.cookie.js"></script>
    <script type="text/javascript" src="javascript/bootstrapValidator.js"></script>
    <link rel="stylesheet" href="../dist/css/bootstrap.min.css" type="text/css"/>
    <link rel="stylesheet" href="css/bootstrapValidator.css" type="text/css"/>
    <link rel="stylesheet" href="../css/public.css" type="text/css"/>

    <script type="text/javascript" src="../javascript/index.js"></script>
    <script type="text/javascript" src="../javascript/header.js"></script>
    <title></title>
</head>
<body>
<div id="header">
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="navbar-header">
            <a class="navbar-brand" style="font-size:32px;" href="../web/index.jsp">iSunLight</a>
        </div>
        <ul class="nav navbar-nav  " style="padding-left:80px; " id="nav1">
            <li><a href="../web/index.jsp">首页</a></li>
            <li><a href="#">参与调查</a></li>
            <li><a href="#">调查结果&nbsp;<span class="badge badge-danger">20</span></a></li>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">更多功能 <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">新建调查</a></li>
                    <li><a href="#">用户授权管理</a></li>
                    <li><a href="#">角色管理</a></li>
                    <li><a href="#">权限管理</a></li>
                    <li><a href="#">日志管理</a></li>
                </ul>
            </li>

        </ul>

        <form class="navbar-form navbar-right" style="padding-right:60px;">
            <div class="form-group" id="header_reg">
                <a href="#myModal" id="reg_a" data-target="popupCss" data-toggle="modal">注册</a>
                <a href="javascript:void(0)" id="member">用户</a>
                |
                <a href="javascript:void(0)" id="login_a">登录</a>

                <a href="javascript:void(0)" id="login_exit">退出</a>
            </div>
            <div class="form-group "><input type="text" class="form-control input-sm" style="width:200px;"
                                            placeholder="搜索一下你感兴趣的调查吧"></div>
            <button class="btn btn-success">寻找</button>
        </form>
    </nav>
</div>
<div class="modal fade " id="reg">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button class="close" type="button" data-dismiss="modal">&times;</button>
                <div class="modal-title">
                    快速注册
                </div>
            </div>
            <div class="modal-body">

                <s:form theme="simple" class="regFormCheck" namespace="/reg" method="POST" action="RegAction_doReg">
                    <div class="form-group">
                        <s:textfield type="text" id="inUserName" name="name" class="form-control" placeholder="请输入用户名"
                                     title="请输入用户名不少于6位"/>

                    </div>
                    <div class="form-group">
                        <s:textfield type="password" name="passWord" class="form-control" placeholder="请输入密码"
                                     title="请输入密码为数字字母的组合"/>
                    </div>
                    <div class="form-group">
                        <s:textfield type="password" name="confirm_password" class="form-control" placeholder="请再次确认密码"
                                     title="请再次确认密码"/>
                    </div>
                    <div class="form-group">
                        <s:textfield type="email" id="email" name="email" class="form-control"
                                     placeholder="请输入邮箱地址"/>
                    </div>
                    <div class="form-group">
                        <s:textfield type="text" id="nickname" name="nickName" class="form-control"
                                     placeholder="请输入你的昵称"/>
                    </div>


                    <div class="form-group " style="margin-left: 80%"><s:submit value="注册"
                                                                                class="btn btn-success"></s:submit>
                        <button class="btn btn-danger" id="form-cancel">重置</button>
                    </div>

                </s:form>

            </div>

        </div>

    </div>
</div>
</body>
</html>
