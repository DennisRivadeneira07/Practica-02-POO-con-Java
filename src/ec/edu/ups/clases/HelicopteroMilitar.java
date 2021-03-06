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
public class HelicopteroMilitar extends Helicoptero implements Interface {

    private int numeroArmasEquipadasUnidades;
    private String tipoHelicopteroMilitar;
    private String nombreFrancoTirador;
    private int cantidadDeMilitaresTransportados;

    public HelicopteroMilitar() {

    }

    public HelicopteroMilitar(int numeroArmasEquipadasUnidades, String tipoHelicopteroMilitar, String nombreFrancoTirador, int cantidadDeMilitaresTransportados, int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String alturaDeVuelo) {
        super(númeroDeHelices, codigoPatinAterrizaje, codigoAletaDesviación, marcaRotorAntipar, numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.numeroArmasEquipadasUnidades = numeroArmasEquipadasUnidades;
        this.tipoHelicopteroMilitar = tipoHelicopteroMilitar;
        this.nombreFrancoTirador = nombreFrancoTirador;
        this.cantidadDeMilitaresTransportados = cantidadDeMilitaresTransportados;
    }

    public HelicopteroMilitar(int numeroArmasEquipadasUnidades, String tipoHelicopteroMilitar, String nombreFrancoTirador, int cantidadDeMilitaresTransportados) {
        this.numeroArmasEquipadasUnidades = numeroArmasEquipadasUnidades;
        this.tipoHelicopteroMilitar = tipoHelicopteroMilitar;
        this.nombreFrancoTirador = nombreFrancoTirador;
        this.cantidadDeMilitaresTransportados = cantidadDeMilitaresTransportados;
    }

    public void setNumeroArmasEquipadasUnidades(int numeroArmasEquipadasUnidades) {
        this.numeroArmasEquipadasUnidades = numeroArmasEquipadasUnidades;
    }

    public void setTipoHelicopteroMilitar(String tipoHelicopteroMilitar) {
        this.tipoHelicopteroMilitar = tipoHelicopteroMilitar;
    }

    public void setNombreFrancoTirador(String nombreFrancoTirador) {
        this.nombreFrancoTirador = nombreFrancoTirador;
    }

    public void setCantidadDeMilitaresTransportados(int cantidadDeMilitaresTransportados) {
        this.cantidadDeMilitaresTransportados = cantidadDeMilitaresTransportados;
    }

    public int getNumeroArmasEquipadasUnidades() {
        return numeroArmasEquipadasUnidades;
    }

    public String getTipoHelicopteroMilitar() {
        return tipoHelicopteroMilitar;
    }

    public String getNombreFrancoTirador() {
        return nombreFrancoTirador;
    }

    public int getCantidadDeMilitaresTransportados() {
        return cantidadDeMilitaresTransportados;
    }

    @Override
    public String volar() {
        return "esta volando"; 
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
        return super.toString() + "\n HelicopteroMilitar{ \n" + "\n NÚMERO DE ARMAS EQUIPADAS EN UNIDADES :\n" + numeroArmasEquipadasUnidades + "\n TIPO DE HELICOPTERO MILITAR :\n" + tipoHelicopteroMilitar + "\nNOMBRE DE FRANCOTIRADOR :\n" + nombreFrancoTirador + "\nCANTIDAD DE MILITARES TRANSPORTADOS :\n" + cantidadDeMilitaresTransportados + '}';
    }

}
