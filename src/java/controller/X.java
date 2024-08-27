package controller;


import model.User;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/X")
public class X extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User(1, "Sahan", "0712345678");
        User user2 = new User(2, "Eshara", "0712345678");

        userList.add(user1);
        userList.add(user2);

        request.setAttribute("userList",userList);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
