package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MemberFormServlet extends HttpServlet {


    // url -> /servlet-mvc/members/new-form -> /WEB-INF/views/new-form.jsp
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String viewsPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(viewsPath);
        requestDispatcher.forward(req, resp);

    }
}
