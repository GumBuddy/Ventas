package Controlador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ADIOS")
public class Servlet_ADIOS extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        session.setAttribute("usuario", null);

        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
        out.println(" <link rel=stylesheet type=text/css href=css/util.css>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
        out.println("<div class=\"limiter\">\n" +
                "    <div class=\"container-login100\" style=\"background-image: url('images/bg-01.jpg');\">\n" +
                "<span class=\"login100-form-title p-b-49\">Hasta luego</span>\n" +
                "    </div>\n" +
                "</div>");
        out.println("<meta http-equiv=\"refresh\" content=\"3; url=index.jsp\">");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
