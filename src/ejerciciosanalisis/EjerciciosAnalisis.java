/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosanalisis;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class EjerciciosAnalisis {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa tu fecha yyyy/MM/dd");
        String fechaNac=leer.next();
        System.out.println(fechaNac.indexOf(4));
        
//        int op = 0;
//        do {
//            System.out.println("Selecciona una opcion:\n"
//                    + "1.- stefy\n"
//                    + "2.- ruben\n"
//                    + "3.- alex\n"
//                    + "4.- adrian\n"
//                    + "5.- luis\n"
//                    + "6.- darwin\n"
//                    + "7.- calcular Edad\n"
//                    + "8.- Salir");
//            op = leer.nextInt();
//            switch (op) {
//                case 1:
//                    stefy();
//                    break;
//                case 2:
//                    ruben();
//                    break;
//                case 3:
//                    alex();
//                    break;
//                case 4:
//                    adrian();
//                    break;
//                case 5:
//                    luis();
//                    break;
//                case 6:
//                    darwin();
//                    break;
//                case 7:
//                    calcularEdad();
//                    break;
//
//            }
//        } while (op != 8);
    }

    public static void stefy() {
        System.out.println("Hola por favor ingresa dos numeros");
        int min;
        int acu = 0;
        int max;
        System.out.println("Ingresa el minimo");
        min = leer.nextInt();
        System.out.println("Ingresa el maximo");
        max = leer.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
                acu = acu + i;
            }
        }
        System.out.println("La suma es: " + acu);
    }

    public static void ruben() {
        // String op1="oso";
        String ad1 = null;
        System.out.println("Adivina el animal segun la pregunta:");
        System.out.println("Es gordo y le gusta la miel");
        ad1 = leer.next();
        if (ad1.equals("oso")) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }

    }

    public static void alex() {
        System.out.println("Ingresa el radio del circulo para\n"
                + "calcular su área");
        int radio = leer.nextInt();

        double area = Math.PI * Math.pow(((double) (radio)),2);
        System.out.println("EL area es: " + area);

    }

    public static void adrian() {
        System.out.println("Bienvenido al sistema de conversión de moneda");
        double peso = 3950.17;
        System.out.println("Cuanto dinero deseas cambiar:");
        double dolar = leer.nextDouble();
        double valor = 0;
        while (dolar > 0) {
            valor = dolar * peso;
            System.out.println("el monto en pesos es:" + valor);
            System.out.println("Ingresa el 0 para terminar");
            dolar = leer.nextDouble();
        }
    }

    public static void luis() {
        int i = 2;
        int y = i++ + i++ + i--;
        System.out.println(y);
        System.out.println(i);

    }

    public static void darwin() {
        System.out.println("Ingresa un numero:");
        int n = leer.nextInt();
        int acu = 1;
        for (int i = 1; i <= n; i++) {
            acu = acu * i;
        }
        System.out.println("el fac: " + acu);
    }
    
    public static void calcularEdad(){
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("la fecha de hoy es: "+LocalDate.now());
        LocalDate ahora=LocalDate.now();
        DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Ingresa la fecha dd/mm/año");
        String fecN=leer.next();
        LocalDate fechNaci= LocalDate.parse(fecN,fmt);
        System.out.println("La fecha de nacimiento es: "+fechNaci);
        
        Period periodo= Period.between(fechNaci, ahora);
        System.out.println("tu edad actual es: "+periodo.getYears()+" meses "+periodo.getMonths()+" dias "+periodo.getDays());
    }

}
