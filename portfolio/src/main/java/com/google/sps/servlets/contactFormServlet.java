package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.sps.Contact;

@WebServlet("/contact-form-handler")
public class contactFormServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String contactMessage = request.getParameter("message");
    String contactName = request.getParameter("name");
    String contactEmail = request.getParameter("email");

    Contact contact = new Contact(contactName, contactEmail, contactMessage);

    // Print the value so you can see it in the server logs.
    System.out.println(contactToJson(contact));

    // Take user to see their response has been recorded
    response.sendRedirect("/index.html");
  }

  public String contactToJson(Contact contact) {
      Gson gson = new Gson();
      String json = gson.toJson(contact);
      return json;
  }
}