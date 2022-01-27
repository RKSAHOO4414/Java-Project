//Get Image JSP

<html>
    <head>
        <title>View Image</title>
    </head>
    
    <body>
    
        <b>View | <a href="file-upload.jsp">Upload</a></b><br/><br/>
        
<%
String id = request.getParameter("id");
%>
<img src="viewimage.jsp?id=<%=id%>" width="400px"/>
 
    </body>
</html>