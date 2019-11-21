/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;

/**
 *
 * @author jhonny
 */
public class analizador {
  public  static LinkedList <String > lista=new LinkedList();

    public analizador(){}
   static String Texto;
   static LinkedList<expresion> listacadena;
   static LinkedList<expresion> tmp;
   
   
 public static void llenarmatriz(){
for(int i=0; i<15;i++){
for(int j=0; j<12;j++){
index.matriz[i][j]=new estados();
switch(i){
  
       case 0:
        index.matriz[i][j].setExpresionAnterior("A");

        break;
        case 1:
        index.matriz[i][j].setExpresionAnterior("B");

        break;
         case 2:
        index.matriz[i][j].setExpresionAnterior("C");

        break;
         case 3:
      index.matriz[i][j].setExpresionAnterior("D");

        break;
         case 4:
        index.matriz[i][j].setExpresionAnterior("E");

        break;
                 case 5:
       index.matriz[i][j].setExpresionAnterior("F");

        break;
         case 6:
        index.matriz[i][j].setExpresionAnterior("G");

        break;

         case 7:
      index.matriz[i][j].setExpresionAnterior("H");

        break;
         case 8:
     index.matriz[i][j].setExpresionAnterior("I");

        break;
         case 9:
       index.matriz[i][j].setExpresionAnterior("J");

        break;
         case 10:
    index.matriz[i][j].setExpresionAnterior("K");

     

        break;
                 case 11:
      index.matriz[i][j].setExpresionAnterior("M");

        break;
                 case 12:
      index.matriz[i][j].setExpresionAnterior("N");

        break;
                 case 13:
      index.matriz[i][j].setExpresionAnterior("O");

        break;
                            case 14:
      index.matriz[i][j].setExpresionAnterior("P");

        break;
        
}
switch(j){
    case 0:
        index.matriz[i][j].setTipo("Digito");
        break;
         case 1:
        index.matriz[i][j].setTipo("Letra");
        break;
         case 2:
        index.matriz[i][j].setTipo("“");
        break;
         case 3:
        index.matriz[i][j].setTipo("'");
        break;
         case 4:
        index.matriz[i][j].setTipo(".");
        break;
                 case 5:
        index.matriz[i][j].setTipo("*");
        break;
         case 6:
        index.matriz[i][j].setTipo("/");
        break;

         case 7:
        index.matriz[i][j].setTipo("=");
           index.matriz[i][j].setToken("Operador");
     
        break;
         case 8:
        index.matriz[i][j].setTipo(";");
        break;
         case 9:
        index.matriz[i][j].setTipo("Agrupacion");
        index.matriz[i][j].setToken("Agrupacion");
        
        break;
         case 10:
        index.matriz[i][j].setTipo("Operador");
        break;
                 case 11:
        index.matriz[i][j].setTipo("”");
        break;
        
}
index.matriz[i][j].setCodigoEstado("A");
}
}
llenar();
 }  
    public static void llenar(){
    //
   index.matriz[0][0].setCodigoEstado("E");
   index.matriz[0][0].setToken("Numero");
   
   index.matriz[0][1].setCodigoEstado("H");
   index.matriz[0][1].setToken("Identificador");
   
   index.matriz[0][2].setCodigoEstado("I");
    index.matriz[0][2].setToken("Signo");
   
   index.matriz[0][3].setCodigoEstado("K");
    index.matriz[0][3].setToken("Signo");
    
   index.matriz[0][4].setCodigoEstado("O");
    index.matriz[0][4].setToken("Signo");
   
   index.matriz[0][5].setCodigoEstado("C");
    index.matriz[0][5].setToken("Operador");
   
   index.matriz[0][6].setCodigoEstado("B");
    index.matriz[0][6].setToken("Operador");
    
   index.matriz[0][7].setCodigoEstado("D");
    index.matriz[0][7].setToken("Operador");
    
   index.matriz[0][8].setCodigoEstado("M");
    index.matriz[0][8].setToken("Signo");
   
   index.matriz[0][9].setCodigoEstado("P");
    index.matriz[0][9].setToken("Agrupacion");
   
   index.matriz[0][10].setCodigoEstado("J");
    index.matriz[0][10].setToken("Operador");
   index.matriz[0][11].setCodigoEstado("N");
    index.matriz[0][9].setToken("Signo");
  //
   index.matriz[4][0].setCodigoEstado("E");
    index.matriz[4][0].setToken("Numero");
   
   index.matriz[4][4].setCodigoEstado("F");
    index.matriz[4][4].setToken("Error");
   //
   index.matriz[5][0].setCodigoEstado("G");
    index.matriz[5][0].setToken("Flotante");
   //
   index.matriz[6][0].setCodigoEstado("G");
    index.matriz[6][0].setToken("flotante");
   index.matriz[7][0].setCodigoEstado("H");
    index.matriz[7][0].setToken("Identificador");
   index.matriz[7][1].setCodigoEstado("H");
    index.matriz[7][1].setToken("Identificador");
    
    }
    
    
    
public static void leer(int seleccion, JFileChooser fc){
if(seleccion==JFileChooser.APPROVE_OPTION){
    //Seleccionamos el fichero
    File fichero=fc.getSelectedFile();
    try {
        //Ecribe la ruta del fichero seleccionado en el campo de texto
        FileReader fr=new FileReader(fichero);
        BufferedReader b=new BufferedReader(fr);
        String cadena;
        int cout=0;
        while((cadena=b.readLine())!=null){
        Texto+=cadena+ "\n" ;
        method(cadena);
        }
    } catch (FileNotFoundException ex) {
    } catch (IOException ex) {
    }

}

}
public static void method (String cadena){


String array[]=cadena.split(" ");
for(int i=0; i<array.length;i++){
if(array[i].length()>0){
lista.add(array[i]);
}
}
}




public void analizar(String letra){
String array[]=letra.split("");
boolean romper=true;

String estadoInicial="A";
String tipo="";

String txt="";  
String toke="";
int k=0;
while(k<array.length){
    romper=true;
for(int i=0;i<15;i++){
    
for(int j=0;j<12;j++){

    
    if(estadoInicial.equals(index.matriz[i][j].getExpresionAnterior()) && romper){
       
        if(expresion.letra(array[k]).equals(index.matriz[i][j].getTipo())){
        if(estadoInicial.equals(index.matriz[i][j].getExpresionAnterior())){
       if(index.matriz[i][j].getCodigoEstado().equals("A"))
        {
       expresion list=new expresion();
        estadoInicial="A";
        list.setLetra(txt);
        
        list.setToken(index.matriz[i][j].getToken());
        list.setTipo(tipo);
        
        tmp.add(list);
        k=k-1;
        tipo="";
        txt="";
        toke="";
        }else{
        txt+=array[k];
        estadoInicial=index.matriz[i][j].getCodigoEstado();
        tipo+=index.matriz[i][j].getCodigoEstado();
        toke=(index.matriz[i][j].getToken());
        
        }
        romper=false;
        break;
        }
        }
    }
}
}
k++;


}
  expresion list=new expresion();
  list.setLetra(txt);
  list.setTipo(tipo);
  list.setToken(toke);
  tmp.add(list);
 

}
}
