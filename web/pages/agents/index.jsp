<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ page import="com.cashway.util.SpringUtils" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title><%=SpringUtils.getMessage("admin.index.title")%></title>
    <script type="text/javascript" src="${ctx}/dwr/engine.js"></script>
    <script type="text/javascript" src="${ctx}/dwr/util.js"></script>
    <script type="text/javascript" src="${ctx}/dwr/interface/MessagePushService.js"></script>
    <script type="text/javascript" src="${ctx}/resources/admin/js/jquery.js"></script>
    <link href="${ctx}/resources/admin/css/common.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .input .powered {
            font-size: 11px;
            text-align: right;
            color: #cccccc;
        }
    </style>

    <script type="text/javascript" language="JavaScript">
        $(document).ready(function () {
            dwr.engine.setActiveReverseAjax(true);
            dwr.engine.setNotifyServerOnPageUnload(true);
        });

        function showMessage(msg) {
            alert(msg);
        }

        function testDWR() {
            MessagePushService.testDwrService("param", function(data) {
                alert(data);
            });
        }

    </script>


</head>
<body>
<div class="path">
    <%=SpringUtils.getMessage("admin.index.summary")%>
</div>
<table class="input">
    <tr>
        <td align="center">
            <textarea rows="20" cols="50"></textarea>
            <textarea rows="20" cols="50"></textarea>
        </td>
    </tr>
    <tr>
        <td>
            <input type="button" value="签到" />
            <input type="button" value="签出" />
            <input type="button" value="测试DWR" onclick="javascript:testDWR();"/>

        </td>
    </tr>

</table>
</body>
</html>