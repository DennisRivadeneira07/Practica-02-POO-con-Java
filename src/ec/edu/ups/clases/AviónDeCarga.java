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
public class AviónDeCarga extends Avión implements Interface {
    private String pesoDeCarga;
    private int cantidadDeCargaUnidades;
    private String tipoDeCarga;
    private int codigoDeCarga;
    
    public AviónDeCarga(){        
    }

    public AviónDeCarga(String pesoDeCarga, int cantidadDeCargaUnidades, String tipoDeCarga, int codigoDeCarga, int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial, int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String alturaDeVuelo) {
        super(numeroDeAlas, numeroDeAzafatas, horasServicioDeCommida, categoriaSocial, numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.pesoDeCarga = pesoDeCarga;
        this.cantidadDeCargaUnidades = cantidadDeCargaUnidades;
        this.tipoDeCarga = tipoDeCarga;
        this.codigoDeCarga = codigoDeCarga;
    }

    public AviónDeCarga(String pesoDeCarga, int cantidadDeCargaUnidades, String tipoDeCarga, int codigoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
        this.cantidadDeCargaUnidades = cantidadDeCargaUnidades;
        this.tipoDeCarga = tipoDeCarga;
        this.codigoDeCarga = codigoDeCarga;
    }
    
    public void setPesoDeCarga(String pesoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
    }

    public void setCantidadDeCargaUnidades(int cantidadDeCargaUnidades) {
        this.cantidadDeCargaUnidades = cantidadDeCargaUnidades;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }

    public void setCodigoDeCarga(int codigoDeCarga) {
        this.codigoDeCarga = codigoDeCarga;
    }

    public String getPesoDeCarga() {
        return pesoDeCarga;
    }

    public int getCantidadDeCargaUnidades() {
        return cantidadDeCargaUnidades;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public int getCodigoDeCarga() {
        return codigoDeCarga;
    }
     @Override
    public String volando() {
   return "Este Avion de carga esta volando";
    }

    @Override
    public String aterrizando() {
   return "Este avion de carga esta Aterrizando";
    }

    @Override
    public String aterrizar() {
    return "Aterriza";
    }
    @Override
    public String toString() {
        System.out.println();
        return super.toString() +"\n Avi\u00f3nDeCarga{ \n" + "\nPESO DE CARGA :\n" + pesoDeCarga + "\nCANTIDAD DE CARGA EN UNIDADES :\n" + cantidadDeCargaUnidades + "\nTIPO DE CARGA : \n" + tipoDeCarga + "\nCODIGO DE CARGA :\n" + codigoDeCarga + '}';
    } 

   

    
}