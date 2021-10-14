<%@page import="webtest5.dao.ResultDao" %>
<jsp:useBean id="r" class="webtest5.model.Result"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<% 
int i =ResultDao.save(r);

if(i>0){
    response.sendRedirect("success.jsp");
    

}else{
    response.sendRedirect("error.jsp");
    

}




%>
