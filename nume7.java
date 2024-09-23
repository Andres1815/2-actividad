public class EncontrarPosicion {         
        public static void main(String[] args) {             
            int[] numeros = {1, 2, 3, 4, 5};             
            int elemento = 3;             
            int posicion = -1;             
            for (int i = 0; i < numeros.length; i++) {                 
                if (numeros[i] == elemento) {                     
                    posicion = i;                     
                    break; 
                } 
            } 
            System.out.println("La posición del elemento es: " + posicion); 
        } 
    }      
