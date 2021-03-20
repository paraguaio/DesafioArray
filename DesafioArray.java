/*
 * 1 - Faça um programa para ler um número com valor indeterminado. Após isto,
ler mais um número qualquer, calcular (soma) e escrever quantas vezes esse 
número aparece no array. Sempre imprimir na tela os processos do vetor.
 */
package desafioarray;

import java.util.ArrayList;
import java.util.Scanner;



public class DesafioArray 
{
public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> vetores = new ArrayList();
        

        String test;
        int soma = 0, numero1 = 0, lista, numero2;
        

        do
        {
        System.out.println(
                "**** Digite o serviço a ser utilizado ****\n" 
                + "1 - Adicionar primeiro valor \n"
                + "2 - Adicionar segundo valor \n"
                + "3 - Somar Valores do vetor \n");
        
        lista = ler.nextInt();
        
                
                switch (lista)
                {
                case 1:
                    test = ler.nextLine();
                    System.out.println("\nAdicione o primeiro valor no vetor");
                    numero1 = ler.nextInt();
                    vetores.add(numero1);
                    System.out.println("\nValor " + numero1 + " Adicionado Com Sucesso!\n");
                    break;
                    
                case 2:
                    test = ler.nextLine();
                    System.out.println("\nAdicione o segundo valor no vetor");
                    numero2 = ler.nextInt();
                    vetores.add(numero2);
                    System.out.println("\nValor " + numero2 + " Adicionado Com Sucesso!\n");
                    break;
                    
                case 3:
                    test = ler.nextLine();
                    System.out.println("\nSome os valores adicionados ao vetor");
                    numero2 = ler.nextInt();
                    for (int valores : vetores) 
                    {
                    soma = numero1 + numero2; 
                    }
                    System.out.println("Soma dos valores: " + soma);
                    break;    
                   


                default:
                    System.out.println("Número do Serviço Inválido!");
                            
                }
        }while(lista != 8);
        
        
    }


}
