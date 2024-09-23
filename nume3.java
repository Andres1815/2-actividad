class ContarPares {
             public static void main(String[] args) {             
                int[] numeros = {1, 2, 3, 4, 5};             
                int contador = 0;             
                for (int num : numeros) {                 
                    if (num % 2 == 0) { contador++; 
                } 
            } 
            System.out.println("Cantidad de elementos pares: " + contador); 
        } 
