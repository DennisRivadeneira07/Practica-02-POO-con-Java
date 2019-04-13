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
    private double horasServicioDeCommida;
    private String categoriaSocial;

    public  Avión() {
        
    }
    public Avión(int numeroDeAlas, int numeroDeAzafatas, double horasServicioDeCommida, String categoriaSocial, int numeroTurbinas, int numroPasajeros, double costoDeVuelo, int numeroTripulantes, double alturaDeVuelo) {
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

    public void setHorasServicioDeCommida(double horasServicioDeCommida) {
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

    public double getHorasServicioDeCommida() {
        return horasServicioDeCommida;
    }

    public String getCategoriaSocial() {
        return categoriaSocial;
    }
    
    public abstract String aterrizar();

    @Override
    public String toString() {
        return super.toString() +" \n Avi\u00f3n{ \n" + "\n numeroDeAlas :\n" + numeroDeAlas + "\n numeroDeAzafatas :\n" + numeroDeAzafatas + "\n horasServicioDeCommida \n" + horasServicioDeCommida + "\n categoriaSocial :\n" + categoriaSocial + '}';
    }

}

