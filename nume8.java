public class ConcatenarArreglos {         
    public static void main(String[] args) { 
            String[] arreglo1 = {"a", "b", "c"}; 
            String[] arreglo2 = {"d", "e", "f"}; 
            String[] concatenado = new String[arreglo1.length + arreglo2.length]; 
            System.arraycopy(arreglo1, 0, concatenado, 0, arreglo1.length); 
            System.arraycopy(arreglo2, 0, concatenado, arreglo1.length, arreglo2.length);             
            System.out.println("Arreglo concatenado: " + Arrays.toString(concatenado)); 
        } 
    } 
