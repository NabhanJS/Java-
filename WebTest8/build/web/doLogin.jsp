<% 
String userName=request.getParameter("email");
String password=request.getParameter("password");

if(userName.equalsIgnoreCase("admin") && password.equals("123") ){
    
    response.sendRedirect("viewAll.jsp");
    


}else{

 response.sendRedirect("error.jsp");
}




%>