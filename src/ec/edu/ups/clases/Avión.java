/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public abstract class Avión extends MedioTransporteAereo{

    private int numeroDeAlas;
    private int numeroDeAzafatas;
    private String horasServicioDeCommida;
    private String categoriaSocial;

    public  Avión() {
        
    }

    public Avión(int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial) {
        this.numeroDeAlas = numeroDeAlas;
        this.numeroDeAzafatas = numeroDeAzafatas;
        this.horasServicioDeCommida = horasServicioDeCommida;
        this.categoriaSocial = categoriaSocial;
    }
    
    
    
    public Avión(int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial, int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String alturaDeVuelo) {
        super(numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.numeroDeAlas = numeroDeAlas;
        this.numeroDeAzafatas = numeroDeAzafatas;
        this.horasServicioDeCommida = horasServicioDeCommida;
        this.categoriaSocial = categoriaSocial;
    }
   
    public void setNumeroDeAlas(int numeroDeAlas) {
        this.numeroDeAlas = numeroDeAlas;
    }

    public void setAzapatas(int azapatas) {
        this.numeroDeAzafatas = azapatas;
    }

    public void setHorasServicioDeCommida(String horasServicioDeCommida) {
        this.horasServicioDeCommida = horasServicioDeCommida;
    }

    public void setCategoriaSocial(String categoriaSocial) {
        this.categoriaSocial = categoriaSocial;
    }

    public int getNumeroDeAlas() {
        return numeroDeAlas;
    }

    public int getAzapatas() {
        return numeroDeAzafatas;
    }

    public String getHorasServicioDeCommida() {
        return horasServicioDeCommida;
    }

    public String getCategoriaSocial() {
        return categoriaSocial;
    }
    
    public abstract String aterrizar();

   
    @Override
    public String toString() {
        System.out.println();
        return super.toString() +" \n AVIÓN{ \n" + "\nNÚMERO DE ALAS :\n" + numeroDeAlas + "\nNÚMERO DE AZAFATAS :\n" + numeroDeAzafatas + "\nHORAS DE SERVICIO DE COMIDA :\n" + horasServicioDeCommida + "\nCATEGORIA SOCIAL :\n" + categoriaSocial + '}';
    }

}
