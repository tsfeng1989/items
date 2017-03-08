<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/vipAction_add">
		商品名称：<input name="v.Item_name"/><br/><br/>
		　　单价：<input name="v.Item_price"/><br/><br/>
		创建时间：<input name="v.create_time"/><br/><br/>
		　　状态：　
			上架：<input type="radio" name="v.status"/>
			下架：<input type="radio" name="v.status"/>
			<br/><br/>
		<input type="submit" value="提交"/>
		<input type="button" value="返回">
	</form>
</body>
</html>