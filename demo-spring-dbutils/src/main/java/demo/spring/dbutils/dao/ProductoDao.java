package demo.spring.dbutils.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import demo.spring.dbutils.dominio.Producto;

public interface ProductoDao {
	
	public List<Map<String, Object>> obtenerListaDeProductosMap() throws SQLException;
	public List<Producto> obtenerListaDeProductos() throws SQLException;
}
