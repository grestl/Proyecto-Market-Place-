package pe.edu.unsch.entities;
// Generated 26/11/2020 11:03:24 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductoDeseado generated by hbm2java
 */
@Entity
@Table(name = "producto_deseado", catalog = "marketplacebd")
public class ProductoDeseado implements java.io.Serializable {

	private int idproductodeseado;
	private Producto producto;

	public ProductoDeseado() {
	}

	public ProductoDeseado(int idproductodeseado, Producto producto) {
		this.idproductodeseado = idproductodeseado;
		this.producto = producto;
	}

	@Id

	@Column(name = "idproductodeseado", unique = true, nullable = false)
	public int getIdproductodeseado() {
		return this.idproductodeseado;
	}

	public void setIdproductodeseado(int idproductodeseado) {
		this.idproductodeseado = idproductodeseado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
