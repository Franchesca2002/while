package estructuraWhile;


public class whileClase3 {

	public static void main(String[] args) {
		int numeroPrincipal = 12345;
		int contador = 0;
		
		while (numeroPrincipal !=0) {
			
			numeroPrincipal /=10;
			contador++;
		}
		
		System.out.println("El numero tiene"+ contador + "digitos");

	}

}
