package pe.edu.unsch.entities;
// Generated 26/11/2020 11:03:24 PM by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
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
 * Pago generated by hbm2java
 */
@Entity
@Table(name = "pago", catalog = "marketplacebd")
public class Pago implements java.io.Serializable {

	private int idpago;
	private CuponDescuento cuponDescuento;
	private Tarjeta tarjeta;
	private String tipoPago;
	private Date fechaPago;
	private BigDecimal monto;
	private BigDecimal impuesto;
	private Set<Boleta> boletas = new HashSet<Boleta>(0);
	private Set<Venta> ventas = new HashSet<Venta>(0);
	private Set<Pedido> pedidos = new HashSet<Pedido>(0);

	public Pago() {
	}

	public Pago(int idpago, CuponDescuento cuponDescuento, Tarjeta tarjeta, String tipoPago, Date fechaPago,
			BigDecimal monto, BigDecimal impuesto) {
		this.idpago = idpago;
		this.cuponDescuento = cuponDescuento;
		this.tarjeta = tarjeta;
		this.tipoPago = tipoPago;
		this.fechaPago = fechaPago;
		this.monto = monto;
		this.impuesto = impuesto;
	}

	public Pago(int idpago, CuponDescuento cuponDescuento, Tarjeta tarjeta, String tipoPago, Date fechaPago,
			BigDecimal monto, BigDecimal impuesto, Set<Boleta> boletas, Set<Venta> ventas, Set<Pedido> pedidos) {
		this.idpago = idpago;
		this.cuponDescuento = cuponDescuento;
		this.tarjeta = tarjeta;
		this.tipoPago = tipoPago;
		this.fechaPago = fechaPago;
		this.monto = monto;
		this.impuesto = impuesto;
		this.boletas = boletas;
		this.ventas = ventas;
		this.pedidos = pedidos;
	}

	@Id

	@Column(name = "idpago", unique = true, nullable = false)
	public int getIdpago() {
		return this.idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcupon", nullable = false)
	public CuponDescuento getCuponDescuento() {
		return this.cuponDescuento;
	}

	public void setCuponDescuento(CuponDescuento cuponDescuento) {
		this.cuponDescuento = cuponDescuento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtarjeta", nullable = false)
	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Column(name = "tipo_pago", nullable = false, length = 45)
	public String getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_pago", nullable = false, length = 19)
	public Date getFechaPago() {
		return this.fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Column(name = "monto", nullable = false, precision = 10)
	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	@Column(name = "impuesto", nullable = false, precision = 10)
	public BigDecimal getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Boleta> getBoletas() {
		return this.boletas;
	}

	public void setBoletas(Set<Boleta> boletas) {
		this.boletas = boletas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
