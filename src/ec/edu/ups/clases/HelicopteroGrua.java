/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;

/**
 *
 * @author LENOVO
 */
public class HelicopteroGrua extends Helicoptero implements Interface {
   
   private double LargoCableGrua;
   private double capacidadGrua;
   private int numeroGruas;
   private double tamañoGanchoGrua;
   
   public HelicopteroGrua(){
       
   }

    public HelicopteroGrua(double LargoCableGrua, double capacidadGrua, int numeroGruas, double tamañoGanchoGrua, int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, int numeroTurbinas, int numroPasajeros, double costoDeVuelo, int numeroTripulantes, double alturaDeVuelo) {
        super(númeroDeHelices, codigoPatinAterrizaje, codigoAletaDesviación, marcaRotorAntipar, numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.LargoCableGrua = LargoCableGrua;
        this.capacidadGrua = capacidadGrua;
        this.numeroGruas = numeroGruas;
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }

    public HelicopteroGrua(double LargoCableGrua, double capacidadGrua, int numeroGruas, double tamañoGanchoGrua) {
        this.LargoCableGrua = LargoCableGrua;
        this.capacidadGrua = capacidadGrua;
        this.numeroGruas = numeroGruas;
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }
    public void setLargoCableGrua(double LargoCableGrua) {
        this.LargoCableGrua = LargoCableGrua;
    }

    public void setCapacidadGrua(double capacidadGrua) {
        this.capacidadGrua = capacidadGrua;
    }

    public void setNumeroGruas(int numeroGruas) {
        this.numeroGruas = numeroGruas;
    }

    public void setTamañoGanchoGrua(double tamañoGanchoGrua) {
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }

    public double getLargoCableGrua() {
        return LargoCableGrua;
    }

    public double getCapacidadGrua() {
        return capacidadGrua;
    }

    public int getNumeroGruas() {
        return numeroGruas;
    }

    public double getTamañoGanchoGrua() {
        return tamañoGanchoGrua;
    }
   @Override
    public String volar() {
    return "Esta volando";
    }
    
    @Override
    public String volando() {
return "Este Helicoptero esta volando";
    }

    @Override
    public String aterrizando() {
    return "Este helicoptero esta aterrizando";
    }
    
    @Override
    public String toString() {
        return super.toString()+"\n HelicopteroGrua{ \n" + "\n LargoCableGrua :\n" + LargoCableGrua + "\n capacidadGrua :\n" + capacidadGrua + "\n numeroGruas :\n" + numeroGruas + "\n tama\u00f1oGanchoGrua :\n" + tamañoGanchoGrua + '}';
    }


 }
   
   

