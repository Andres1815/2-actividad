public class MultiplicarElementos {         
        public static void main(String[] args) {             
            int[] numeros = {1, 2, 3, 4, 5};             
            int multiplicador = 2;             
            for (int i = 0; i < numeros.length; i++) {                 
                numeros[i] *= multiplicador; 
            } 
            System.out.println("Arreglo multiplicado: " + Arrays.toString(numeros)); 
        } 
    } 
