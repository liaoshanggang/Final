<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>运用后端技术处理业务逻辑</title>
</head>

<body>
	<!--HTML输出-->
    今天是学习JSP的第一天<br>
    <%--用输出标签直接输出--%>
    <%="明天是学习JSP的第二天！"%>
    <%//定义字符串变量，用out对象输出%>
    <%
		String str = "后天是学习JSP的第三天！";
		out.println(str);
	%>
    
</body>
</html>
