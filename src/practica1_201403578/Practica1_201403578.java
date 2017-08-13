
package practica1_201403578;
import java.util.Scanner;
public class Practica1_201403578 {

    public static void main(String[] args) {

        int opcion=0;
        Scanner s = new Scanner(System.in);
        boolean salir=true;
        
        System.out.println("            Daniel Alejandro Jiménez Vásquez            ");
        System.out.println("                        201403578                       ");
        System.out.println("                    IPC1 A Practica 1                   ");
        System.out.println("                        BUSCAMINAS!!                    ");
        
        while(salir){
        System.out.println("Escoge el nivel!!");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Experto");
        System.out.println("4. Salir");
        opcion=s.nextInt();
        
        switch(opcion){
            case 1:{
                
                System.out.println("Bienvenido al nivel principiante");
                
                principiante_201403578 men=new principiante_201403578();
                men.MenuPrincipiante();
                
            }break;
            
            case 2:{
                
                System.out.println("Bienvenido al nivel intermedio!!");
                
                intermedio_201403578 intermedio = new intermedio_201403578();
                intermedio.MenuIntermedio();
                
            }break;
            
            case 3:{
                
            }break;
            
            case 4:{
                salir=false;
            }break;
            default: System.out.println("Esa opción no existe");
        }
        
    }
    }
    
}
