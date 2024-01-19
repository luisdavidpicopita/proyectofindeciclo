package proyectomediociclomatrices;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PROYECTOMEDIOCICLOMATRICES {

    //AUTOR: PICO PITA LUIS DAVID
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        do {
            try {
                int op;
                do {
                    System.out.println("=======================MENÚ=======================");
                    System.out.println("1. Imprimir matrices");
                    System.out.println("0. Salir");
                    System.out.print("Ingrese una opción: ");
                    op = sc.nextInt();
                    System.out.println("==================================================");
                    switch (op) {
                        case 1:
                            System.out.print("###Ingrese las dimensiones de la matriz MxM: ");
                            try {
                                int dimensión = sc.nextInt();
                                String m[][] = new String[dimensión][dimensión];
                                Matriz matriz = new Matriz();
                                matriz.insertar(m, dimensión);
                                matriz.mostrar_a(m, dimensión);
                                matriz.mostrar_b(m, dimensión);
                            } catch (NegativeArraySizeException n) {
                                System.out.println("==================================================");
                                System.out.println("¡¡¡INGRESE UN NÚMERO ENTERO POSITIVO!!!");
                            }
                            break;
                        case 0:
                            System.out.println("¡¡¡SE SALIÓ DEL PROGRAMA!!!");
                            break;
                        default:
                            System.out.println("¡¡¡INGRESE 1 o 0!!!");
                            break;
                    }
                } while (op != 0);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("==================================================");
                System.out.println("¡¡¡INGRESE UN NÚMERO ENTERO!!!");
                sc.next();
            }
        } while (error);
    }
}
