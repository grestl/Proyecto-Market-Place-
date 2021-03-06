package pe.edu.unsch.entities;
// Generated 26/11/2020 11:03:24 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompradorFrecuente generated by hbm2java
 */
@Entity
@Table(name = "comprador_frecuente", catalog = "marketplacebd")
public class CompradorFrecuente implements java.io.Serializable {

	private int idcompradorfrecuente;
	private Regalo regalo;
	private Integer puntosAcumulados;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public CompradorFrecuente() {
	}

	public CompradorFrecuente(int idcompradorfrecuente, Regalo regalo) {
		this.idcompradorfrecuente = idcompradorfrecuente;
		this.regalo = regalo;
	}

	public CompradorFrecuente(int idcompradorfrecuente, Regalo regalo, Integer puntosAcumulados,
			Set<Usuario> usuarios) {
		this.idcompradorfrecuente = idcompradorfrecuente;
		this.regalo = regalo;
		this.puntosAcumulados = puntosAcumulados;
		this.usuarios = usuarios;
	}

	@Id

	@Column(name = "idcompradorfrecuente", unique = true, nullable = false)
	public int getIdcompradorfrecuente() {
		return this.idcompradorfrecuente;
	}

	public void setIdcompradorfrecuente(int idcompradorfrecuente) {
		this.idcompradorfrecuente = idcompradorfrecuente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idregalo", nullable = false)
	public Regalo getRegalo() {
		return this.regalo;
	}

	public void setRegalo(Regalo regalo) {
		this.regalo = regalo;
	}

	@Column(name = "puntos_acumulados")
	public Integer getPuntosAcumulados() {
		return this.puntosAcumulados;
	}

	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compradorFrecuente")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
