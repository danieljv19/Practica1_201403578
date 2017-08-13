package practica1_201403578;

import java.util.Scanner;

public class avanzado_201403578 {

    int matriz_avanzado[][] = new int[8][8];
    Scanner avan = new Scanner(System.in);
    boolean salir = true;

    public avanzado_201403578() {

    }

    public void MenuAvanzado() {

        char op;

        while (salir) {

            System.out.println("Ingresa la opción que desees realizar: ");
            System.out.println("V para Voltear la carta: ");
            System.out.println("R para Reiniciar: ");
            System.out.println("S para Salir");
            op = avan.next().charAt(0);

            switch (op) {

                case 'V': {

                }
                break;

                case 'R': {

                }
                break;

                case 'S': {

                    salir=false;
                }
                break;
                default:
                    System.out.println("Esa opción no existe!!");
            }

        }

    }

}
