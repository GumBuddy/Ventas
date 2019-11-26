package Controlador;

import Modelo.DAO.Madera;
import Modelo.DTO.Madera_Bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/productos")
public class Servlet_Productos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String Producto = request.getParameter("Producto");
        Long Precio = Long.valueOf(request.getParameter("Precio"));
        Long Stock = Long.valueOf(request.getParameter("Stock"));


        Madera Access=new Madera();
        Madera_Bean Madera= new Madera_Bean(0,Producto,Precio,Stock);
        Access.save(Madera);
        out.println("Se han guardado correctamente lo siguientes datos <br/>");
        out.println("Producto : "+Producto+ "<br/>"+"Precio : "+Precio+ "<br/>"+"Stock : "+Stock);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
