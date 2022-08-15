package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.KeyFactory;

@WebServlet("/contact-form")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String emailValue = request.getParameter("email-input");
    String messageValue = request.getParameter("message-input");
    
    Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    KeyFactory keyFactory = datastore.newKeyFactory().setKind("Info");
    FullEntity infoEntity =
    Entity.newBuilder(keyFactory.newKey())
        .set("nameValue", nameValue)
        .set("emailValue", emailValue)
        .set("messageValue", messageValue)
        .build();

        datastore.put(infoEntity);


    //Redirect to home page
    response.sendRedirect("https://ngreene-sps-summer22.appspot.com/");
  }
}

/*@WebServlet("/contact-form")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String emailValue = request.getParameter("email-input");
    String messageValue = request.getParameter("message-input");
    
    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + nameValue);
    System.out.println("You submitted: " + emailValue);
    System.out.println("You submitted: " + messageValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + nameValue);
    response.getWriter().println("You submitted: " + emailValue);
    response.getWriter().println("You submitted: " + messageValue);

    //Redirect to home page
    response.sendRedirect("https://ngreene-sps-summer22.appspot.com/");
  }
}*/
