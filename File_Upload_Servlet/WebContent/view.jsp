//View JSP file

<html>
    <head>
        <title>View Image</title>
    </head>
    
    <body>
    
        <b>View | <a href="file-upload.jsp">Upload</a></b><br/><br/>
        
        <form action="getimage.jsp" method="post">
            <input type="text" name="id" required="required" placeholder="enter image id.."/><br/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>