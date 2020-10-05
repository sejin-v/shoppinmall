<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="css/mystyle.css" />
</head>
<body>
<%
   String mesg = (String)session.getAttribute("memberAdd");
   if(mesg!=null){
%>
   <script type="text/javascript">
     alert('<%=mesg%>');
   </script>
<%
   }
%>

<h1 id="main">Main</h1>
<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
<hr>
<jsp:include page="goods/goodsList.jsp" flush="true"></jsp:include>
</body>
</html>