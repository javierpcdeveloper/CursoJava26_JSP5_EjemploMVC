package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import modelo.Rectangulo;

@WebServlet("/ServletEjemplo")
public class ServletEjemplo extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
        //1.procesamos parametros
        String accion=req.getParameter("accion");
        //2.creamos los javaBeans
        Rectangulo recRequest=new Rectangulo(1,2);
        Rectangulo recSesion=new Rectangulo(3,4);
        Rectangulo recAplicacion=new Rectangulo(5,6);
        //revisamos accion
        if("crearVariables".equals(accion)){
            //3.agregamos el java bean a algún alcance
            req.setAttribute("recRequest", recRequest);
            HttpSession sesion=req.getSession();
            sesion.setAttribute("recSesion", recSesion);
            ServletContext aplicacion=this.getServletContext();
            aplicacion.setAttribute("recAplicacion", recAplicacion);
            //req.setAttribute("mensaje","Las variables fueron agregadas por el servlet");
            sesion.setAttribute("mensaje", "Las variables fueron agregadas por el servlet");
            req.getRequestDispatcher("index.jsp").forward(req, res);
        }else if("listarVariables".equals(accion)){
            //4.redireccionamos
            RequestDispatcher rd=req.getRequestDispatcher("vista/listarVariables.jsp");
            rd.forward(req, res);
        }else{
            //4.redireccionamos a inicio
            req.setAttribute("mensaje", "Accion desconocida");
            req.getRequestDispatcher("index.jsp").forward(req, res);
        }
    }
}