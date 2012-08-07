package demo.spring.dbutils;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import demo.spring.dbutils.dao.ProductoDao;
import demo.spring.dbutils.dominio.Producto;

@ContextConfiguration(locations={"classpath:demo/spring/dbutils/system-test-config.xml"})
public class ProductoDaoTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private ProductoDao productoDao;
	
	@Test
	public void obtenerListaDeProductosMap() throws SQLException{
		
		List<Map<String, Object>> productos = productoDao.obtenerListaDeProductosMap();
		assertNotNull(productos);
		assertEquals(4, productos.size());
	}
	
	@Test
	public void obtenerListaDeProductos() throws SQLException{
		
		List<Producto> productos = productoDao.obtenerListaDeProductos();
		assertNotNull(productos);
		assertEquals(4, productos.size());
	}

}
