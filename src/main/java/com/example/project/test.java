package com.example.project;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um nuemro");
        int numero;
        numero = teclado.nextInt();

        System.out.println("Informe o segundo numero");
        int numero1;
        numero1 = teclado.nextInt();

        System.out.println(numero + numero1);

        teclado.close();
    }
}
