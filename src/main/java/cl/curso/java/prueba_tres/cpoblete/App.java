package cl.curso.java.prueba_tres.cpoblete;

import java.util.ArrayList;


/**
 * @author CamiloPoblete
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

    TarjetaBip tarjetaBip=new TarjetaBip(1234, 500, new ArrayList<Viaje>());
    PagarViaje threadPagarViaje=new PagarViaje(tarjetaBip, 200);
    PagarViaje threadPagarViaje2=new PagarViaje(tarjetaBip, 200);
    PagarViaje threadPagarViaje3=new PagarViaje(tarjetaBip, 200);
    
   
    threadPagarViaje.setName("thread 1");
    threadPagarViaje2.setName("thread 2");
    threadPagarViaje3.setName("thread 3");
    
    threadPagarViaje.start();
   	threadPagarViaje2.start();
    threadPagarViaje3.start();	

    threadPagarViaje.join();
    threadPagarViaje2.join();
    threadPagarViaje3.join();
    
    System.out.println("---------");
    tarjetaBip.imprimir();
    
    
    
    
    	
    
    }
}
