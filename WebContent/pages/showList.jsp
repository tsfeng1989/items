<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="1000" border="1">
		<tr>
			<td colspan="5">
				<a href="${pageContext.request.contextPath}/pages/add.jsp">添加商品</a>
				<div style="float: right;">
					<form action="">
						查询：
						<select>
							<option value="">请选择</option>
							<option value="0">上架</option>
							<option value="1">上架</option>
						</select>
					</form>
				</div>
			</td>
		</tr>
		<tr>
			<td>商品名称</td><td>价格</td>
			<td>录入时间</td><td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${clist}" var="v">
			<tr>
				<td>${v[1]}</td><td>${v[2]}</td>
				<td>${v[3]}</td>
				<td>
					<c:if test="${v[4] eq 0}">已上架</c:if>
					<c:if test="${v[4] eq 1}">已下架</c:if>
				</td>
				<td>
					<a href="${pageContext.request.contextPath}/vipAction_update?v.item_id=${v[0]}&v.status=${v[4]}">
						<c:if test="${v[4] eq 0}">下架</c:if>
						<c:if test="${v[4] eq 1}">上架</c:if>
					</a>
					
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>