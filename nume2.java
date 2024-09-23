import java.util.Arrays; 
  
    public class SegundoMayor { 
                public static void main(String[] args) {             
                    int[] numeros = {1, 2, 3, 4, 5};             
                    Arrays.sort(numeros); 
            int segundoMayor = numeros[numeros.length - 2]; 
            System.out.println("El segundo elemento más grande es: " + segundoMayor); 
        } 
    } 
