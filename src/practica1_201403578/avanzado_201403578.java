package practica1_201403578;

import java.util.Random;
import java.util.Scanner;

public class avanzado_201403578 {

    private String matriz_avanzado[][];
    int mostrar_matriz[][] = new int[8][8];
    Scanner sc = new Scanner(System.in);
    boolean salir = true;
    Random ast = new Random();
    private boolean elegido[][];
    private int filas, columnas;
    private TableroDeJuego_201403578 nuevo = new TableroDeJuego_201403578();

    public avanzado_201403578() {

        filas = 8;
        columnas = 8;
        matriz_avanzado = new String[filas][columnas];
        elegido = new boolean[filas][columnas];
    }

    public void MenuAvanzado() {

        Scanner opvor = new Scanner(System.in);
        nuevo.llenarTablero();
        nuevo.mostrarTablero();
        int fila, columna;
        int aciertos = 0;
        int objetivo = nuevo.cantidadCasillerosSinMinas();
        boolean salir = false;
        char opa;

        while (!salir) {

            System.out.println("Elige una posición: ");
            System.out.println("V. Voltear");
            System.out.println("R. Reiniciar");
            System.out.println("S. Salir");
            opa = opvor.next().charAt(0);

            switch (opa) {

                case 'V': {

                    System.out.println("Ingresa fila: ");
                    fila = sc.nextInt();
                    System.out.println("Ingresa columna:");
                    columna = sc.nextInt();
                    System.out.println("La posición elegida es: "+ fila + ", " + columna + "");
                    if (nuevo.voltearCasillero(fila, columna)) {
                        nuevo.mostrarTablero();
                        aciertos++;
                        System.out.println("aciertos: " + aciertos);
                        if (aciertos == objetivo) {
                            System.out.println("Felicidades Ganaste!!");
                            salir = true;
                        }
                    } else {
                        System.out.println("Lástima Perdiste!!");
                        salir = true;
                    }
                }

                break;

                case 'R': {

                    nuevo.mostrarTablero();
                }
                break;

                case 'S': {

                    salir = true;
                }
                break;
                default:
                    System.out.println("Esa opción no existe!!");
            }
        }

    }

}
