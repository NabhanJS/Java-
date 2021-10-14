<%@page import="studentmanagement2.dao.SmanagementDao" %>
<jsp:useBean id="s" class="studentmanagement2.model.Smanagement"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
int i=SmanagementDao.save(s);

if(i>0){
    response.sendRedirect("success1.jsp");
    


}else{
    response.sendRedirect("error.jsp");


}



%>