package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Arrays {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //primer();
        //arrayAleatorio();
        //tercero();
        //cuarto();
        //quinto();
        //sextoA();
        //septimo();
        octavo();
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
        int tamano = numeros.length;
        for (int i = 0; i < tamano; i++) {
            System.out.printf("el numero %d esta en la posicion: %d \n", numeros[i], i);
        }
    }
    /*Crea un array de números donde le indicamos por teclado el tamaño del array,
    rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición
    y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre
    los que tenga que generar), para mostrar el contenido y la suma del array y un método privado para generar número
    aleatorio (lo puedes usar para otros ejercicios).*/
    private static void arrayAleatorio (){
        int tamanoArray;
        System.out.println("Digite el tamaño del arreglo");
        tamanoArray = sc.nextInt();
        int [] listaAleatoria = new int[tamanoArray];
        listaAleatoria = llenatArraysAleatorio(tamanoArray);
        mostrarArrays(listaAleatoria);
    }
    public static int[] llenatArraysAleatorio (int tamano){
        int[] numero = new int[tamano];
        int numeroAleatorio;
        for (int i = 0; i < tamano; i++) {
            numeroAleatorio =  (int)(Math.random() * (9 - 0 + 1)) + 0;
            numero[i] = numeroAleatorio;
        }
        return numero;
    }
    /*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre
    los números deseados, por último nos indica cual es el mayor de todos.
    Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.*/

    private  static  void tercero(){
        int tamanoArray = tamanoArray();
        int [] listaAleatoria = new int[tamanoArray];
        listaAleatoria = llenatArray(tamanoArray);
        mostrarArrays(listaAleatoria);
    }
    public static int[] llenatArray (int tamano){
        int[] numero = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            numero [i] = numeroPrimoAleatorio(200 ,0);
        }
        return numero;
    }
    public static int tamanoArray (){
        int tamano;
        System.out.println("que tamaño desea que tenga el array");
        tamano = sc.nextInt();
        return tamano;
    }
    public static int numeroPrimoAleatorio(int max, int min){
        int numero=0;
        int numeroPrimo;
        boolean number = false;

        while (number != true){
            numero =  (int)(Math.random() * (max - min + 1)) + min;
            number = esPrimo(numero);
        }
        numeroPrimo = numero;
        return numeroPrimo;
    }
    public static boolean esPrimo(int numero){
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
    /*Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos
    y la media.*/
    private static void cuarto (){
        int tamano= 100;
        int [] lista = new int[tamano];
        lista = llenarNumeros();
        mostrarArrayDe1A100(lista);
    }
    public static int[] llenarNumeros (){
        int tam = 100;

        int [] lista = new int[tam];
        for (int i = 0; i < tam; i++) {
            lista [i] = i +1;
        }
        return lista;
    }
    public static void mostrarArrayDe1A100 (int[] numeros){
        int tamano = numeros.length;
        int suma = 0;
        float media;
        for (int i = 0; i < tamano; i++) {
            suma = numeros[i] + suma;
            System.out.printf("el numero %d esta en la posicion: %d \n", numeros[i], i);
        }
        System.out.println("La suma de los numeros que se encuentran en la esta es: "+ suma);
        System.out.println("la media delos numeros que estan en la lista es:" + suma / 100);
    }
    /*Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después, ve pidiendo
    posiciones del array por teclado y si la posicion es correcta, se añadira a una cadena que se mostrara al
    final, se dejará de insertar cuando se introduzca un -1.
    Por ejemplo, si escribo los siguientes numeros
    0 //Añadira la ‘A’
    5 //Añadira la ‘F’
    25 //Añadira la ‘Z’
    50 //Error, inserte otro numero
    -1 //fin
    Cadena resultante: AFZ*/
    private static void quinto(){
        char[] alfabeto = {
                'A','B','C','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };
        int i;
        String cadenaCaracteres = "";
        do {
            System.out.println("Digite un numero del 0 al 25");
            System.out.println("si desea salir digite -1");
            i = sc.nextInt();
            if (i < -1 || i > 25) {
                System.out.println("Error, inserte otro numero");

            } else if (i != -1){
                cadenaCaracteres += String.valueOf(alfabeto[i]);
            }


        } while (i != -1);
        System.out.println(cadenaCaracteres);
    }
    /*Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
    Puedes hacer sin métodos de String.*/
    //Sin
    private static void sextoA (){
        String frase = "";
        int tamanoFrase = 0;
        System.out.println("Dfigita una frase");
        frase = sc.nextLine();
        tamanoFrase = frase.length();
        char[] fraseChar = new char[tamanoFrase];
        for (int i = 0; i < tamanoFrase; i++) {
            fraseChar[i] = frase.charAt(i);
            System.out.println(fraseChar[i]);
        }
    }
    /*Crea dos arrays de números con una posición pasado por teclado.
    Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
    después crea un nuevo array con el primer array (usa de nuevo new con el primer array)
    con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números
    aleatorios.

    Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la multiplicación
    de la posición 0 del array1 con el del array2 y así sucesivamente. Por último,
    muestra el contenido de cada array.

    Llama al final al recolector de basura.*/
    private static void septimo () {

        //Indicamos el tamaño
        String texto= JOptionPane.showInputDialog("Introduce un tamaño");
        int tamanio=Integer.parseInt(texto);

        //Creamos los arrays
        int array1[]=new int [tamanio];
        int array2[];

        //Rellenamos el array1
        rellenarNumAleatorioArray(array1, 10, 100);

        //Apuntamos el array2 al array1
        array2=array1;

        //Creamos un nuevo array, usando el array1. Array1 tendra una nueva direccion.
        array1=new int[tamanio];

        //Lo volvemos a rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores
        rellenarNumAleatorioArray(array1, 10, 100);

        //Contiene el array con el resultado de multiplicar los valores de los arrays
        int array3[]=multiplicador(array1, array2);

        //Mostramos el contenido de los arrays

        System.out.println("Array1");
        mostrarArray(array1);

        System.out.println("Array2");
        mostrarArray(array2);

        System.out.println("Array3");
        mostrarArray(array3);

        //Llamamos al recolector de basura
        System.gc();

    }
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }

    public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
    /*Crea un array de números de un tamaño pasado por teclado, el array contendrá números
    aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un dígito que
    nosotros le indiquemos por teclado
    (debes controlar que se introduce un numero correcto), estos deben guardarse en un
    nuevo array.

    Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5,
     podría salir 155, 25, etc.*/
    private static void octavo (){
        int tamano = tamanoArray();
        int [] lista = new int[tamano];
        char ultimoNumero;
        String numeroString;

        System.out.println("Por favor digita el ultimo numero del 0 al 9");

        numeroString = sc.next();
        ultimoNumero = numeroString.charAt(numeroString.length()-1);
        lista = llenatArraysAleator(tamano,300, ultimoNumero);
        mostrarArray(lista);

    }/*
    public static int [] llenatLista(int tamano){
        int [] lista = new int[tamano];
        int numero;
        String numeroString;
        char ultimoNumero;
        System.out.println("Por favor digita el ultimo numero del 0 al 9");
        numeroString = sc.next();
        ultimoNumero = numeroString.charAt(numeroString.length()-1);

        for (int i = 0; i < tamano; i++) {

        }

    }*/
    public static int[] llenatArraysAleator (int tamano, int maximo, char ultimoNumero){
        int[] numero = new int[tamano];
        int numeroAleatorio;
        char numeroAleatorioChar;
        String numeroAleatorioString;
        for (int i = 0; i < tamano; i++) {
            do {
                numeroAleatorio =  (int)(Math.random() * (maximo - 0 + 1)) + 0;
                numeroAleatorioString = String.valueOf(numeroAleatorio);
                numeroAleatorioChar = numeroAleatorioString.charAt(numeroAleatorioString.length()-1);
            }while (numeroAleatorioChar != ultimoNumero);
            numero[i] = numeroAleatorio;
        }
        return numero;
    }
}
