/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.LinkedList;
import pila.estado;
import pila.matriz;

/**
 *
 * @author jhonny
 */
public class analizadorsintatic extends javax.swing.JFrame {

    /**
     * Creates new form analizadorsintatic
     */
    public analizadorsintatic() {
        initComponents();
      matriz.matriz =new estado[27][38];
      matriz.matrizvariables();
      matriz.llenar();
      
      getfunction();
      System.out.println("hola");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(analizadorsintatic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analizadorsintatic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analizadorsintatic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analizadorsintatic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analizadorsintatic().setVisible(true);
            }
        });
    }

    private void getfunction() {
    LinkedList<estado> list=new LinkedList();   
    estado tmporal=new estado();
    LinkedList<String> lists=new LinkedList();   
    LinkedList<String> lists2=new LinkedList();   
  
    String cod="";
   lists.push("$");
   lists.push("A");
 
   
   
   boolean pila=true;
     lists2.push("}");
     lists2.push("{");
     lists2.push(")");
     lists2.push("(");
     lists2.push("Identificador");
     lists2.push("funcion");
     int count=lists.size();
      System.out.println(count +" c");
       
    while(pila){
        if(lists.size()<0){
        pila=false;
        }
            for(int i=0; i<27;i++){
            for(int j=0; j<38;j++){
                try{
                 
                   
           if(matriz.matriz[i][j].getEstado().equals(lists.get(0))){
            System.out.println(lists.get(0)+"--->");
                
                
           String arrayt[]=matriz.matriz[i][j].getEstado().split(" ");
                if(arrayt[arrayt.length-1].equals("landa")){
                 lists.pop();
                 System.out.println("entra");
                 
                 } else {
               
                  lists.pop();
               
                   if(noTerminal(arrayt[arrayt.length-1])){
                    
                    for(int k=arrayt.length; k<=0;k--){
                    lists.push(arrayt[k]);
                 }
                   }else{
                   if(lists.get(0).equals(lists2.get(0))){
                   lists.pop();
                   lists2.pop();
                   }else{
                   }
                   }}
             
                
             }
              
                }catch(NullPointerException e){
             
             
        }
            
            }}}
        
        
    
   
     
        
    }
    
    private boolean noTerminal(String cad){
    boolean validar=true;
    String array[]={"A","B","C","D","E","F","G","H","I","J","K","L",
    "M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    
    return validar;}
    
       private boolean landa(String cad){
    boolean validar=false;
    if(cad.equals("landa")){
    validar=true;
    }
    
    return validar;}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
