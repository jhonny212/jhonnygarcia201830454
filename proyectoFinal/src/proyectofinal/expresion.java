/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.InputStream;

/**
 *
 * @author jhonny
 */
public class expresion {
    static boolean validar=true;
     private String letra;
     private String tipo;

    public boolean isValidar() {
        return validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   //
    public static String letra(String caracter){
    String tipo="";
    caracter=caracter.toLowerCase();
    validar=true;
    String array[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s",
    "t","u","v","w","x","y","z","á"};
    if(validar){
    for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="Letra";
    validar=false;
    break;
    }
    }}
    if(validar){
    tipo=digito(caracter);
    }
    if(validar){
    tipo=signo1(caracter);
    }
    if(validar){
    tipo=signo2(caracter);
    }
    if(validar){
    tipo=operador(caracter);
    }
    if(validar){
    tipo=operador2(caracter);
    }
    if(validar){
    tipo=operador3(caracter);
    }
    if(validar){
    tipo=operador4(caracter);
    }
    if(validar){
    tipo=agrupacion(caracter);
    }
    if(validar){
    tipo=comillasimple(caracter);
    }
    if(validar){
    tipo=punto(caracter);
    }
    if(validar){
    tipo=comilla4(caracter);
    }
   
    int a=55;
    
    return tipo;}
   //
    public static String digito(String caracter){
    String tipo="";    
    String array[]={"1","2","3","4","5","6","7","8","9","0"};
    for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="Digito";
    validar=false;
    break;
    }
    }    
  
    return tipo;}
    //
    public static String signo1(String caracter){
    String tipo="";
    String array[]={"“"};
     for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="“";
  validar=false;
    break;
    }
    } 
    
    return tipo;}
    //
    public static String signo2(String caracter){
    String tipo="";
    String array[]={";"};
     for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo=";";
  validar=false;
    break;
    }
    } 
    
    return tipo;}
    //
    public static String operador(String caracter){
    String tipo="";
    String array[]={"+","-","%","<",">"};
       for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="Operador";
     validar=false;
    break;
    }
    }
       
    return tipo;}
    
    public static String operador2(String caracter){
    String tipo="";
    String array[]={"/"};
       for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="/";
     validar=false;
    break;
    }
    }
       
    return tipo;}
    public static String operador3(String caracter){
    String tipo="";
    String array[]={"="};
       for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="=";
     validar=false;
    break;
    }
    }
       
    return tipo;}
    public static String operador4(String caracter){
    String tipo="";
    String array[]={"*"};
       for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="*";
     validar=false;
    break;
    }
    }
       
    return tipo;}
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
    public static String agrupacion(String caracter){
    String tipo="";
    String array []={"(",")","{","}"};
        for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="Agrupacion";
   validar=false;
    break;
    }
    }
    return tipo;}
 
    public  static String comillasimple(String caracter){
    String tipo="";
    String array[]={"'"};
        for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="'";
   validar=false;
    break;
    }
    }
    return tipo;}  
   public  static String punto(String caracter){
    String tipo="";
    String array[]={"."};
        for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo=".";
   validar=false;
    break;
    }
    }
    return tipo;}  
      public  static String comilla4(String caracter){
    String tipo="";
    String array[]={"”"};
        for(int i=0; i<array.length;i++){
    if(caracter.equals(array[i])){
    tipo="”";
   validar=false;
    break;
    }
    }
    return tipo;}  
             
    
}
