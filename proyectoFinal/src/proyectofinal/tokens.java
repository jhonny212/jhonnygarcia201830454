/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.LinkedList;

/**
 *
 * @author jhonny
 */
public class tokens {
   static LinkedList<tokens> list; 
   private String letra;
   private String token;
   private int columna;

    public static LinkedList<tokens> getList() {
        return list;
    }

    public static void setList(LinkedList<tokens> list) {
        tokens.list = list;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
   public static void toknes(){
       LinkedList<expresion> tmp=new LinkedList();
       String token="error";
       tmp=analizador.tmp;
       String letra="";
       boolean validar=true;
       for(int i=0;i<tmp.size();i++){
           letra="";
           validar=true;
           token="error";
  if(tmp.get(i).getLetra().equals("“")){
      for(int j=i;j<tmp.size();j++){
          letra+=tmp.get(j).getLetra();
        if(tmp.get(j).getLetra().equals("”")){
            tokens t=new tokens();
            token="cadena";
            t.setLetra(letra);
            t.setToken(token);
            list.add(t);
            i=j;
            
        break;
        }   
      }
      validar=false;
      }
        if(tmp.get(i).getLetra().equals("'")){
         letra="";   
        if(tmp.get(i+2).getLetra().equals("'")){
         token="caracter";
         letra="'"+tmp.get(i+1).getLetra()+"'";
         tokens t=new tokens();
            t.setLetra(letra);
            t.setToken(token);
            list.add(t);
        i=i+2;
        }
         validar=false;
     
      }
              if(tmp.get(i).getLetra().equals("/") && tmp.get(i+1).getLetra().equals("*") ){
      for(int j=i;j<tmp.size();j++){
          letra+=tmp.get(j).getLetra();
        if(tmp.get(j).getLetra().equals("*") && tmp.get(j+1).getLetra().equals("/")){
            tokens t=new tokens();
            token="comentario";
            t.setLetra(letra);
            t.setToken(token);
            list.add(t);
            i=j;
        break;
        }   
      }
       validar=false;
     
      }
    if(validar){
      tokens t=new tokens();
            
            t.setLetra(analizador.tmp.get(i).getLetra());
            t.setToken(analizador.tmp.get(i).getToken());
            list.add(t);
          
    
    }
       }
       
       
  }
}
