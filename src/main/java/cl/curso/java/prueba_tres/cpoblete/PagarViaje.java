package cl.curso.java.prueba_tres.cpoblete;

/**
 * @author CamiloPoblete
 *
 */
public class PagarViaje extends Thread {
	
	private TarjetaBip tarjetaBip;
	private int valorViaje;
	
	/**
	 * Constructor por defecto
	 */
	public PagarViaje() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param tarjetaBip
	 * @param valorViaje
	 * Constructor con parametros
	 */
	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}



	/**
	 * @return
	 */
	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}



	/**
	 * @param tarjetaBip
	 */
	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
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
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try{
		this.getTarjetaBip().pagarViaje(this.getValorViaje());
		}catch(SinSaldoException e){
			
			System.out.println(e.getMessage() + " | error en thread:"+Thread.currentThread().getName());
			
		}
	}

}
