package practica1_201403578;

import java.util.Random;
import java.util.Scanner;

public class principiante_201403578 {

    private String matriz_principiante[][];
    int mostrar_matriz[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    boolean salir = true;
    Random ast = new Random();
    private boolean elegido[][];
    private int filas, columnas;
    private TableroDeJuego_201403578 nuevo = new TableroDeJuego_201403578();

    public principiante_201403578() {

        filas = 4;
        columnas = 4;
        matriz_principiante = new String[filas][columnas];
        elegido = new boolean[filas][columnas];
    }

    public void MenuPrincipiante() {

        Scanner opvor = new Scanner(System.in);
        nuevo.llenarTablero();
        nuevo.mostrarTablero();
        int fila = 0, columna = 0;
        int aciertos = 0;
        int objetivo = nuevo.cantidadCasillerosSinMinas();
        boolean salir = false;
        char volr;

        while (!salir) {

            System.out.println("Elige una posición: ");
            System.out.println("V. Voltear");
            System.out.println("R. Reiniciar");
            System.out.println("S. Salir");
            volr = opvor.next().charAt(0);
            
            switch (volr) {
                
                case 'V': {
                    
                    
                    System.out.println("Fila: ");
                    fila = sc.nextInt();
                    System.out.println("Columna:");
                    columna = sc.nextInt();

                    System.out.println("La posición elegida es:  "+fila+", "+columna );
                    if (nuevo.voltearCasillero(fila, columna)) {
                        nuevo.mostrarTablero();
                        aciertos++;
                        System.out.println("aciertos: " + aciertos);
                        if (aciertos == objetivo) {
                            System.out.println("Felicidades Ganaste!!");
                            salir = true;
                        }
                    } else {
                        System.out.println("Lastima perdiste!!");
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
