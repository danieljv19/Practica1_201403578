//
package practica1_201403578;

public class TableroDeJuegoIntermedio_201403578 {
    
    private String tablero_intermedio[][];
    private int minas[][];
    private boolean elegido[][];
    private int fila;
    private int columna;

    public TableroDeJuegoIntermedio_201403578() {
        fila = 6;
        columna = 6;
        tablero_intermedio = new String[fila][columna];
        minas = new int[fila][columna];
        elegido = new boolean[fila][columna];
       for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                elegido[i][j] = false;
            }
        }
       
    }

    public int lanzarDado() {
        int numero = 0;
        do {
            numero = (int) (Math.random() * 10);
        } while (numero < 1 || numero > 5);
        return numero;
    }

    

    public void mostrarNumeroAleatorios() {
        for (int i = 0; i < 10; i++) {
            System.out.println("numero:" + lanzarDado());
        }
    }

    public void generarMinas() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (lanzarDado() % 2 == 0) {
                    minas[i][j] = 1;
                }
            }
        }
    }
    public int cantidadCasillerosSinMinas(){
        int contador=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(!tablero_intermedio[i][j].equals("*")){
                    contador++;
                }
            }
        }
        return contador;
    }

    public void limpiarMinas() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                minas[i][j] = 0;
            }
        }
    }

    public void llenarTablero() {
        generarMinas();
        int numMinasAlrededor = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (minas[i][j] == 1) {
                    tablero_intermedio[i][j] = "*";
                } else {
                    if (i == 0 || i == 5) {
                        if (i == 0) {
                            if (j == 0 || j == 5) {
                                if (j == 0) {


                                    tablero_intermedio[i][j] = "" + (minas[i][j] + minas[i][j + 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                                }
                                if (j == 5) {

                                    tablero_intermedio[i][j] = "" + (minas[i][j - 1] + minas[i][j] + minas[i + 1][j - 1] + minas[i + 1][j]);
                                }
                            } else {

                                tablero_intermedio[i][j] = "" + (minas[i][j - 1] + minas[i][j] + minas[i][j + 1] + minas[i + 1][j - 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                            }
                        }
                        if (i == 5) {
                            if (j == 0 || j == 5) {
                                if (j == 0) {
                                    tablero_intermedio[i][j] = "" + (minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j] + minas[i][j + 1]);
                                }
                                if (j == 5) {

                                    tablero_intermedio[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i][j - 1] + minas[i][j]);
                                }
                            } else {

                                tablero_intermedio[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j - 1] + minas[i][j] + minas[i][j + 1]);
                            }
                        }
                    } else {
                        if (j == 0 || j == 5) {
                            if (j == 0) {
                                tablero_intermedio[i][j] = "" + (minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j] + minas[i][j + 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                            }
                            if (j == 5) {

                                tablero_intermedio[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i][j - 1] + minas[i][j] + minas[i + 1][j - 1] + minas[i + 1][j]);
                            }
                        } else {
                            tablero_intermedio[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j - 1] + minas[i][j] + minas[i][j + 1] + minas[i + 1][j - 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                        }
                    }
                }
            }
        }
    }

    public void mostrarTablero() {
        //llenarTablero();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
               if (elegido[i][j]==false) {
                    if (j == 5) {
                        System.out.println(" [" + tablero_intermedio[i][j] + "]");
                    } else {
                        System.out.print(" [" + tablero_intermedio[i][j] + "]");
                    }
                } else {
                   if (j == 5) {
                       System.out.println(" [ ]");
                    } else {
                        System.out.print(" [ ]");
                    }
                }
            }
        }
    }
    

  public boolean voltearCasillero(int fila, int columna) {
        boolean continuar=false;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (i == fila && j == columna) {
                    if(tablero_intermedio[i][j].equals("*")){
                            continuar=false;
                    }else{
                        elegido[i][j] = true;
                        continuar=true;
                    }
                }
            }
        }
        return continuar;
    }
    
}
