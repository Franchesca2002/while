package estructuraWhile;

public class whileClase1 {

	public static void main(String[] args) {
		int numero =6;
		int factorial =5;
		int i = 2; 
		
		while (i <= numero) {
			factorial *= i;
			i++;
		}
		
       System.out.println("El factorial de " + numero + " es: " + factorial);
	}

}
