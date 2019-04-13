/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *Helicoptero 
 * 
 * Clase Padre que hereda a dos clases hijas  
 * 
 * @author Dennnis Andrés Rivadeneira Cabrera
 * @since 2019
 * @version 2.0
 * @see https://github.com/DennisRivadeneira07/Practica-02-POO-con-Java.git
 */
public abstract class Helicoptero extends MedioTransporteAereo {

private int númeroDeHelices;
private int codigoPatinAterrizaje;
private int codigoAletaDesviación;
private String marcaRotorAntipar;

public Helicoptero(){
    
}

    public Helicoptero(int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String alturaDeVuelo) {
        super(numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.númeroDeHelices = númeroDeHelices;
        this.codigoPatinAterrizaje = codigoPatinAterrizaje;
        this.codigoAletaDesviación = codigoAletaDesviación;
        this.marcaRotorAntipar = marcaRotorAntipar;
    }

    public Helicoptero(int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar) {
        this.númeroDeHelices = númeroDeHelices;
        this.codigoPatinAterrizaje = codigoPatinAterrizaje;
        this.codigoAletaDesviación = codigoAletaDesviación;
        this.marcaRotorAntipar = marcaRotorAntipar;
    }


    public void setNúmeroDeHelices(int númeroDeHelices) {
        this.númeroDeHelices = númeroDeHelices;
    }

    public void setCodigoPatinAterrizaje(int codigoPatinAterrizaje) {
        this.codigoPatinAterrizaje = codigoPatinAterrizaje;
    }

    public void setCodigoAletaDesviación(int codigoAletaDesviación) {
        this.codigoAletaDesviación = codigoAletaDesviación;
    }

    public void setMarcaRotorAntipar(String marcaRotorAntipar) {
        this.marcaRotorAntipar = marcaRotorAntipar;
    }

    public int getNúmeroDeHelices() {
        return númeroDeHelices;
    }

    public int getCodigoPatinAterrizaje() {
        return codigoPatinAterrizaje;
    }

    public int getCodigoAletaDesviación() {
        return codigoAletaDesviación;
    }

    public String getMarcaRotorAntipar() {
        return marcaRotorAntipar;
    }

    public abstract String volar();
    
    @Override
    public String toString() {
        System.out.println();
        return super.toString()+"\n HELICOPTERO \n" + " \nNÚMERO DE HELICES :\n" + númeroDeHelices + "\nCODIGO DE PATIN DE ATERRIZAJE :\n" + codigoPatinAterrizaje + "\n CODIGO ALETA DE DESVIACIÓN :\n" + codigoAletaDesviación + "\nMARCA DE ROTOR ANTIPAR :\n" + marcaRotorAntipar + '}';
    }

    
}
