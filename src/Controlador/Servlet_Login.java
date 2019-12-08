package Controlador;

import Modelo.DAO.Permissions;
import Modelo.DTO.Permissions_Bean;
import org.hibernate.HibernateException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

@WebServlet("/Login")
public class Servlet_Login extends HttpServlet {

      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("contraseña");
        int autentificacion=0;
          autentificacion = Permissions.getAuthUserDTO(usuario,contraseña);

          if(autentificacion==1){
            out.println("Redirigiendo... <br/>");
            response.sendRedirect("index.jsp");

        }
        else
            {
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
                out.println(" <link rel=stylesheet type=text/css href=css/util.css>");
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");

                out.println("<div class=\"limiter\">\n" +
                        "    <div class=\"container-login100\" style=\"background-image: url('images/bg-01.jpg');\">\n" +
                        "<span class=\"login100-form-title p-b-49\">Credenciales incorrectas </span>\n" +
                        "<span class=\"login100-form-subtitle\">Redirigiendo...</span>" +
                        "" +
                        "    </div>\n" +
                        "</div>");
                /*Redireccionador con tiempo de 5 segundos*/
                out.println("<meta http-equiv=\"refresh\" content=\"5; url=index.jsp\">");

            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
