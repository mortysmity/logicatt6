/*
 * . Crie um algoritmo que leia um número inteiro e mostre como resultado o dobro de um número
caso ele seja positivo e o seu triplo caso seja negativo, mostre o resultado o resultado.
 */
package basico;

import javax.swing.JOptionPane;



/**
 *
 * @author Meu Computador
 */
public class Basico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor=0,posi,nega;
         
       while(valor==0){
       valor= Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
          
       if(valor>=0){
       posi=valor*2;
        JOptionPane.showMessageDialog(null, "Fim calculo ="+posi);
       }
       if(valor<0){
       nega=valor*3;
          JOptionPane.showMessageDialog(null, "Fim calculo ="+nega);
       }
       
       
     
           
           
           
           
           
           
           
           
           
           }
        
        
        
        
    }
    
}
