/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author jhonny
 */
public class matriz {
  public  static  estado [][] matriz;
    
    public static boolean matrizvariables(){
    boolean validar=false;
    for(int i=0; i<27;i++){
    for(int j=0; j<38;j++){
        matriz[i][j]=new estado();
    switch(j){
        case 0:
          matriz[i][j].setTipo("%");
            break;
        case 1:
          matriz[i][j].setTipo("&");
            break;
            case 2:
          matriz[i][j].setTipo("'");
            break;
            case 3:
          matriz[i][j].setTipo("(");
            break;
            case 4:
          matriz[i][j].setTipo(")");
            break;
            case 5:
          matriz[i][j].setTipo("*");
            break;
            case 6:
          matriz[i][j].setTipo("+");
            break;
            case 7:
          matriz[i][j].setTipo(",");
            break;
            case 8:
          matriz[i][j].setTipo("-");
            break;
            case 9:
          matriz[i][j].setTipo("/");
            break;
            case 10:
          matriz[i][j].setTipo(";");
            break;
               case 11:
          matriz[i][j].setTipo("<");
            break;
            case 12:
          matriz[i][j].setTipo("=");
            break;
            case 13:
          matriz[i][j].setTipo(">");
            break;
            case 14:
          matriz[i][j].setTipo("carácter");
            break;
            case 15:
          matriz[i][j].setTipo("booleano");
            break;
            case 16:
          matriz[i][j].setTipo("cadena");
            break;
            case 17:
          matriz[i][j].setTipo("decimal");
            break;
            case 18:
          matriz[i][j].setTipo("entero");
            break;
            case 19:
          matriz[i][j].setTipo("flotante");
            break;
            case 20:
          matriz[i][j].setTipo("funcion");
            break;
                   case 21:
          matriz[i][j].setTipo("Identificador");
            break;
            case 22:
          matriz[i][j].setTipo("mientras");
            break;
            case 23:
          matriz[i][j].setTipo("numero");
            break;
            case 24:
          matriz[i][j].setTipo("sino");
            break;
            
            case 25:
          matriz[i][j].setTipo("para");
            break;
            case 26:
          matriz[i][j].setTipo("si");
            break;
            case 27:
          matriz[i][j].setTipo("VERDADERO");
            break;
              case 28:
          matriz[i][j].setTipo("FALSO");
            break;
            case 29:
          matriz[i][j].setTipo("variable");
            break;
            case 30:
          matriz[i][j].setTipo("imprimir");
            break;
            
            case 31:
          matriz[i][j].setTipo("{");
            break;
            
            case 32:
          matriz[i][j].setTipo("|");
            break;
                   case 33:
          matriz[i][j].setTipo("}");
            break;
            case 34:
          matriz[i][j].setTipo("“");
            break;
            case 35:
          matriz[i][j].setTipo("”");
            break;
           case 36:
          matriz[i][j].setTipo("$");
            break;
        
    }
       switch(i){
        case 0:
          matriz[i][j].setEstado("A");
            break;
        case 1:
          matriz[i][j].setEstado("B");
            break;
            case 2:
          matriz[i][j].setEstado("C");
            break;
            case 3:
          matriz[i][j].setEstado("D");
            break;
            case 4:
          matriz[i][j].setEstado("E");
            break;
            case 5:
          matriz[i][j].setEstado("F");
            break;
            case 6:
          matriz[i][j].setEstado("G");
            break;
            case 7:
          matriz[i][j].setEstado("H");
            break;
            case 8:
          matriz[i][j].setEstado("I");
            break;
            case 9:
          matriz[i][j].setEstado("J");
            break;
            case 10:
          matriz[i][j].setEstado("K");
            break;
               case 11:
          matriz[i][j].setEstado("L");
            break;
            case 12:
          matriz[i][j].setEstado("M");
            break;
            case 13:
          matriz[i][j].setEstado("N");
            break;
            case 14:
          matriz[i][j].setEstado("O");
            break;
            case 15:
          matriz[i][j].setEstado("P");
            break;
            case 16:
          matriz[i][j].setEstado("R");
            break;
            case 17:
          matriz[i][j].setEstado("S");
            break;
            case 18:
          matriz[i][j].setEstado("T");
            break;
            case 19:
          matriz[i][j].setEstado("U");
            break;
            case 20:
          matriz[i][j].setEstado("V");
            break;
                   case 21:
          matriz[i][j].setEstado("W");
            break;
            case 22:
          matriz[i][j].setEstado("X");
            break;
            case 23:
          matriz[i][j].setEstado("Y");
            break;
            case 24:
          matriz[i][j].setEstado("Z");
            break;
            case 25:
          matriz[i][j].setEstado("Ñ");
            break;
            case 26:
          matriz[i][j].setEstado("Q");
                 
         
        
    }
    }
    }
    
    llenar();
    return validar;}
    public static void llenar(){
    matriz[9][0].setCod("L J");
    matriz[11][0].setCod("%");
  
    matriz[18][1].setCod("landa");
    matriz[19][1].setCod("& O");
      
    matriz[9][3].setCod("L J");
    matriz[11][3].setCod("(");
    matriz[17][3].setCod("( S ) C");
    matriz[21][3].setCod("( S ) X");
    matriz[26][3].setCod("S");
    
    
    matriz[2][4].setCod("landa");
    matriz[4][4].setCod("landa");
    matriz[6][4].setCod("landa");
    matriz[7][4].setCod("landa");
    matriz[9][4].setCod("L J");
    matriz[11][4].setCod(")");
    matriz[12][4].setCod("landa");
    matriz[18][4].setCod("landa");
    matriz[19][4].setCod("landa");
    matriz[22][4].setCod("landa");
    matriz[23][4].setCod("landa");
                 
                 
       matriz[2][5].setCod("* W Y");
       matriz[9][5].setCod("landa");
       matriz[22][5].setCod("* W");
     
       
       matriz[2][6].setCod("+ S");
       matriz[9][6].setCod("L J");
       matriz[11][6].setCod("+");
       matriz[16][6].setCod("+ +");
       matriz[22][6].setCod("landa");
       matriz[23][6].setCod("+ S");
       ////////////////////////////////////////
      matriz[12][7].setCod(", variable D");
      
     matriz[2][8].setCod("- S");
     matriz[9][8].setCod("L J");
     matriz[11][8].setCod("-");
          matriz[16][8].setCod("- -");
    matriz[22][8].setCod("landa");
    matriz[23][8].setCod("- S");
          
   
    matriz[0][9].setCod(" / * J * / ;");
    matriz[2][9].setCod("/ W Y");
      matriz[9][9].setCod("L J");
    matriz[11][9].setCod("/");
    matriz[22][9].setCod("/ W");
   
    matriz[2][10].setCod("landa");
    matriz[4][10].setCod("landa");
    matriz[6][10].setCod("landa");
    matriz[7][10].setCod("landa");
    matriz[22][10].setCod("landa");
    matriz[23][10].setCod("landa");
    
    //< menor
    matriz[18][11].setCod("< V Z");
    
    
    matriz[4][12].setCod("= numero");
    matriz[5][12].setCod("= “ J ”");
    matriz[6][12].setCod("= K");
    matriz[7][12].setCod("= flotante");
    matriz[8][12].setCod("= ' L '");   
    matriz[18][12].setCod("V > Z");  
    matriz[20][12].setCod("=");
  //
    matriz[18][13].setCod("V > Z");
    matriz[20][13].setCod("landa");
    
//
    matriz[3][14].setCod("carácter Identificador I");
  //  
    matriz[3][15].setCod("bboleano Identificador G");
    
    matriz[3][16].setCod("cadena Identificador F");
    
    matriz[3][17].setCod("decimal Identificador H");
    
    matriz[3][18].setCod("entero Identificador E");
    //
    
    matriz[9][19].setCod("L J");
    matriz[11][19].setCod("flotante");
    matriz[13][19].setCod("Ñ N");
    matriz[14][19].setCod("Z T U");
    matriz[15][19].setCod("landa");
    matriz[17][19].setCod("Z C");
    matriz[18][19].setCod("landa");
    matriz[19][19].setCod("landa");
    matriz[20][19].setCod("landa");
     matriz[21][19].setCod("Z X");
     matriz[24][19].setCod("flotante");
    matriz[25][19].setCod("Z = Q ; ");
    matriz[26][19].setCod("S");
    
    
    matriz[0][20].setCod("B A");
    matriz[1][20].setCod("funcion Identificador ( M ) { N }");
    
    matriz[9][21].setCod("L J");
    matriz[11][21].setCod("Identificador");
    matriz[13][21].setCod("Ñ N");
      matriz[14][21].setCod("Z T U");
     matriz[15][21].setCod("landa");
     matriz[17][21].setCod("Z C");
     matriz[18][21].setCod("landa");
     matriz[19][21].setCod("landa");
      matriz[20][21].setCod("landa");
     matriz[21][21].setCod("Z X");
     matriz[24][21].setCod("Identificador");
     matriz[25][21].setCod("Z = Q ;");
    matriz[26][21].setCod("S");
     
    
       matriz[13][22].setCod("Ñ N");
       matriz[15][22].setCod("landa");
       matriz[25][22].setCod("mientras ( O ) { N }");
   //
   
   matriz[9][23].setCod("L J");
   matriz[11][23].setCod("numero");
   matriz[13][23].setCod("Ñ N");
   matriz[14][23].setCod("Z T U");
   matriz[15][23].setCod("landa");
   matriz[17][23].setCod("Z C");
   matriz[18][23].setCod("landa");
   matriz[19][23].setCod("landa");
   matriz[20][23].setCod("landa");
   matriz[21][23].setCod("Z X");
   matriz[24][23].setCod("numero");
   matriz[25][23].setCod("Z = Q;");
   
   
   matriz[15][24].setCod("sino { N }");
   //
   
   matriz[13][25].setCod("Ñ N");
   matriz[15][25].setCod("landa");
   matriz[25][25].setCod("para ( variable entero Identificador = Z ; identificador O Z ; identificador R ; { N }");
      
   matriz[13][26].setCod("Ñ N");
   matriz[15][26].setCod("landa");
   matriz[25][26].setCod("si ( O ) { N } P");
    
   matriz[9][27].setCod("L J");
   matriz[10][27].setCod("VERDADERO");
   matriz[11][27].setCod("K");
 
   matriz[9][28].setCod("L J");
   matriz[10][28].setCod("FALSO");
   matriz[11][28].setCod("K");
 
   matriz[0][29].setCod("B A");
   matriz[1][29].setCod("variable D ;");
   matriz[12][29].setCod("variable D");
   matriz[13][29].setCod("Ñ N");
   matriz[15][29].setCod("landa");
  matriz[25][29].setCod("variable D ;");
   
   
   matriz[13][30].setCod("Ñ N");
   matriz[15][30].setCod("landa");
   matriz[25][30].setCod("imprimir ( S ) ;");
   
   matriz[9][31].setCod("L J");
   matriz[11][31].setCod("{");
  
    matriz[18][32].setCod("landa");
    matriz[19][32].setCod("| O");
    
    matriz[9][33].setCod("L J");
   matriz[11][33].setCod("}");
   matriz[13][33].setCod("landa");
   matriz[15][33].setCod("landa");
  
  
   
    matriz[26][34].setCod("“ J ”");
  
     matriz[9][35].setCod("landa");
  
     matriz[0][36].setCod("landa");
  
    }
}
