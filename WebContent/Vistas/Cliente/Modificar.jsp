<%@page import="ModeloDAO.ClienteDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Clientes</h1>
		<a href="Controlador?accion=add">Agregar nuevo cliente</a>
		<table border="1">
			<thread>
			
				<tr>
				
					<th>ID</th>
					<th>NOMBRE</th>
					<th>Telefono</th>
					
				
				
				</tr>
			
			
			</thread>
			<%
				ClienteDAO dao = new ClienteDAO();
				list<Cliente>list=dao.modificar();
				iterator<Cliente>iter=list.iterator();
				Cliente cli=null;
				while(iter.hasNext());
				cli=iter.nexr(); 
			
			%> 
			<tbody>
					<tr>
					<td><%=cli.getId()%></td>
					<td><%=cli.getNombre()%></td>
					<td><%=cli.getTelefono()%></td>
					<td>
							<a>Editar</a>
							<a>Eliminar</a>
					
					
					
					</td>
					
					
					
					</tr>
			
			
			</tbody>
			
			
		
		
		
		
		</table>
	
	
	</div>

</body>
</html>