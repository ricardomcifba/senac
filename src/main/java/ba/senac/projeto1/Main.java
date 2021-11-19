
package ba.senac.projeto1;

import java.util.Scanner;


public class Main {
    
    public static void main (String args[]){
        
        Scanner ler = new Scanner(System.in);
        
        /*Aluno aluno = new Aluno("Ricardo", 1.76, "Castanho", 41);*/
        Cachorro dog = new Cachorro("Totó", "Doberman", 2);
        //System.out.println("O nome do Aluno é " + aluno.getNome());
        dog.setNome("Dumbledore");
        String letra;
  
        for(int i = 0; i <= 10; i++){
            System.out.println("Qual letra for");
            letra = ler.nextLine();
            
            System.out.println(//"O nome do cachorro é " + dog.getNome() +
                           //"\n da raça " + dog.getRaca() +
                           /*"\n e ele possui " +*/ dog.getIdade() + " anos");
/*            if(i%2 == 0){
                dog.envelhecer();
            }
            
            if(dog.getIdade()%2 == 1){
                dog.setIdade(dog.getIdade()-1);
            }
*/            
            while(letra.equals("h")){                
                dog.envelhecer();
                System.out.println("Qual letra while");
                letra = ler.nextLine();
                System.out.println("while "+ letra);
            }
        }
        
    }
    
}
