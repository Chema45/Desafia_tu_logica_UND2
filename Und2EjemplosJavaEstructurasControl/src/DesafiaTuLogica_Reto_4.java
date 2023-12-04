import java.util.Scanner;

public class DesafiaTuLogica_Reto_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Introduce tres numeros enteros diferentes y elige una opción.");
				
		System.out.println("Introduce el primer número");
		
		n1=sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		
		n2=sc.nextInt();
		
		System.out.println("Introduce el tercer número");
		
		n3=sc.nextInt();
		
		System.out.println("Elige la opción 1 para ver los numeros en orden ascendente, elige la opción 2 para ver los numeros en orden descendente.");
		
		int numero;
		numero=sc.nextInt();
		
		
		switch (numero){
		case 1:
		
			if ((n1>n2)&&(n2>n3)){
				
				System.out.println("En orden ascendentere sería " + (n3) +"," + (n2) +"," + (n1) +".");
			
			}else if ((n1>n3)&&(n3>n2)){
				
				System.out.println("En orden ascendentere sería " + (n2) +"," + (n3) +"," + (n1) +".");
				
			}else if ((n2>n1)&&(n1>n3)){
				
				System.out.println("En orden ascendentere sería " + (n3) +"," + (n1) +"," + (n2) +".");
				
			}else if ((n2>n3)&&(n3>n1)) {
				
				System.out.println("En orden ascendentere sería " + (n1) +"," + (n3) +"," + (n2) +".");
			
			}else if ((n3>n1)&&(n1>n2)) {
				
				System.out.println("En orden ascendentere sería " + (n2) +"," + (n1) +"," + (n3) +".");
			
			}else if ((n3>n2)&&(n2>n1)) {
				
				System.out.println("En orden ascendentere sería " + (n1) +"," + (n2) +"," + (n3) +".");
				
			}else {
				System.out.println("Hay numeros iguales, intentalo en otra ocasión.");
				
			}break;
			
			
		case 2:
			
			if ((n1>n2)&&(n2>n3)){
				
				System.out.println("En orden descendente sería " + (n1) +"," + (n2) +"," + (n3) +".");
			
			}else if ((n1>n3)&&(n3>n2)){
				
				System.out.println("En orden descendente sería " + (n1) +"," + (n3) +"," + (n2) +".");
				
			}else if ((n2>n1)&&(n1>n3)){
				
				System.out.println("En orden descendente sería " + (n2) +"," + (n1) +"," + (n3) +".");
				
			}else if ((n2>n3)&&(n3>n1)) {
				
				System.out.println("En orden descendente sería " + (n2) +"," + (n3) +"," + (n1) +".");
			
			}else if ((n3>n1)&&(n1>n2)) {
				
				System.out.println("En orden descendente sería " + (n3) +"," + (n1) +"," + (n2) +".");
			
			}else if ((n3>n2)&&(n2>n1)) {
				
				System.out.println("En orden descendente sería " + (n3) +"," + (n2) +"," + (n1) +".");
				
			}else{
				
				System.out.println("Hay numeros iguales, intentalo en otra ocasión.");
				
			}break;
			
		default:
			System.out.println("Opciòn incorrecta, hasta pronto.");
		}
		
		sc.close();
	}
}
