package practica1_201403578;

public class Casillero_201403578 {

    private int fila;
    private int columna;
    private int numero;
    private boolean elegido;

    public Casillero_201403578() {
        numero = 0;
        fila = 0;
        columna = 0;
        elegido = false;
    }

    public Casillero_201403578(int fila, int columna, int numero) {
        this.fila = fila;
        this.columna = columna;
        this.numero = numero;
        this.elegido = false;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isElegido() {
        return elegido;
    }

    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
