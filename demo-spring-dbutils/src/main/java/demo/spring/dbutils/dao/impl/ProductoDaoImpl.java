package demo.spring.dbutils.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.spring.dbutils.dao.ProductoDao;
import demo.spring.dbutils.dominio.Producto;

@Repository
public class ProductoDaoImpl extends DBCPDaoSupport implements ProductoDao{
	
	@Autowired
	public ProductoDaoImpl(DataSource dataSource){
		setDataSource(dataSource);
	}

	public List<Map<String, Object>> obtenerListaDeProductosMap() throws SQLException {
		
		String query = "SELECT * FROM producto";
		List<Map<String, Object>> productos = findListOfMaps(query, null);
		return productos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> obtenerListaDeProductos() throws SQLException{
		
		String query = "SELECT id AS id, descripcion AS descripcion, precio AS precio, " +
				"fecha_creacion AS fechaCreacion, en_oferta as enOferta FROM producto";
		List<Producto> productos = (List<Producto>) findListOfBeans(query, null, Producto.class);
		return productos;
	}

}