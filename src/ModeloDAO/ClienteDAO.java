package ModeloDAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Cliente;

public class ClienteDAO implements CRUD {
		Conexion cn=new Conexion();
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		Cliente c=new Cliente();
		
		
		
		
	@Override
	public List modificar() {
		
		ArrayList <Cliente>List=new ArrayList<>();
		String sql="Select * from cliente";
		
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next());
			Cliente cli=new Cliente();
			cli.setIdCliente(rs.getInt("Id"));
			cli.setNombre(rs.getString("Nombre"));
			cli.setTelefono(rs.getInt("Telefono"));
			List.add(cli);
		}
		catch(Exception e){
			
		}
		
		return List;
	}

	@Override
	public Cliente list(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Agregar(Cliente cli) {
		String sql="insert into cliente(Id, Cliente, Edad) values('"+cli.getIdCliente()"','"+cli.getNombre()"','"+cli.getTelefono()"')"; 
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}
		
		catch(Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean Borrar(Cliente cli) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Modificar(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
