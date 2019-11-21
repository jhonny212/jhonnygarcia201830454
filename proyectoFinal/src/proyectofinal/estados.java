/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import static proyectofinal.analizador.tmp;

/**
 *
 * @author jhonny
 */
public class estados {
    private boolean aceptacion;
    private String codigoEstado;
    private String expresionAnterior;
    private String tipo;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    public estados(){}
  /*  public estados(boolean aceptacion, String codigoEstado, String expresionAnterior, String tipo) {
        this.aceptacion = aceptacion;
        this.codigoEstado = codigoEstado;
        this.expresionAnterior = expresionAnterior;
        this.tipo = tipo;
    }*/
    
    public String tipo(estados tmp){
    String tipo="";
    
    
    return tipo;}

    public boolean isAceptacion() {
        return aceptacion;
    }

    public void setAceptacion(boolean aceptacion) {
        this.aceptacion = aceptacion;
    }

    public String getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getExpresionAnterior() {
        return expresionAnterior;
    }

    public void setExpresionAnterior(String expresionAnterior) {
        this.expresionAnterior = expresionAnterior;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
}
