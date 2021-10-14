<%@page import="studentManagement.dao.StudentManagementDao" %>
<jsp:useBean id="s" class="studentManagement.model.StudentManagement"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
int i=StudentManagementDao.save(s);

if(i>0){
    response.sendRedirect("success1.jsp");


}else{
    response.sendRedirect("error.jsp");


}




%>