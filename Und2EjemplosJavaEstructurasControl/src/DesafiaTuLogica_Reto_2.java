import java.util.Scanner;

public class DesafiaTuLogica_Reto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		
		int numero;

		do{
			System.out.println("Introduce un numero positivo y te mostraré sus 20 numeros sucesivos");
			numero=sc.nextInt();
			
		}while(numero<=0);

		
		for (int i=1; i<=20; i++) {
			
			System.out.print((numero + i) + ", ");
		}
		sc.close();
	}
}

