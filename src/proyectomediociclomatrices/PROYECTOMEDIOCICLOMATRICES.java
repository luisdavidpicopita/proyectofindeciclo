/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectomediociclomatrices;

import java.util.Scanner;

/**
 *
 * @author pik0h
 */
public class PROYECTOMEDIOCICLOMATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ESCANER
        Scanner sc = new Scanner(System.in);

        //VARIABLE DE MATRIZ MxM
        int dimensión;

        //PROGRAMA DE MATRIZ MxM
        int op;
        do {
            System.out.println("\n===================MENÚ===================");
            System.out.println("1. Imprimir matrices");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            op = sc.nextInt();
            System.out.println("==========================================");
            switch (op) {
                case 1:
                    System.out.print("###Ingrese las dimensiones de la matriz MxM: ");
                    dimensión = sc.nextInt();
                    String m[][] = new String[dimensión][dimensión];
                    Matriz matriz = new Matriz();
                    matriz.insertar(m, dimensión);
                    System.out.println("\n");
                    matriz.mostrar_a(m, dimensión);
                    System.out.println("\n");
                    matriz.mostrar_b(m, dimensión);
                    break;
            }
        } while (op != 0);
        System.out.println("¡¡¡SE SALIÓ DEL PROGRAMA!!!");
    }

}
