package app.servlets;

import model.Model;
import app.entities.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Account extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Person person = new Person(name);
        Model.getInstance().addPlayer1(person);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/account.jsp");
        requestDispatcher.forward(req, resp);
    }
}
