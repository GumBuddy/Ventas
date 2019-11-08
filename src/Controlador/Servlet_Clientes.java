package Controlador;

import Modelo.DAO.Cliente;
import Modelo.DTO.Cliente_Bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Cliente")
public class Servlet_Clientes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String Name = request.getParameter("Name");
        String Country = request.getParameter("Country");

        Cliente Access=new Cliente();
        Cliente_Bean Cliente= new Cliente_Bean(Name,Country);
        Access.save(Cliente);
        out.println("EXITO AL GUARDAR");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola</title>");
        out.println("</head>");
        out.println("Funciono?");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
