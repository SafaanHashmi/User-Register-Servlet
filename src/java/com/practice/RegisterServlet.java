package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter outy = response.getWriter();
        outy.println("<h1>Welcome to Registered Servlet Page</h1>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String condition = request.getParameter("condition");
        
        if(condition!=null){
            if(condition.equals("checked")){
                System.out.println("Terms and Condition agreed");
                outy.println("<h2>Your entered details are -:<h2>");
                outy.println("<h3>Name : "+name+"<h3>"); 
                outy.println("<h3>Password : "+password+"<h3>");
                outy.println("<h3>Email : "+email+"<h3>");
                outy.println("<h3>Gener : "+gender+"<h3>");
                outy.println("<h3>Couse : "+course+"<h3>");
                outy.println("<h5>Your agreed Terms and Condition</h5>");

                RequestDispatcher rd = request.getRequestDispatcher("SuccessServlett");
                rd.forward(request,response);
            }
            else{
                outy.println("<h3>Lund<h3>");
            }
            
        }
        else{
             outy.println("<h1>Terms and Condition not agreed</h1>");
             System.out.println("Terms and Condition not agreed");
             
             //REQUEST DISPATCHER
             //Include output of index.html page
             RequestDispatcher rd = request.getRequestDispatcher("index.html"); //For html page simply write its name
             //But for any SERVLET we havee to write its URL pattern.Eg-:
             //RequestDispatcher rd = request.getRequestDispatcher("RegisterServlet");
             rd.include(request, response);
        }
    }
    
}
