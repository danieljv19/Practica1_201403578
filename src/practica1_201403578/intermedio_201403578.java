package practica1_201403578;

import java.util.Random;
import java.util.Scanner;

public class intermedio_201403578 {

    private String matriz_intermedio[][];
    Scanner inter = new Scanner(System.in);
    boolean salir = true;
    private int aciertos = 0;

    Random ast = new Random();
    private boolean elegido[][];
    private int fila, columna;
    private TableroDeJuegoIntermedio_201403578 nuevo = new TableroDeJuegoIntermedio_201403578();


    public intermedio_201403578() {

        fila = 4;
        columna = 4;
        matriz_intermedio = new String[fila][columna];
        elegido = new boolean[fila][columna];


    }

    public void MenuIntermedio() {

        Scanner opinter = new Scanner(System.in);
        nuevo.llenarTablero();
        nuevo.mostrarTablero();
        int fila, columna;
        int aciertos = 0;
        int objetivo_intermedio = nuevo.cantidadCasillerosSinMinas();
        boolean salir = false;
        char opc;

        while (!salir) {
            System.out.println("Ingresa la opción que desees realizar: ");
            System.out.println("V para Voltear la carta: ");
            System.out.println("R para Reiniciar: ");
            System.out.println("S para Salir");
            opc = opinter.next().charAt(0);

            switch (opc) {

                case 'V': {

                    System.out.println("Ingresa fila: ");
                    fila = inter.nextInt();
                    System.out.println("Ingresa columna:");
                    columna = inter.nextInt();
                    System.out.println("La posición elegida es: " + fila + ", "+columna);
                    if (nuevo.voltearCasillero(fila, columna)) {
                        nuevo.mostrarTablero();
                        aciertos++;
                        System.out.println("aciertos: " + aciertos);
                        if (aciertos == objetivo_intermedio) {
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
