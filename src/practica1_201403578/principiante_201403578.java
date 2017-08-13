
package practica1_201403578;

import java.util.Scanner;

public class principiante_201403578 {
    
    int matriz_principiante[][]=new int[3][3];
    Scanner sc= new Scanner(System.in);
    boolean salir=true;
    
    public principiante_201403578(){
        
    }
    
    public void MenuPrincipiante(){
        char opc;
        
        while(salir){
        System.out.println("Ingresa la opción que desees realizar: ");
        System.out.println("V para Voltear la carta: ");
        System.out.println("R para Reiniciar: ");
        System.out.println("S para Salir");
        opc=sc.next().charAt(0);
        
        switch(opc){
            
            case 'V':{
                
            }break;
            
            case 'R':{
                
            }break;
            
            case 'S':{
                salir=false;
            }break;
            default: System.out.println("Esa opción no existe!!");
        }
        
        } 
    }

}
