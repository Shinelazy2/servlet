package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//html 반환
@WebServlet(name = "responseHtmlServlet", urlPatterns = "/response-html")
public class ResponseHtmlServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest requset, HttpServletResponse respone) throws ServletException, IOException {
        // Content-Type: text/html; charset=utf-8
        respone.setContentType("text/html");
        respone.setCharacterEncoding("utf-8");

        PrintWriter writer = respone.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<div> HI? </div>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
