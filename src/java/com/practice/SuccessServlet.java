
package com.practice;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;

public class SuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter outy = resp.getWriter();
        outy.println("<h2>Successfuly Registered</h2>");
        outy.println("All details Valid");
    } 
    
}
