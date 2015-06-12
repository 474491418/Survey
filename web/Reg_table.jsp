<%--
  User: envy15
  Date: 2015/4/10 0010
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <%@include file="public_css_header.jsp" %>
    <link rel="stylesheet" type="text/css" href="css/Reg_table.css"/>
    <title></title>
</head>
<body>


<div class="table-responsive">
    <table class="table table-hover table-condensed">
        <s:form theme="simple">
            <th class="th_color" colspan="2" style="text-align: center">注册新用户</th>
            <tr>
                <td class="right_float">Email:</td>
                <td><s:textfield name="email" class="text_long"/></td>
            </tr>
            <tr>
                <td class="right_float">密码:</td>
                <td><s:textfield name="password" class="text_long"/></td>
            </tr>
            <tr>
                <td class="right_float">确认密码:</td>
                <td><s:textfield name="confirm_password" class="text_long"/></td>
            </tr>
            <tr>
                <td class="right_float">昵称:</td>
                <td><s:textfield name="nickname" class="text_long"/></td>
            </tr>
            <tr><td colspan="2" style="text-align: center" ><s:submit value="确定" class="btn btn-success"></s:submit></td></tr>
        </s:form>
    </table>
</div>


</body>
</html>
