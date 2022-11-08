/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclodowhile3;

/**
 *
 * @author ferch
 */
public class CicloDoWhile3 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
      
int i=1000; //la variable i iniciara en 1000 
        do {            
            System.out.println(i+"");
            i-=200; //se descontara la variable de 200 en 200 y luego lo imprimira con el metodo
                    //i hasta que no sea menor o igual a 200 no dejara de imprimir hasta que cumpla condición
        } while (i>=0);//la variable i terminara la condición mayor o igual a cero.
    }



    
      
    
}
    

