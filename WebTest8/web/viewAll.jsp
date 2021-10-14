<%-- 
    Document   : viewAll
    Created on : Mar 18, 2021, 7:36:08 PM
    Author     : nabha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="webtest8.dao.TeacherDao" %>
        <%@page import="webtest8.model.Teacher" %>
        <%@page import="java.util.*" %>
        
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>
        
        <% 
        List<Teacher> list=TeacherDao.viewAll();
        request.setAttribute("list", list);
 
        %>
        
        <table width="100%" border="1">
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Email</td>
                <td>Password</td>
                <td>Gender</td>
                <td>Subject</td>
                <td>Action</td>
            </tr>
            
            <t:forEach items="${list}" var="v">
                <tr>
                    <td>${v.getId()}</td>
                    <td>${v.getName()}</td>
                    <td>${v.getEmail()}</td>
                    <td>${v.getPassword()}</td>
                    <td>${v.getGender()}</td>
                    <td>${v.getSubject()}</td>
                    <td>
                        <a href="edit.jsp?id=${v.getId()}">Edit</a>
                        <a href="delete.jsp?id=${v.getId()}">Delete</a>
                    </td>
                    
                </tr>
                
                
                
                
            </t:forEach>
            
            
            
        </table>
        
        
        
        
        
        
        
        
    </body>
</html>
