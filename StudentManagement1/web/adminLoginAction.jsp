<% 
String username=request.getParameter("username");
String password=request.getParameter("password");

if(username.equalsIgnoreCase("nabhan") && password.equals("123")){
    response.sendRedirect("adminHome.jsp");
    


}else{
    response.sendRedirect("errorAdminLogin.html");


}




%>