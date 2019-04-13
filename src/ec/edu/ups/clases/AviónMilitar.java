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
public class AviónMilitar extends Avión implements Interface {

    private String pesoArmas;
    private int nuemeroArmasEnUnidades;
    private String tipoDeArmas;
    private String nombreDeFrancoTirador;

    public AviónMilitar() {

    }

    public AviónMilitar(String pesoArmas, int nuemeroArmasEnUnidades, String tipoDeArmas, String nombreDeFrancoTirador, int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial, int numeroTurbinas, int numroPasajeros, String costoDeVuelo, int numeroTripulantes, String  alturaDeVuelo) {
        super(numeroDeAlas, numeroDeAzafatas, horasServicioDeCommida, categoriaSocial, numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.pesoArmas = pesoArmas;
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
        this.tipoDeArmas = tipoDeArmas;
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public AviónMilitar(String pesoArmas, int nuemeroArmasEnUnidades, String tipoDeArmas, String nombreDeFrancoTirador) {
        this.pesoArmas = pesoArmas;
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
        this.tipoDeArmas = tipoDeArmas;
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public void setPesoArmas(String pesoArmas) {
        this.pesoArmas = pesoArmas;
    }

    public void setNuemeroArmasEnUnidades(int nuemeroArmasEnUnidades) {
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
    }

    public void setTipoDeArmas(String tipoDeArmas) {
        this.tipoDeArmas = tipoDeArmas;
    }

    public void setNombreDeFrancoTirador(String nombreDeFrancoTirador) {
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public String getPesoArmas() {
        return pesoArmas;
    }

    public int getNuemeroArmasEnUnidades() {
        return nuemeroArmasEnUnidades;
    }

    public String getTipoDeArmas() {
        return tipoDeArmas;
    }

    public String getNombreDeFrancoTirador() {
        return nombreDeFrancoTirador;
    }
  @Override
    public String volando() {
   return "Este Avión Militar esta Volando";
    }

    @Override
    public String aterrizando() {
        return "Este avión militar esta aterrizando";
    }

    @Override
    public String aterrizar() {
        return "Aterriza";
    }

    @Override
    public String toString() {
        System.out.println();
        return super.toString() + " \n Avi\u00f3nMilitar{\n" + "PESO DE ARMAS :\n" + pesoArmas + "\nNÚMERO DE ARMAS EN UNIDADES :\n" + nuemeroArmasEnUnidades + "\nTIPO DE ARMAS :\n" + tipoDeArmas + "\nNOMBRE DE FRANCOTIRADOR :\n" + nombreDeFrancoTirador + '}';
    }

  
}

