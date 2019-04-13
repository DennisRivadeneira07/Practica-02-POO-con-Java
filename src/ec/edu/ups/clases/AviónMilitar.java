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

    private double pesoArmas;
    private int nuemeroArmasEnUnidades;
    private String tipoDeArmas;
    private String nombreDeFrancoTirador;

    public AviónMilitar() {

    }

    public AviónMilitar(double pesoArmas, int nuemeroArmasEnUnidades, String tipoDeArmas, String nombreDeFrancoTirador, int numeroDeAlas, int numeroDeAzafatas, double horasServicioDeCommida, String categoriaSocial, int numeroTurbinas, int numroPasajeros, double costoDeVuelo, int numeroTripulantes, double alturaDeVuelo) {
        super(numeroDeAlas, numeroDeAzafatas, horasServicioDeCommida, categoriaSocial, numeroTurbinas, numroPasajeros, costoDeVuelo, numeroTripulantes, alturaDeVuelo);
        this.pesoArmas = pesoArmas;
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
        this.tipoDeArmas = tipoDeArmas;
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public AviónMilitar(double pesoArmas, int nuemeroArmasEnUnidades, String tipoDeArmas, String nombreDeFrancoTirador) {
        this.pesoArmas = pesoArmas;
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
        this.tipoDeArmas = tipoDeArmas;
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public void setPesoArmas(double pesoArmas) {
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

    public double getPesoArmas() {
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
        return super.toString() + " \n Avi\u00f3nMilitar{\n" + "pesoArmas : \n" + pesoArmas + "\n nuemeroArmasEnUnidades=\n" + nuemeroArmasEnUnidades + "\n tipoDeArmas=\n" + tipoDeArmas + "\n nombreDeFrancoTirador=\n" + nombreDeFrancoTirador + '}';
    }

  
}
