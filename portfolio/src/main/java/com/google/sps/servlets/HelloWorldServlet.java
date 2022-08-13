package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
<<<<<<< HEAD
@WebServlet("/myHobbies")
public class HelloWorldServlet extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> hobbies = new ArrayList<String>();
    hobbies.add("Baking");
    hobbies.add("Reading");
    hobbies.add("Listening to music");
    hobbies.add("Spending Time Outdoors");


   
  }
}
=======
>>>>>>> 1554aee9ada9361742ec1cfa0e6e907718e4cc7d

/**@WebServlet("/thankYou")
public class HelloWorldServlet extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello world!</h1>");
  }
}**/




