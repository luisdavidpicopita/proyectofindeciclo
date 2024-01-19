/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomediociclomatrices;

/**
 *
 * @author pik0h
 */
public class Matriz {

    //COSTRUCTOR
    public Matriz() {
    }

    //INGRESA 
    public void insertar(String matriz[][], int dimensión) {
        for (int i = 0; i < dimensión; i++) {
            for (int j = 0; j < dimensión; j++) {
                matriz[i][j] = "* ";
            }
        }
    }

    //MOSTRAR A
    public void mostrar_a(String matriz[][], int dimensión) {
        System.out.println("a)");
        for (int i = 0; i < dimensión; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    //MOSTRAR B
    public void mostrar_b(String matriz[][], int dimensión) {
        System.out.println("b)");
        for (int i = dimensión - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
