<%@page import="studentmanagement2.dao.SresultDao" %>
<jsp:useBean id="r" class="studentmanagement2.model.Sresult"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<% 
int i=SresultDao.save(r);

if(i>0){
    response.sendRedirect("success1.jsp");


}else{
    response.sendRedirect("error.jsp");


}




%>