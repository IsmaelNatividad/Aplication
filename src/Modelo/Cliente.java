package Modelo;

public class Cliente {
		int IdCliente;
		String Nombre;
		int Telefono;
		
		public Cliente () {
			
		}
		
		
		
		public int getIdCliente() {
			return IdCliente;
		}



		public void setIdCliente(int idCliente) {
			IdCliente = idCliente;
		}



		public String getNombre() {
			return Nombre;
		}



		public void setNombre(String nombre) {
			Nombre = nombre;
		}



		public int getTelefono() {
			return Telefono;
		}



		public void setTelefono(int telefono) {
			Telefono = telefono;
		}



		public Cliente(int idCliente, String nombre, int telefono) {
			super();
			IdCliente = idCliente;
			Nombre = nombre;
			Telefono = telefono;
		}
		
		
		
		
		
}
