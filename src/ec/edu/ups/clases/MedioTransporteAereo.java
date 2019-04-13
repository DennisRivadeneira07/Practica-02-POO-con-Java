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
     private double costoDeVuelo;
     private int numeroTripulantes;
     private double alturaDeVuelo;   

    public MedioTransporteAereo() {
    }
    public MedioTransporteAereo(int numeroTurbinas, int numroPasajeros, double costoDeVuelo, int numeroTripulantes, double alturaDeVuelo) {
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

    public void setCostoDeVuelo(double costoDeVuelo) {
        this.costoDeVuelo = costoDeVuelo;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public void setAlturaDeVuelo(double alturaDeVuelo) {
        this.alturaDeVuelo = alturaDeVuelo;
    }

    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public int getNumroPasajeros() {
        return numroPasajeros;
    }

    public double getCostoDeVuelo() {
        return costoDeVuelo;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public double getAlturaDeVuelo() {
        return alturaDeVuelo;
    }

    @Override
    public String toString() {
        return "\n MedioTransporteAereo{ \n" + "\n numeroTurbinas \n" + numeroTurbinas + "\n numroPasajeros :\n" + numroPasajeros + "\n costoDeVuelo \n" + costoDeVuelo + "\n numeroTripulantes \n" + numeroTripulantes + "\n alturaDeVuelo :\n" + alturaDeVuelo + '}';
    }
    
      
}

