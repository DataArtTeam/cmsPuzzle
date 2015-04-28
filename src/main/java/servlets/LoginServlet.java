package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends ServletProvider {

    private static final String CONTENT_TYPE = "text/html";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType(CONTENT_TYPE);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/loginPage.jsp");
        dispatcher.forward(request, response);
    }
}
