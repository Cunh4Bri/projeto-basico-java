package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
       try {
           System.out.println("Por favor, digite o numero da conta: ");
           int numero = leitura.nextInt();
           leitura.nextLine();

           System.out.println("Por favor, digite o número da Agência !");
           String agencia = leitura.nextLine();


           System.out.println("Por favor, digite o nome:");
           String nomeCliente = leitura.nextLine();


           double saldo;

           while(true){
               try {
                   System.out.println("Deposite saldo na conta:");
                   saldo = leitura.nextDouble();

                   break;

               }catch (InputMismatchException e){
                   System.out.println("Saldo inválido. Certifique-se de digitar um número válido.");
                   leitura.nextLine();
               }

           }


           System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                   "sua agência é "+ agencia+ " conta " + numero + " e seu saldo "+saldo + " " +
                   "já está disponível para saque");

           leitura.close();

       } catch (InputMismatchException e) {
           System.out.println("Número inválido. Certifique-se de digitar um número inteiro.");

       }catch (Exception e ){
           System.out.println("Ocorreu um erro: " + e.getMessage());
       }
    }
}