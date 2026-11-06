

public class T1P3E2 {


    public static void main(String[] args) {
        // Array de 20 temperaturas entre -15 y 45 (lo pongo manual, me he liado un poco con el math.random :)
        //int[] temperaturas = {-10, -6, 10, 5, 6, 12, 23, 40, 45, 38, 22, 16, 18, 33, 38, 11, 31, 43, 39, 3};
        //---------------------------------------------------------------------------------------------------
        int[] temperaturas = new int[20];
        for (int i = 0; i < temperaturas.length; i++){
           
        }

        // mostrarlo separado por comas
        
        System.out.println("Mostrando arrays de temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = (int)(Math.random() * 50); 

            System.out.print(temperaturas[i]);
            if (i < temperaturas.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        // temp max y min 
        
        int max = temperaturas[0];
        int min = temperaturas[0];
        int diasMas30 = 0;
        int suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            if (temperaturas[i] > 30) {
                diasMas30++;
            }
            suma += temperaturas[i];
        }
        double media = (double) suma / temperaturas.length;
        
        // mostramos por pantalla 
        System.out.println();
        System.out.println("Temperatura maxima: " + max);
        System.out.println("Temperatura minima: " + min);
        System.out.println("Dias por encima de 30 grados: " + diasMas30);
        System.out.println("Temperatura media: " + media);
    }

}
