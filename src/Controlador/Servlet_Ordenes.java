package Controlador;

import Modelo.DAO.Orden;
import Modelo.DTO.Orden_Bean;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Ordenes")
public class Servlet_Ordenes extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        Orden Lista_Ordenes = new Orden();
        List<Orden_Bean> Lista_Orden = Lista_Ordenes.getListOrden();
        out.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "  <title>Ordenes</title>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<!--===============================================================================================-->  \n" +
                "  <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animateTABLE.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.minT.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/TableUtil.css\">\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Main.css\">\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Table.css\">\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/boton.css\">\n" +
                 "<!--===============================================================================================-->\n" +
                "</head>\n" +
                "<body style=\"background-color:#32253e;>\n" +
                "  \n" +
                "  <div class=\"limiter\">\n" +
                "    <div class=\"container-table100\">\n" +
                "      <div class=\"wrap-table100\">\n" +
                       "   <div class=\"table100 ver6 m-b-110\">\n" +
                        "    <table data-vertable=\"ver6\">\n" +
                        "        <thead>\n" +
                        "        <tr class=\"row100 head\">\n" +
                        "            <th class=\"column100 column1\" data-column=\"column1\">Folio de Operacion</th>\n" +
                        "            <th class=\"column100 column2\" data-column=\"column2\">ID de Cliente</th>\n" +
                        "            <th class=\"column100 column3\" data-column=\"column3\">Nombre de Cliente</th>\n" +
                        "            <th class=\"column100 column4\" data-column=\"column4\">Fecha de Operacion</th>\n" +
                        "        </tr>\n" +
                        "        </thead>\n"
        );
        out.println(" <tbody>\n" );
        for (int i = 0; i < Lista_Orden.size(); i++) {
            String ORDEN = String.valueOf(Lista_Orden.get(i).getIdOrden());
            String ID_CLIENTE = String.valueOf(Lista_Orden.get(i).getClienteByFkIdCliente().getIdCliente());
            String Nombre_Cliente=String.valueOf(Lista_Orden.get(i).getClienteByFkIdCliente().getName());
            String FECHA = String.valueOf(Lista_Orden.get(i).getFecha());

            out.println(
                    "        <tr class=\"row100\">\n" +
                    "            <td class=\"column100 column1\" data-column=\"column1\">"+ORDEN+"</td>\n" +
                    "            <td class=\"column100 column2\" data-column=\"column2\">"+ID_CLIENTE+"</td>\n" +
                    "            <td class=\"column100 column3\" data-column=\"column3\">"+Nombre_Cliente+"</td>\n" +
                    "            <td class=\"column100 column4\" data-column=\"column4\">"+FECHA+"</td>\n" +
                    "        </tr>\n");
        }
        out.println("</tbody>");
        out.println("</table>\n");
        out.println(
                "</div>\n" +
                "<a href=\"Detalles.jsp\" class=\"btn btn-success\">Buscar detalles de Orden</a>\" ");
            out.println(
                "<!--===============================================================================================-->  \n" +
                "  <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n" +
                "<!--===============================================================================================-->\n" +
                "  <script src=\"vendor/bootstrap/js/popper.js\"></script>\n" +
                "  <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n" +
                "<!--===============================================================================================-->\n" +
                "  <script src=\"vendor/select2/select2.minT.js\"></script>\n" +
                "<!--===============================================================================================-->\n" +
                "  <script src=\"js/mainTable.js\"></script>\n" +
                "<!--===============================================================================================-->\n" +
                "  <script src=\"js/button.js\"></script>\n" +
                "<!--===============================================================================================-->\n" +

                "</body>\n" +
                "</html>");

        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
