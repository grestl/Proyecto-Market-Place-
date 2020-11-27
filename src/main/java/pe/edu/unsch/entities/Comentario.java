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
 * Comentario generated by hbm2java
 */
@Entity
@Table(name = "comentario", catalog = "marketplacebd")
public class Comentario implements java.io.Serializable {

	private int idcomentario;
	private Pedido pedido;
	private Usuario usuario;
	private String titulo;
	private String descripcion;
	private Byte puntaje;

	public Comentario() {
	}

	public Comentario(int idcomentario, Pedido pedido, Usuario usuario, String titulo, String descripcion) {
		this.idcomentario = idcomentario;
		this.pedido = pedido;
		this.usuario = usuario;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public Comentario(int idcomentario, Pedido pedido, Usuario usuario, String titulo, String descripcion,
			Byte puntaje) {
		this.idcomentario = idcomentario;
		this.pedido = pedido;
		this.usuario = usuario;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.puntaje = puntaje;
	}

	@Id

	@Column(name = "idcomentario", unique = true, nullable = false)
	public int getIdcomentario() {
		return this.idcomentario;
	}

	public void setIdcomentario(int idcomentario) {
		this.idcomentario = idcomentario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "titulo", nullable = false, length = 100)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "puntaje")
	public Byte getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(Byte puntaje) {
		this.puntaje = puntaje;
	}

}
