public class MediaArreglo {         
    public static void main(String[] args) {             
        int[] numeros = {2, 4, 6, 8, 10};             
        int suma = 0;             
        for (int num : numeros) {          
            suma += num; 
            } 
            double media = (double) suma / numeros.length; 
            System.out.println("La media es: " + media); 
        } 
    } 
