package demo.spring.dbutils.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3823051775094334087L;
	private Long id;
	private String descripcion;
	private BigDecimal precio;
	private Date fechaCreacion;
	private boolean enOferta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isEnOferta() {
		return enOferta;
	}

	public void setEnOferta(boolean enOferta) {
		this.enOferta = enOferta;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", fechaCreacion=" + fechaCreacion
				+ ", enOferta=" + enOferta + "]";
	}
	
}