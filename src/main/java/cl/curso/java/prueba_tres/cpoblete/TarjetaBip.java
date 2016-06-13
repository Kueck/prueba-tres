package cl.curso.java.prueba_tres.cpoblete;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author CamiloPoblete
 *
 */
public class TarjetaBip {

	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;
	
	/**
	 * 	Constructor por defecto
	 */
	public TarjetaBip() {

	this.numeroTarjeta=0;
	this.saldo=0;
	this.viajes=new ArrayList<Viaje>();
	}

	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 * Constructor con parametros
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes=viajes;
	}

	/**
	 * @return
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * @param viajes
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	/**
	 * @param monto
	 * metodo recargar
	 * simula la carga de una tarjeta bip
	 * se agrega al saldo actual un valor entero
	 */
	public void recargar(int monto){
		
		this.setSaldo(this.getSaldo()+monto);
	}
	
	/**
	 * @param valorViaje
	 * @exception SinSaldoException
	 * metodo pagarViaje
	 * metodo sincronizado que simula el pago de un viaje
	 * si el valor del viaje alcanza con el saldo actual
	 * al saldo se le resta el valor del viaje y se agrega a la lista 
	 * de viajes un nuevo "registro" de viaje
	 * si el valor excede el saldo actual se lanza una excepcion de tipo SinSaldoException
	 * 
	 */
	public synchronized void pagarViaje(int valorViaje){
		
		if(this.getSaldo()>=valorViaje){
			this.setSaldo(this.getSaldo()-valorViaje);
			this.getViajes().add(new Viaje(new Date(), this.getSaldo(), valorViaje));
		}else{
			throw new SinSaldoException("saldo insuficiente");
		}
		
	}
	
	public void imprimir(){
		
		for (Viaje viaje : this.getViajes()) {
			System.out.println(viaje);
		}
		System.out.println("-----------------------");
	}

	
	
	
}
