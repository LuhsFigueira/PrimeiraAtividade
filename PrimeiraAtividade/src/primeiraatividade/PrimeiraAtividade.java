/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

import java.util.Scanner;

/**
 *
 * @author lu-lu
 */
public class PrimeiraAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final int[] ListNum = new int[20];
        int a = 0;
        int resp = 0;
        String i = "0";
        System.out.println("Informe o valor alvo: ");
        resp = input.nextInt();
        while (!i.equals("n")) {
            System.out.println("Informe o valor da lista: ");
            ListNum[a] = input.nextInt();
            System.out.println("Deseja continuar informando? (Y/n)");
            i = input.next();
            ++a;
        }
        System.out.println("Finalizado");
    }
    
}
