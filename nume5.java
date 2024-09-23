public class VerificarOrden {     
    public static void main(String[] args) {         
        int[] numeros = {1, 2, 3, 4, 5}; 
         
        // Ciclo para verificar si el arreglo está ordenado         
        for (int i = 0; i < numeros.length - 1; i++) {             
            if (numeros[i] > numeros[i + 1]) { 
                // Si encuentra un desorden, imprime y termina                 
                System.out.println("El arreglo no está ordenado.");                 
                return; 
            } 
        } 
        System.out.println("El arreglo está ordenado."); 
    } 
} 
