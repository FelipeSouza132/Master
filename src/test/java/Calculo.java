import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Operacoes o = new Operacoes();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos iniciar a Soma");
		
		System.out.println("Digite o 1° valor:");
		int v1 = scanner.nextInt();
		System.out.println("Digite o 2° valor:");
		int v2 = scanner.nextInt();
			
		o.soma(v1, v2);
		
		System.out.println("Vamos iniciar a Divisao");
				
		System.out.println("Digite o 1° valor:");
		int v3 = scanner.nextInt();
		System.out.println("Digite o 2° valor:");
		int v4 = scanner.nextInt();		
		
		
		o.divisao(v3, v4);
		
		System.out.println("Vamos iniciar a Multiplicacao");
		
		System.out.println("Digite o 1° valor:");
		int v5 = scanner.nextInt();
		System.out.println("Digite o 2° valor:");
		int v6 = scanner.nextInt();	
		
		o.multiplicacao(v5, v6);
		
        System.out.println("Vamos iniciar a Subtracao");
		
		System.out.println("Digite o 1° valor:");
		int v7 = scanner.nextInt();
		System.out.println("Digite o 2° valor:");
		int v8 = scanner.nextInt();	
		
		o.subtracao(v7, v8);

	}

}
