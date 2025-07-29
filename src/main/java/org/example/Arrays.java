package org.example;

import java.util.Scanner;

public class Arrays {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        primer();
    }

    /*Crea un array de 10 posiciones de números con valores pedidos por teclado.
    Muestra por consola el indice y el valor al que corresponde. Haz dos métodos,
    uno para rellenar valores y otro para mostrar.*/
    private static void primer() {
        int[] numeros = llenarArrays();
        mostrarArrays(numeros);
    }
    public static int[] llenarArrays(){
        int[] numero = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor digite un numero");
            numero[i] = sc.nextInt();
        }
        return numero;
    }
    public static void mostrarArrays(int[] numeros){
        for (int i = 0; i < 10; i++) {
            System.out.printf("el numero %d esta en la posicion: %d \n", numeros[i], i);
        }
    }
}
