
public class DesafiaTuLogica_Reto_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int contador = 0;

        System.out.println("Los números múltiplos de 2 o 3 entre 1 y 100 son:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println("\n\nLa cantidad de números múltiplos de 2 o 3 entre 1 y 100 es: " + contador);
    }
}
	  
	 
