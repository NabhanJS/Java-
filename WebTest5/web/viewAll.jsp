

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="webtest5.dao.ResultDao" %>
        <%@page import="webtest5.model.Result" %>
        <%@page import="java.util.*" %>
        
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m"%>
        <% 
        List<Result> list=ResultDao.viewAll();
        request.setAttribute("list", list);
        
        %>
        
        <table border="1" width="50%">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Password</th>
                <th>District</th>
                <th>Action</th>
            </tr>
            
            <tbody>
                <m:forEach items="${list}" var="s">
                    <tr>
                        <td>${s.getId()}</td>
                        <td>${s.getName()}</td>
                        <td>${s.getEmail()}</td>
                        <td>${s.getAddress()}</td>
                        <td>${s.getPassword()}</td>
                        <td>${s.getDistrict()}</td>
                        <td>
                            Edit Delete
                            <a href="edite.jsp?id=${s.getId()}">Edit</a>
                            <a href="deletefrom.jsp?id=${s.getId()}">Delete</a>
                        </td>
                    </tr>
                    
                </m:forEach>
                
                
            </tbody>
            
            
        </table>
        
        
        
        
        
        
        
    </body>
</html>
