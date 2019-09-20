package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Cliente;
import ModeloDAO.ClienteDAO;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String Modificar="Vista/Cliente/Modificar.jsp";
       String Agregar ="Vista/Cliente/Agregar.jsp";
       String Borrar = "Vista/Cliente/Borrar.jsp";
       Cliente c = new Cliente();
       ClienteDAO cld= new ClienteDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
			String acceso="";
			String action=request.getParameter("Accion");
			if(action.equalsIgnoreCase("Modificar")) {
				acceso=Modificar;
			}
			else if(action.equalsIgnoreCase("add")) {
				acceso=Agregar;
			}
			else if(action.equalsIgnoreCase("Agregar")) {
				String Id=request.getParameter("txtId");
				String Nombre=request.getParameter("txtNom");;
				String telefono=request.getParameter("txtTel");;
				c.setIdCliente(idCliente)
				c.setNombre(nombre);
				c.setTelefono(telefono);
				dao.add(c);
				acceso=Modificar;
				
			}
			RequestDispatcher vista=request.getRequestDispatcher(acceso);
			vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
