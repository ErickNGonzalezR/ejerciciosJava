package org.example;

import javax.swing.*;
import java.util.Scanner;

public class EjerciciosBasicos {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //primerEjercicio();
        //segundoEjercicio();
        //terceroEjercicio();
        //cuartoEjercicio();
        //quintoEjercicio();
        //sextoEjercicio();
        //septimoEjercicio();
        //octavoEjercicio();
        //novenoEjercicio();
        //decimoEjercicio();
        //onceEjercicio();
        //doceEjercicio();
        //treceEjercicio();
        //catorcejercicio();
        //quinceEjercicio();
        //dieciseisEjercicio();
        //diesisieteEjercicio();
        //dieciochoEjercicio();
        //diecinueveEjercicio();
        //veinteEjercicio();
        //ventiunoEjercicio();
        //ventidosEjercicio();
        //ventitresEjercicio();

    }

    /*
        1) Declara dos variables numéricas (con el valor que desees), muestra por consola
        la suma, resta, multiplicación, división y módulo (resto de la división).
        */

    public static void primerEjercicio() {
        int primerNumero = 5;
        int segundoNumero = 2;
        System.out.printf("El resultado de la suma de %d con %d es: %d\n",
                primerNumero, segundoNumero, primerNumero + segundoNumero);
        System.out.printf("El resultado de la resta de %d con %d es: %d\n",
                primerNumero, segundoNumero, primerNumero - segundoNumero);
        System.out.printf("El resultado de la multiplicacion de %d con %d es: %d\n",
                primerNumero, segundoNumero, primerNumero * segundoNumero);
        System.out.printf("El resultado de la division de %d con %d es: %d\n",
                primerNumero, segundoNumero, primerNumero / segundoNumero);
    }

    /*
    Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
    Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
    */

    public static void segundoEjercicio() {
        int numero1 = 82;
        int numero2 = 412;
        if (numero2 == numero1) {
            System.out.printf("los dos numeros %d son iguales\n", numero1);
        } else if (numero1 > numero2) {
            System.out.printf("El numero %d es mayor que %d\n", numero1, numero2);
        } else {
            System.out.printf("El numero %d es mayor que %d\n", numero2, numero1);
        }
    }

    /*Declara un String que contenga tu nombre, después muestra un
    mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca
    «Bienvenido Fernando».*/

    public static void terceroEjercicio() {
        String nombre;
        System.out.println("Digiata tu nombre");
        nombre = sc.nextLine();
        System.out.printf("Bienvenido %s\n", nombre);
    }
    /*Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
    (recuerda usar JOptionPane). */

    public static void cuartoEjercicio() {
        String nombre;
        nombre = JOptionPane.showInputDialog(null, "Por favor dijita tu nombre");
        System.out.printf("Bienvenido %s\n", nombre);

    }

    /*Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá
    por teclado (recuerda pasar de String a double con Double.parseDouble).
    Usa la constante PI y el método pow de Math.*/

    public static void quintoEjercicio() {
        double area;
        double radio;
        radio = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Dihita el radio del circulo"));
        area = radio * Math.PI;
        System.out.printf("el area delo circulo es: %f", area);
    }

    /*Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
    Si no lo es, también debemos indicarlo.*/

    public static void sextoEjercicio() {
        int numero;
        double resto;
        System.out.println("Digita un numero");
        numero = sc.nextInt();
        resto = numero % 2;

        if (resto == 0) {
            System.out.printf("El numero %d es divisible en 2\n", numero);
        } else {
            System.out.printf("El numero %d no es divisible en 2\n", numero);
        }

    }

    /* Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
    Por ejemplo: si introduzco un 97, me muestre una a.*/

    public static void septimoEjercicio() {
        int numero;
        char caracter;
        System.out.println("Digita un numero");
        numero = sc.nextInt();
        caracter = (char) numero;
        System.out.printf("El caracter que didigitaste es: %s", caracter);
    }

    /*Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y
    muestre su código en la tabla ASCII.*/

    public static void octavoEjercicio() {

        String caracteres;
        char caracter;
        int numero;

        System.out.println("Digita un carácter:");
        caracteres = sc.nextLine();
        caracter = caracteres.charAt(0);
        numero = (int) caracter;
        System.out.printf("El código ASCII que digitaste es: %d\n", numero);
    }

    /* Lee un número por teclado que pida el precio de un producto (puede tener decimales)
    y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/

    public static void novenoEjercicio() {
        final double IVA = 0.21;
        double valorIva, precio, total;
        System.out.println("Por favor digita un precio");
        precio = sc.nextDouble();
        valorIva = precio * IVA;
        total = valorIva + precio;
        System.out.printf("El precio con iva es: %f", total);
    }

    /*Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.*/

    public static void decimoEjercicio() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

    /*Haz el mismo ejercicio anterior con un bucle for.*/

    public static void onceEjercicio() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
    Utiliza el bucle que desees.*/

    public static void doceEjercicio() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d es divisible entre 2 \n", i);
            } else if (i % 3 == 0) {
                System.out.printf("%d es divisible entre 3\n", i);
            }
        }
    }

    /*Realiza una aplicación que nos pida un número de ventas a introducir,
    después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
    Al final mostrará la suma de todas las ventas.
    Piensa que es lo que se repite y lo que no.*/

    public static void treceEjercicio() {
        int numeroProductos;
        double total = 0;
        System.out.println("Por favor digite la cantidad de productos");
        numeroProductos = sc.nextInt();

        for (int i = 0; i < numeroProductos; i++) {
            System.out.println("Ditita el precio");
            total += sc.nextInt();
        }
        System.out.printf("El Total del valor de los productos es: %f\n ", total);
    }

    /*Realiza una aplicación que nos calcule una ecuación de segundo grado.
    Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante
    (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math.
    Te recomiendo que uses mensajes de traza.*/

    public static void catorcejercicio() {

    }

    /*Escribe una aplicación con un String que contenga una contraseña cualquiera.
    Después se te pedirá que introduzcas la contraseña, con 3 intentos.
    Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena».
    Piensa bien en la condición de salida (3 intentos y si acierta sale,
    aunque le queden intentos)*/

    public static void quinceEjercicio() {
        String contarsena = "contra";
        String nuevaContrasena;
        int intentos = 0;
        boolean esCorrecto = false;
        //isTurnLight =()? valorRegreso (Si la condicion se cumple de vuelve valorRegreso): valorRegreso1 (Si la condicopn no se cumple de vuelve valorRegreso1);
        do {
            System.out.println("Por favor Digite su contraseña");
            nuevaContrasena = sc.nextLine();

            //esCorrecto = (nuevaContrasena.equals(contarsena)) ? false : true;
            esCorrecto = nuevaContrasena.equals(contarsena);

            if (esCorrecto) {
                System.out.println("Contraseña correcta. Bienvenido.");
                intentos = 3;
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta. Intento numero:" + intentos);

            }

        } while (intentos < 3);
    }

    /*Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/

    public static void dieciseisEjercicio() {
        int numero;
        do {
            System.out.println("digite un numero");
            numero = sc.nextInt();
        } while (numero <= 0);

    }

    /* Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
    laboral o no. Usa un switch para ello.*/

    public static void diesisieteEjercicio() {
        System.out.println("Por favor digite un dia de la semana");
        System.out.println("L pa lunes, M para martes, W para miercoles, J para juevers, V para viernes, S para sabado y D para domingo");
        String dia = sc.next();
        dia = dia.toUpperCase();
        switch (dia) {
            case "L":
            case "M":
            case "W":
            case "J":
            case "V":
            case "S":
                System.out.println("El dia no es laboral");
                break;
            case "D":
                System.out.println("El dia no es laboral");
                break;
            default:
                System.out.println("elije una opcion correcta");
                break;

        }
    }

    /*Pide por teclado dos número y genera 10 números aleatorios entre esos números.
    Usa el método Math.random para generar un número entero aleatorio
              (recuerda el casting de double a int).*/
    public static void dieciochoEjercicio() {

    }

    /*Pide por teclado un número entero positivo (debemos controlarlo) y muestra
    el número de cifras que tiene. Por ejemplo: si introducimos 1250,
    nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras,
    al mostrar el mensaje.*/
    public static void diecinueveEjercicio() {
        System.out.println("digite un numero positivo");
        int numeroPositivo = sc.nextInt();
        int tamanoNumero;
        String numeroString;
        while (numeroPositivo <= 0) {
            System.out.println("digite un numero que sea mayo a 0");
            numeroPositivo = sc.nextInt();
        }
        numeroString = String.valueOf(numeroPositivo);
        tamanoNumero = numeroString.length();
        System.out.println("La cantidad de cifras que tiene el numero que digito es; " + tamanoNumero);
    }

    /* Pide un número por teclado e indica si es un número primo o no.
    Un número primo es aquel solo puede dividirse entre 1 y si mismo.
    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible
    desde ese numero hasta 1.
    NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.*/

    public static void veinteEjercicio() {
        System.out.println("digite el numero que quiere saber si es primo");
        int numero = sc.nextInt();
        int contador = 1;
        int i = 0;
        double resto;
        if (numero <= 1) {
            i = 2;
        }
        while (contador <= numero) {
            resto = numero % contador;
            if (resto == 0) {
                i++;
            }
            contador++;
        }
        if (i == 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

    /*Muestra los números primos entre 1 y 100.*/

    public static void ventiunoEjercicio() {

        for (int i = 0; i <= 100; i++) {
            int primo = 0;
            int contador = 1;
            double resto;
            while (contador <= i) {
                resto = i % contador;

                if (resto == 0) {
                    primo++;
                }
                contador++;

            }
            if (primo == 2) {
                System.out.println(i);
            }
        }

    }

    /* Del siguiente String «La lluvia en Sevilla es una maravilla»
    cuenta cuantas vocales hay en total (recorre el String con charAt).*/

    public static void ventidosEjercicio() {

        String frase = "La lluvia en Sevilla es una maravilla";
        int longitudFrase = frase.length();
        String vocales = "aeiou";
        int numeroVocales = 0;
        for (int i = 0; i < longitudFrase; i++) {
            for (int j = 0; j < 5; j++) {
                if (frase.charAt(i) == (vocales.charAt(j))) {
                    numeroVocales++;
                }
            }
        }
        System.out.println("la cantidad de vocales son: " + numeroVocales);
    }

    /* Reemplaza todas las a del String anterior por una e.*/

    public static void ventitresEjercicio() {
        String frase = "La lluvia en Sevilla es una maravilla";
        System.out.print(frase.replace('a', 'e'));
    }
}