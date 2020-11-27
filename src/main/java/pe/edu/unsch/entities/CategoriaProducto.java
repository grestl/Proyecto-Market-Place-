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
 * CategoriaProducto generated by hbm2java
 */
@Entity
@Table(name = "categoria_producto", catalog = "marketplacebd")
public class CategoriaProducto implements java.io.Serializable {

	private String idcategoriaproducto;
	private Categoria categoria;
	private Producto producto;

	public CategoriaProducto() {
	}

	public CategoriaProducto(String idcategoriaproducto, Categoria categoria, Producto producto) {
		this.idcategoriaproducto = idcategoriaproducto;
		this.categoria = categoria;
		this.producto = producto;
	}

	@Id

	@Column(name = "idcategoriaproducto", unique = true, nullable = false, length = 45)
	public String getIdcategoriaproducto() {
		return this.idcategoriaproducto;
	}

	public void setIdcategoriaproducto(String idcategoriaproducto) {
		this.idcategoriaproducto = idcategoriaproducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcategoria", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
