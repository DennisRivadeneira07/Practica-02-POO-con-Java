/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
   
   private String LargoCableGrua;
   private String capacidadGrua;
   private int numeroGruas;
   private String tamañoGanchoGrua;
   
   public HelicopteroGrua(){
       
   }

    public HelicopteroGrua(String LargoCableGrua, String capacidadGrua, int numeroGruas, String tamañoGanchoGrua, int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String alturaDeVuelo) {
        super(númeroDeHelices, codigoPatinAterrizaje, codigoAletaDesviación, marcaRotorAntipar, numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.LargoCableGrua = LargoCableGrua;
        this.capacidadGrua = capacidadGrua;
        this.numeroGruas = numeroGruas;
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }

    public HelicopteroGrua(String LargoCableGrua, String capacidadGrua, int numeroGruas, String tamañoGanchoGrua) {
        this.LargoCableGrua = LargoCableGrua;
        this.capacidadGrua = capacidadGrua;
        this.numeroGruas = numeroGruas;
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }
    public void setLargoCableGrua(String LargoCableGrua) {
        this.LargoCableGrua = LargoCableGrua;
    }

    public void setCapacidadGrua(String capacidadGrua) {
        this.capacidadGrua = capacidadGrua;
    }

    public void setNumeroGruas(int numeroGruas) {
        this.numeroGruas = numeroGruas;
    }

    public void setTamañoGanchoGrua(String tamañoGanchoGrua) {
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }

    public String getLargoCableGrua() {
        return LargoCableGrua;
    }

    public String getCapacidadGrua() {
        return capacidadGrua;
    }

    public int getNumeroGruas() {
        return numeroGruas;
    }

    public String getTamañoGanchoGrua() {
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
        System.out.println();
        return super.toString()+"\n HelicopteroGrua{ \n" + "\nLARGO DE CABLE DE GRUA :\n" + LargoCableGrua + "\nCAPACIDAD DE GRUA :\n" + capacidadGrua + "\nNÚMERO DE GRUAS :\n" + numeroGruas + "\nTAMAÑO DE GANCHO DE GRUA :\n" + tamañoGanchoGrua + '}';
    }


 }
   
   