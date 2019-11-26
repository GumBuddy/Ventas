package Controlador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Servlet_Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("contraseña");
        int autentificacion=0;
       /* autentificacion = Login.getAuthUserDTO(usuario,contraseña);

        if(autentificacion==1){
            out.println("Redirigiendo... <br/>");
            response.sendRedirect("Ordenes.jsp");
        }
        else
            {
                out.println("DATOS INCORRECTOS!!!<br/>");
                response.sendRedirect("index..jsp");
            }
*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
