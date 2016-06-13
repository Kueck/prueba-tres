package cl.curso.java.prueba_tres.cpoblete;

import java.util.Date;

/**
 * @author Usuario
 *
 */
public class Viaje implements Comparable<Viaje> {

	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	
	/**
	 * Constructor por defecto
	 */
	public Viaje() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 * Constructor con parametros
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}



	/**
	 * @return
	 */
	public Date getFecha() {
		return fecha;
	}



	/**
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	/**
	 * @return
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}



	/**
	 * @param saldoTarjeta
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}



	/**
	 * @return
	 */
	public int getValorViaje() {
		return valorViaje;
	}



	/**
	 * @param valorViaje
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}



	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Viaje arg0) {
		return this.getFecha().compareTo(arg0.getFecha());
	}



	@Override
	public String toString() {
		return "Viaje [fecha=" + fecha + ", saldoTarjeta=" + saldoTarjeta + ", valorViaje=" + valorViaje + "]";
	}

	
	
}
