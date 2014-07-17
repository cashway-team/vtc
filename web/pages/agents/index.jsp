<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ page import="com.cashway.util.SpringUtils" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title><%=SpringUtils.getMessage("admin.index.title")%></title>
    <link href="${ctx}/resources/admin/css/common.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        .input .powered {
            font-size: 11px;
            text-align: right;
            color: #cccccc;
        }
    </style>
</head>
<body>
<div class="path">
    <%=SpringUtils.getMessage("admin.index.summary")%>
</div>
<table class="input">
    <tr>
        <th>
            <%=SpringUtils.getMessage("admin.index.systemName")%>
        </th>
        <td>
            ${systemName}
        </td>
        <th>
            <%=SpringUtils.getMessage("admin.index.systemVersion")%>
        </th>
        <td>
            ${systemVersion}
        </td>
    </tr>
    <tr>
        <th>
            <%=SpringUtils.getMessage("admin.index.javaVersion")%>
        </th>
        <td>
            ${javaVersion}
        </td>
        <th>
            <%=SpringUtils.getMessage("admin.index.javaHome")%>
        </th>
        <td>
            ${javaHome}
        </td>
    </tr>
    <tr>
        <th>
            <%=SpringUtils.getMessage("admin.index.osName")%>
        </th>
        <td>
            ${osName}
        </td>
        <th>
            <%=SpringUtils.getMessage("admin.index.osArch")%>
        </th>
        <td>
            ${osArch}
        </td>
    </tr>
    <tr>
        <th>
            <%=SpringUtils.getMessage("admin.index.serverInfo")%>
        </th>
        <td>
            ${serverInfo}
        </td>
        <th>
            <%=SpringUtils.getMessage("admin.index.servletVersion")%>
        </th>
        <td>
            ${servletVersion}
        </td>
    </tr>
    <tr>
        <td colspan="4">
            &nbsp;
        </td>
    </tr>
</table>
</body>
</html>