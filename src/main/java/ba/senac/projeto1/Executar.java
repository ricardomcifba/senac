/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba.senac.projeto1;

import java.util.Scanner;

public class Executar {
    
    public static void main (String args[]){
        
        //Scanner ler = new Scanner(System.in);
        int lista[]= {1,3,2,7,0,43,17,-10,-55};
        int x;

          for(int i = 0; i < lista.length; i++){
              for(int j = 0; j < lista.length; j++){
                  if(lista[i] < lista[j]){
                      x = lista[i];
                      lista[i] = lista[j];
                      lista[j] = x;
                  }
              } 
          }
          for(int r = 0; r < lista.length; r++){
              System.out.println(lista[r]);
          }        
    }
    
}
