package hospital;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			Fila fila = new Fila();
			
			while(true) {
				System.out.println("Menu:");
				System.out.println("1 ) Adicionar Paciente");
				System.out.println("2 ) Numero de pacientes na fila");
				System.out.println("3 ) Sair");
				
				int opcaoMenu = scn.nextInt();
				
				if (opcaoMenu == 1) {
					System.out.println("Digite o nome do paciente:");
					String nome = scn.next();
					System.out.println("Digite o cpf:");
					String cpf = scn.next();
					System.out.println("Digite a prioridade:");
					int prioridade = scn.nextInt();
					fila.criarSenha(nome, cpf, prioridade);
				}
				if (opcaoMenu == 2) {
					System.out.println("Numeros de pacientes na fila:");
					fila.totalPacientesNaFila();
				}
				if (opcaoMenu == 3) {
					System.out.println("Saindo...");
					break;
				}
			}
		}
		
		
	}

}
