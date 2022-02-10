<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg"); 
    
      String errorMsg=(String)request.getAttribute("errorMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>

        <h1><%=msg %></h1>



<%} %>
<%if(errorMsg!=null && !errorMsg.isEmpty()){ %>

        <h1><%=errorMsg %></h1>



<%} %>

    <form action="./updateDetails" method="post">
        
        <input type="number" name="id" value="">
        <input type="text" name="userName">
        
        <input type="password" name="password">
        <input type="submit" value="submit">
    </form>
    


</body>
</html>