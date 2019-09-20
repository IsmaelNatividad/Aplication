package Interfaces;

import java.util.List;

import Modelo.Cliente;

public interface CRUD {
		public List modificar();
		public Cliente list(int id);
		public boolean Agregar(Cliente cli);
		public boolean Borrar(Cliente cli);
		public boolean Modificar(int id);
}
