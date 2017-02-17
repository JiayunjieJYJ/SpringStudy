<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>hello</title>

</head>
<body>

<%! int i = 0; %>

i=<%=i%>

<%
    out.print("你的IP地址 " + request.getRemoteAddr());
%>

</body>
</html>
