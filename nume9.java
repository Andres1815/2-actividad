import java.util.ArrayList; 
  
    public class EliminarImpares {         
        public static void main(String[] args) {             
            int[] numeros = {1, 2, 3, 4, 5}; 
            ArrayList<Integer> pares = new ArrayList<>();             
            for (int num : numeros) {                 
                if (num % 2 == 0) {                     
                    pares.add(num); 
                } 
            } 
            int[] sinImpares = pares.stream().mapToInt(i -> i).toArray(); 
            System.out.println("Arreglo sin impares: " + Arrays.toString(sinImpares)); 
        } 
    } 
