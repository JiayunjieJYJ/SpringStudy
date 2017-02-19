<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<html>
<head>

    <title>hello</title>

    <script type="text/javascript">
        var basePath = <%=basePath%>;
    </script>
</head>
<body>

${name}

</body>
</html>
