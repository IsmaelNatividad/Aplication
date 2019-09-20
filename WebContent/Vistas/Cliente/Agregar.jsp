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
		<h1>Agregar Cliente</h1>
			<form action="controlador">
				ID:<br>
				Nombre <br>
				Telefono<br>
				<input type="number" name="txtId"><br>
				<input type="text" name="txtNom"><br>
				<input type="number" name="txtTel"><br>
				<input type="submit" name="accion" value="Agregar"><br>
			
			</form>
	</div>

</body>
</html>