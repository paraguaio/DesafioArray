/*
 * 2 - Leia um vetor de 20 posições. Contar e escrever quantos valores pares 
e ímpares ele possui. Imprimir na tela
 */
package desafioarray;
import java.util.ArrayList;

public class DesafioArray2 
{
    
   
    public static void main(String[] args) 
    {
        ArrayList <Integer> numeros = new ArrayList(); 
        

        int pares = 0, impares = 0;
        

        for(int i = 0; i < 20; i++){            
            numeros.add(i + 1);

                if(numeros.get(i) % 2 == 0){
                    pares++;
  
                }else if(numeros.get(i) % 2 != 0){
                    impares++;
                }

                else{
                    System.out.println("Números com decimais nãos são aceitos aceitos!");
                }    
        }
        
        System.out.println("Os numeros listados: \n" + numeros);
        System.out.println("\nNúmeros pares: " + pares);
        System.out.println("\nNúmeros ímpares: " + impares);
    }
    
}

    

