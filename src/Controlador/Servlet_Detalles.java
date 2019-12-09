package Controlador;

import Modelo.DAO.Detalles;
import Modelo.DAO.Orden;
import Modelo.DTO.Detalles_Bean;
import Modelo.DTO.Orden_Bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Detalles")
public class Servlet_Detalles extends HttpServlet {
    static String SUMA_TOTAL="0";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        int ID= Integer.parseInt(request.getParameter("ID"));

        int Check=new Orden().getListOrden().size();
        if(ID<=Check&&ID!=0){
        Orden_Bean CLIENTE=new Orden().getOrdenDTO(ID);




        Detalles Lista_Detalles = new Detalles();
        List<Detalles_Bean> Lista_Detalles_O =   Lista_Detalles.getListDetalles(ID);

        String ID_ORDEN = String.valueOf(CLIENTE.getIdOrden());
        String ID_CLIENTE = String.valueOf(CLIENTE.getClienteByFkIdCliente().getIdCliente());
        String Nombre_Cliente=String.valueOf(CLIENTE.getClienteByFkIdCliente().getName());
        String FECHA = String.valueOf(CLIENTE.getFecha());
        String Estado= String.valueOf(CLIENTE.getClienteByFkIdCliente().getState());



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
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/Tperfect-scrollbar.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/TableUtil.css\">\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Main.css\">\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Table.css\">\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/boton.css\">\n" +
                "<!--===============================================================================================-->\n" +
                "</head>\n" +
                "<body style=\"background-color:#32253e;\" >\n" +
                "  \n" +
                "  <div class=\"limiter\">\n" +
                "    <div class=\"container-table100\">\n" +
                "      <div class=\"wrap-table100\">\n" +
                " \n" );

                /*----------------------------------------------------------------------------*/
        out.println(
                "                <div class=\"table100 ver6 m-b-110\">\n" +
                        "    <table data-vertable=\"ver6\">\n" +
                        "        <thead>\n" +
                        "        <tr class=\"row100 head\">\n" +
                        "            <th class=\"column100 column1\" data-column=\"column1\">Folio de Operacion</th>\n" +
                        "            <th class=\"column100 column2\" data-column=\"column2\">ID de Cliente</th>\n" +
                        "            <th class=\"column100 column3\" data-column=\"column3\">Nombre de Cliente</th>\n" +
                        "            <th class=\"column100 column4\" data-column=\"column4\">Estado</th>\n" +
                        "            <th class=\"column100 column5\" data-column=\"column5\">Fecha de Operacion</th>\n" +
                        "        </tr>\n" +
                        "        </thead>\n"+
                        "        <tbody>\n"+
                        "        <tr class=\"row100\">\n" +
                        "            <td class=\"column100 column1\" data-column=\"column1\">"+ID_ORDEN+"</td>\n" +
                        "            <td class=\"column100 column2\" data-column=\"column2\">"+ID_CLIENTE+"</td>\n" +
                        "            <td class=\"column100 column3\" data-column=\"column3\">"+Nombre_Cliente+"</td>\n" +
                        "            <td class=\"column100 column4\" data-column=\"column4\">"+Estado+"</td>\n" +
                        "            <td class=\"column100 column5\" data-column=\"column5\">"+FECHA+"</td>\n" +
                        "        </tr>\n"+
                        "        </tbody>\n"+
                        "        </table>\n"+
                "    <table data-vertable=\"ver6\">\n" +
                "        <thead>\n" +
                "        <tr class=\"row100 head\">\n" +
                "            <th class=\"column100 column1\" data-column=\"column1\">ID de Producto</th>\n" +
                "            <th class=\"column100 column2\" data-column=\"column2\">Producto</th>\n" +
                "            <th class=\"column100 column3\" data-column=\"column3\">Precio Unitario</th>\n" +
                "            <th class=\"column100 column4\" data-column=\"column4\">Total</th>\n" +
                "        </tr>\n" +
                "        </thead>\n"

        );
        out.println(" <tbody>\n" );
        for (int i = 0; i < Lista_Detalles_O.size(); i++) {
            String ID_Madera= String.valueOf(Lista_Detalles_O.get(i).getMaderaByFkCodigo().getCodigo());
            String Nombre_Madera= String.valueOf(Lista_Detalles_O.get(i).getMaderaByFkCodigo().getNombreMadera());
            String Precio_Unitario=String.valueOf(Lista_Detalles_O.get(i).getMaderaByFkCodigo().getPrecio());
            String Total_Madera= String.valueOf(Lista_Detalles_O.get(i).getTotal());
            SUMA_TOTAL= String.valueOf(Double.parseDouble(SUMA_TOTAL) + Double.parseDouble(Total_Madera));

            out.println(
                    "        <tr class=\"row100\">\n" +
                            "            <td class=\"column100 column1\" data-column=\"column1\">"+ID_Madera+"</td>\n" +
                            "            <td class=\"column100 column2\" data-column=\"column2\">"+Nombre_Madera+"</td>\n" +
                            "            <td class=\"column100 column3\" data-column=\"column3\">"+Precio_Unitario+"</td>\n" +
                            "            <td class=\"column100 column4\" data-column=\"column4\">"+Total_Madera+"</td>\n" +
                            "</tr>\n");
        }
        out.println("        <tr class=\"row100\">\n" +
                "            <td class=\"column100 column1\" data-column=\"column1\"></td>\n" +
                "            <td class=\"column100 column2\" data-column=\"column2\"></td>\n" +
                "            <td class=\"column100 column3\" data-column=\"column3\"></td>\n" +
                "            <td class=\"column100 column4\" data-column=\"column4\">"+"TOTAL: "+SUMA_TOTAL+"</td>\n" +
                "</tr>\n");
        out.println("</tbody>");
        out.println("</table>\n");
        out.println(
                "</div>\n" +
                        "<a href=\"Detalles.jsp\" class=\"btn btn-success\">¿Buscar un nuevo folio?</a>\" ");
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
        SUMA_TOTAL="0";
        out.close();}
        else
            {
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
                out.println(" <link rel=stylesheet type=text/css href=css/util.css>");
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");

                out.println("<div class=\"limiter\">\n" +
                        "    <div class=\"container-login100\" style=\"background-image: url('images/bg-01.jpg');\">\n" +
                        "<span class=\"login100-form-title p-b-49\">Folio No Encontrado  </span>\n" +
                        "<span class=\"login100-form-subtitle\">Redirigiendo...</span>" +
                        "" +
                        "    </div>\n" +
                        "</div>");
                /*Redireccionador con tiempo de 5 segundos*/
                out.println("<meta http-equiv=\"refresh\" content=\"5; url=Detalles.jsp\">");

            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
