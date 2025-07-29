package org.example;

import java.util.Scanner;

public class EjerciciosMetodos {
    static final double PI =3.1416;
    static double area;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //calcularArea();
        //rango();
        //primo();
        factorial();
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

    /*  Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por parámetro para que
        nos indique si es o no un número primo, debe devolver true si es primo sino false.

        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo,
        ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

        Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible
        desde ese numero hasta 1.*/
    private static void primo (){
        int numero;
        boolean esPrimo;
        System.out.println("Digite el numero que quiere saber si es primo");
        numero = sc.nextInt();
        esPrimo = isPrimo(numero);
        if (esPrimo){
            System.out.printf("El numero %d es primo", numero);
        }else {
            System.out.printf("El numero %d no es primo", numero);
        }
    }
    public static boolean isPrimo(int numero){
        boolean esPrimo = false;
        int primo = 0;
        double resto;
        for (int i = 1; i <= numero; i++) {
            resto = numero % i;
            if (resto == 0){
                primo++;
            }
        }
        if (primo <= 2){
            esPrimo =true;
        }
        return esPrimo;
    }
    /*Crea una aplicación que nos calcule el factorial de un número pedido por teclado,
    lo realizara mediante un método al que le pasamos el número como parámetro.
    Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno.
    Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.*/
    public static void factorial(){
        int numero;
        int fac;
        System.out.println("Digite el numero al cual quiere ver su factorial");
        numero = sc.nextInt();
        fac = factor(numero);
        System.out.printf("El factorial de %d es: %d",numero,fac);
    }
    public static int factor(int numero){
        int factorial = 1;
        while (numero > 0){
            factorial *= numero;
            numero --;
        }
        return factorial;
    }
}
