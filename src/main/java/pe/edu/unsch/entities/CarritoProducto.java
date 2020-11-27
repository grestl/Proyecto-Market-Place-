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
 * CarritoProducto generated by hbm2java
 */
@Entity
@Table(name = "carrito_producto", catalog = "marketplacebd")
public class CarritoProducto implements java.io.Serializable {

	private int idcarritoproducto;
	private Carrito carrito;
	private Producto producto;

	public CarritoProducto() {
	}

	public CarritoProducto(int idcarritoproducto, Carrito carrito, Producto producto) {
		this.idcarritoproducto = idcarritoproducto;
		this.carrito = carrito;
		this.producto = producto;
	}

	@Id

	@Column(name = "idcarritoproducto", unique = true, nullable = false)
	public int getIdcarritoproducto() {
		return this.idcarritoproducto;
	}

	public void setIdcarritoproducto(int idcarritoproducto) {
		this.idcarritoproducto = idcarritoproducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcarrito", nullable = false)
	public Carrito getCarrito() {
		return this.carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
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