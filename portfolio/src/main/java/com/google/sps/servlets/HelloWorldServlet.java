package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
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

/**@WebServlet("/thankYou")
public class HelloWorldServlet extends HttpServlet {
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("Thank you for visiting!");
  }
}**/




