package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
       /*try {
           int resultado = 3/0;
       }
       
       catch(Exception e){
           System.out.println("No se puede dividir por 0!!!!!!");
       } */
       
       
       try {
           int edades[]= {15, 12, 23, 30};
           System.out.println("La edad de la posicion 4 es de " +edades[4]);
       }
       
       catch (Exception e){
           System.out.println("Ese indice de vector no existe");
       }  
    }
}
