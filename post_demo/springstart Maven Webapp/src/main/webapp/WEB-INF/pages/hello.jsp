<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>HelloJsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=basePath%>resources/jquery/jquery-3.3.1.js"></script>
	<script type="text/javascript" src="<%=basePath%>resources/hello/hello.js">
	
	</script>
	<script type="text/javascript">
	var basePath = "<%=basePath%>";
	</script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>resources/hello/hello.css">
	
  </head>
  
  <body>
    This is my first jsp page. <br>
    
    <br/>
    my hello
    <br/>
    <div class="mydiv">
	    <input id="myInput"></input>	  
	    <button class="mybutton" id="getButton">Get</button>
	    <button class="mybutton" id="POSTButton">POST</button>

		<hr>

		<span>表单demo</span>
		<form id="formDemo">
			<label>用户名：</label>
			<input id="name" name="name"/>
			<br>
			<label>密码：</label>
			<input id="passwd" name="passwd" type="password"/>
			<br>
			<button id="formButton" type="button">提交</button>

		</form>
    </div>
  <div>

  </div>
  </body>
</html>
