package conversiones;

public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.69;
        
        //casteo a entero
        
        int numInt=(int)num; //pongo entre parentesis al tipo de dato al que lo voy a convertir y despues el nombre de la variable que voy a convertir
        
        //casteo a long
        
        Long numLong = (long) num;
        System.out.println("Double: " +num);
        System.out.println("Int: " +numInt);
        System.out.println("Long: " +numLong);
        
        System.out.println("----------------------");
        
        String cantidad= "15";
        String precio = "150.27";
        
        //Parseo a int
        int cantEntero = Integer.parseInt(cantidad);
        //Parseo a Double
        double precioDouble = Double.parseDouble(precio);
        System.out.println("El valor total de la compra es de: " +cantEntero*precioDouble);
        
        System.out.println("-----------------");
        
        int edad = 26;
        double estatura = 1.69;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Tu edad es de " +edadString+ " y tu estatura es de " +estaturaString);
        
        
    }
    
}
