

import java.util.Scanner;
public class principal {
    
    


    
    public static void main(String[] args){
       
        principal objeto1 = new principal ();
         objeto1.menu();
      
    }
    
    
    public void EliminarEspc () {
    
    Scanner entrada = new Scanner(System.in);
        System.out.println ("Ingrese Cadena con espacios : " );
        String cadena = entrada.nextLine ();
        
        cadena = cadena.replaceAll ("\\s+","");
        
        System.out.println ("Cadena sin espacios : \n " +cadena+ "\nLongitud: "+cadena.length());

}

   private static void menu () {
    
    Scanner entrada = new Scanner(System.in);
        System.out.println ("-----PROGRAMA PARA ELIMINAR ESPACIOS EN UN CADENA DE TEXTO-----" );
        
        int opcion ;
        do {
        
        System.out.println (" <<<<<< MENU >>>>>>" );
        System.out.println (" 1. Iniciar la ejecución" ); 
        System.out.println (" 2. Salir del programa" );
        opcion = entrada.nextInt();
        
        if ( opcion == 1 || opcion == 2){
           
       switch (opcion){
           
           case 1:
               principal objeto1 = new principal ();
               objeto1.EliminarEspc();
               
               break ;
           case 2:
               System.out.println (" <<< Ha finalizado la ejecucion >>>" );
             break ;
             
       }
        }else {
            
            System.out.println ("!!!! Ingrese una opcion valida !!!!" );
        }
           
     }while( opcion != 2);
           
}

}
        
        







