package com.teachmeskills.lesson24.task1.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet("/washington")
public class TimeWashington extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter respWriter = resp.getWriter();
        respWriter.write("<b><h3>Washington time: </h3></b><br>");
        respWriter.write(String.valueOf(ZonedDateTime.now(ZoneId.of("America/Marigot"))));
        respWriter.close();
        resp.setContentType("text/html");
    }
}
