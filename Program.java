import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número de 1 a 10: ");
		int numero = sc.nextInt();
		
		if(numero <= 10 && numero >= 1) {
			
			System.out.println("A tabuada de " + numero + " é: ");
			for(int i = 1; i < 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));	
			}
		} else {
			System.out.println("Número invalido");
		
		}
			
		
		sc.close();
	}

}
