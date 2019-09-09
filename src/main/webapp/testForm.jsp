<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/css.css">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
function textForm() {
	alert(1);
	$.post("testForm.do",$("form").serialize(),function(da){
		if(da==0){
			alert("内容不能为空");
		}else if(da==1){
			alert("验证成功");
		}
	},"json")
}
</script>
</head>
<body>

	<form action="#">
		内容:<textarea rows="10" cols="25" name="context"></textarea><br>
		手机号:<input type="text" name="phone"><br>
		邮箱:<input type="text" name="email"><br>
		<input type="button" value="验证" onclick="textForm()">
	</form>
</body>
</html>