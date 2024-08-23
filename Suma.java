
public class Suma {
	public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }
        
        System.out.println("La suma de los elementos es: " + suma);
    }
}
