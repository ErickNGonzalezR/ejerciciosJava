package org.example;

import java.util.Scanner;

public class EjerciciosMetodos {
    static final double PI =3.1416;
    static double area;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //calcularArea();
        rango();
    }
    /* Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
    Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores
    necesarios para calcular el área. Crea un método por cada figura para calcular cada área, este
    devolverá un número real. Muestra el resultado por pantalla
    Aquí te mostramos que necesita cada figura:
    Circulo: (radio^2)*PI
    Triangulo: (base * altura) / 2
    Cuadrado: lado * lado*/
    private static void calcularArea (){
        int menu;
        System.out.println("Digite que a que figura le va a calcular el area:");
        System.out.println("1. circulo \n2. triangulo \n3. cuadrado");
        menu = sc.nextInt();
        switch (menu){
            case 1:
                areaCirculo();
                break;
            case 2:
                areaTriangulo();
                break;
            case 3:
                areacuadeado();
                break;
        }
    }
    public static void areaCirculo(){
        int radio;
        System.out.println("digite el radio del circulo");
        radio = sc.nextInt();
        area = ((double) radio /2) * PI;
        System.out.println("El area del circulo es: " + area);
    }
    public static void areaTriangulo(){
        int base;
        int altura;
        System.out.println("Digite la base del triangulo");
        base = sc.nextInt();
        System.out.println("Digite la altura del triangulo");
        altura = sc.nextInt();
        area = (double) (base * altura) / 2;
        System.out.println("El area del triangulo es: "+ area);

    }
    public static void areacuadeado(){
        int prinerLado;
        int segundoLado;
        System.out.println("digite el primer lado");
        prinerLado = sc.nextInt();
        System.out.println("digite el segundo lado");
        segundoLado = sc.nextInt();
        area = prinerLado * segundoLado;
        System.out.println("El area del cuadrado es: "+ area);
    }
    /*Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por
    teclado. Crea un método donde pasamos como parámetros entre que números queremos que los genere,
    podemos pedirlas por teclado antes de generar los números. Este método devolverá un número entero aleatorio.
    Muestra estos números por pantalla.
    */
    private static void rango(){
        int rangoMin;
        int rangoMax;
        int repeticiones;

        System.out.println("Digita la cantidad de numeros que desea ver");
        repeticiones = sc.nextInt();
        System.out.println(" digite el rango minimo");
        rangoMin = sc.nextInt();
        System.out.println(" digite el rango maximo");
        rangoMax = sc.nextInt();

        repeticiones(rangoMin, rangoMax, repeticiones);
    }
    public static void repeticiones(int rangoMin, int rangoMax, int repeticiones){
        int numeroAleatorio;
        for (int i = 1; i <= repeticiones; i++) {
            numeroAleatorio =  (int)(Math.random() * (rangoMax - rangoMin + 1)) + rangoMin;;
            System.out.printf("numero %d: %d %n" , i,numeroAleatorio);
        }
    }
}
