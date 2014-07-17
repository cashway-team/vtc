<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ page import="com.cashway.util.SpringUtils" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title><%=SpringUtils.getMessage("admin.main.title")%></title>
    <link href="${ctx}/resources/admin/css/common.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/resources/admin/css/main.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${rc.contextPath}/resources/admin/js/jquery.js"></script>
    <style type="text/css">
        *{
            font: 12px tahoma, Arial, Verdana, sans-serif;
        }
        html, body {
            width: 100%;
            height: 100%;
            overflow: hidden;
        }
    </style>
    <script type="text/javascript">
        $().ready(function() {

            var $nav = $("#nav a:not(:last)");
            var $menu = $("#menu dl");
            var $menuItem = $("#menu a");

            $nav.click(function() {
                var $this = $(this);
                $nav.removeClass("current");
                $this.addClass("current");
                var $currentMenu = $($this.attr("href"));
                $menu.hide();
                $currentMenu.show();
                return false;
            });

            $menuItem.click(function() {
                var $this = $(this);
                $menuItem.removeClass("current");
                $this.addClass("current");
            });

        });
    </script>
</head>
<body>
<script type="text/javascript">
    if (self != top) {
        top.location = self.location;
    };
</script>
<table class="main">
<tr>
    <th>
        <div>Welcome, <strong><shiro:principal /></strong></div>
    </th>
    <th>
        <div id="nav" class="nav">
            <ul>
                <c:forTokens items="admin:account,admin:role,admin:organization,admin:clientType,
                admin:operationType,admin:agentType,admin:sysConfig" delims="," var="requiredPermission" varStatus="s">
                    <c:if test="${s.index == 0}">
                    <shiro:hasPermission name="${requiredPermission}">
                        <li>
                            <a href="${ctx}/" target="_blank"><%=SpringUtils.getMessage("admin.main.home")%></a>
                        </li>
                    </shiro:hasPermission>
                    </c:if>
                </c:forTokens>
            </ul>
        </div>
    </th>
</tr>
<tr>
<td id="menu" class="menu">
    <dl id="product" class="default">
    <dt><%=SpringUtils.getMessage("admin.main.maintenance")%></dt>
        <shiro:hasPermission name="admin:account">
            <dd>
                <a href="../product/list.jhtml" target="iframe">用户账号维护</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="admin:role">
            <dd>
                <a href="../product_category/list.jhtml" target="iframe">用户角色维护</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="admin:organization">
            <dd>
                <a href="../parameter_group/list.jhtml" target="iframe">组织机构维护</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="admin:clientType">
            <dd>
                <a href="../attribute/list.jhtml" target="iframe">客户类型维护</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="admin:operationType">
            <dd>
                <a href="../specification/list.jhtml" target="iframe">业务类型维护</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="admin:agentType">
            <dd>
                <a href="../brand/list.jhtml" target="iframe">客服座席类型维护</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="admin:sysConfig">
            <dd>
                <a href="../product_notify/list.jhtml" target="iframe">系统配置参数管理</a>
            </dd>
        </shiro:hasPermission>
        <shiro:hasPermission name="vta:agent">
            <dd>
                <a href="<c:url value='/agents/index.jhtml' />" target="iframe">视频坐席</a>
            </dd>
        </shiro:hasPermission>
    </dl>
</td>
<td>
<iframe id="iframe" name="iframe" src="index.jsp" frameborder="0"></iframe>
</td>
</tr>
</table>
</body>
</html>