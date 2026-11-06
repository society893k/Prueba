import java.util.Scanner;


public class T1P3E1 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       // Array de 10 numeros aleatorios entre 5 y el 50
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 50); 
        }
        System.out.println("Array de valores creado: ");
        
       // Pedimos numero entre el 5 y el 50 

        int numero;
        do {
            System.out.print("Introduzca un tamano entre 5 y 50: ");
            numero = teclado.nextInt();
            if (numero < 5 || numero > 50) {
                System.out.println("ERROR. El numero introducido no esta en el rango indicado.");
            }
        } while (numero < 5 || numero > 50);
        
        int posicion = -1;
        for (int i = 0; i < numeros.length && posicion == -1; i++) {
            if (numeros[i] == numero) {
                posicion = i + 1;
            }
        }
       // Aqui buscamos la 1 posicion
         
            for (int i = 0; i < numeros.length && posicion == -1; i++) {
                if (numeros[i] == numero) {
                    posicion = i + 1;
                }
            }
            System.out.println();
        if (posicion != -1) {
            System.out.println("El numero " + numero + " ESTA EN EL ARRAY y su primera posicion es la " + posicion);
        } else {
            System.out.println("El numero " + numero + " NO ESTA EN EL ARRAY");
        }

        // Mostramos en horizontal el array separado por un espacio " " 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
    }
}
