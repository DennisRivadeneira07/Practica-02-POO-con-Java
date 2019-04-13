/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author LENOVO
 */
public class MedioTransporteAereo {
     private int numeroTurbinas;
     private int numroPasajeros;
     private String costoDeVuelo;
     private int numeroTripulantes;
     private String alturaDeVuelo;   

    public MedioTransporteAereo() {
    }
    public MedioTransporteAereo(int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String alturaDeVuelos) {
        this.numeroTurbinas = numeroTurbinas;
        this.numroPasajeros = numroPasajeros;
        this.costoDeVuelo = costoDeVuelo;
        this.numeroTripulantes = numeroTripulantes;
        this.alturaDeVuelo = alturaDeVuelo;
    }

     
    public void setNumeroTurbinas(int numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

    public void setNumroPasajeros(int numroPasajeros) {
        this.numroPasajeros = numroPasajeros;
    }

    public void setCostoDeVuelo(String costoDeVuelo) {
        this.costoDeVuelo = costoDeVuelo;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public void setAlturaDeVuelo(String alturaDeVuelo) {
        this.alturaDeVuelo = alturaDeVuelo;
    }

    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public int getNumroPasajeros() {
        return numroPasajeros;
    }

    public String getCostoDeVuelo() {
        return costoDeVuelo;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public String getAlturaDeVuelo() {
        return alturaDeVuelo;
    }

    @Override
    public String toString() {
        return "\nMEDIO TRANSPORTE AEREO{ \n" + "\nNUMERO TRUBINAS:\n" + numeroTurbinas + "\nNÚMERO PASAJEROS :\n" + numroPasajeros + "\nCOSTO DE VUELO :\n" + costoDeVuelo + "\nNUEMERO DE TRIPULANTES :\n" + numeroTripulantes + "\nALTURA DE VUELO :\n" + alturaDeVuelo + '}';
    }
    
      
}

