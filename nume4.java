import java.util.HashSet; 
  
    public class EliminarDuplicados {         
        public static void main(String[] args) { 
            String[] cadenas = {"a", "b", "a", "c", "b"}; 
            HashSet<String> set = new HashSet<>(Arrays.asList(cadenas)); 
            String[] sinDuplicados = set.toArray(new String[0]); 
            System.out.println("Arreglo sin duplicados: " + Arrays.toString(sinDuplicados)); 
        } 
    } 
