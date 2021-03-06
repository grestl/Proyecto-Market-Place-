package pe.edu.unsch.entities;
// Generated 26/11/2020 11:03:24 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reporte generated by hbm2java
 */
@Entity
@Table(name = "reporte", catalog = "marketplacebd")
public class Reporte implements java.io.Serializable {

	private int idreporte;
	private Persona persona;
	private Date fecha;
	private Set<VentaReporte> ventaReportes = new HashSet<VentaReporte>(0);

	public Reporte() {
	}

	public Reporte(int idreporte, Persona persona) {
		this.idreporte = idreporte;
		this.persona = persona;
	}

	public Reporte(int idreporte, Persona persona, Date fecha, Set<VentaReporte> ventaReportes) {
		this.idreporte = idreporte;
		this.persona = persona;
		this.fecha = fecha;
		this.ventaReportes = ventaReportes;
	}

	@Id

	@Column(name = "idreporte", unique = true, nullable = false)
	public int getIdreporte() {
		return this.idreporte;
	}

	public void setIdreporte(int idreporte) {
		this.idreporte = idreporte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reporte")
	public Set<VentaReporte> getVentaReportes() {
		return this.ventaReportes;
	}

	public void setVentaReportes(Set<VentaReporte> ventaReportes) {
		this.ventaReportes = ventaReportes;
	}

}
