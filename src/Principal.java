import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		
		do {
			System.out.println(" -- SISTEMA DE VENDAS -- \n"
							 + "1 - Cadastrar Cliente\n"
							 + "2 - Listar Clientes\n"
							 + "0 - Sair\n"
							 + "Digite a opção desejada\n");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR CLIENTE --!\n"
								 + "Digite o nome do Cliente\n");
				cliente.setNome(sc.next());
				
				System.out.println("\nDigite o cpf do cliente\n");
				cliente.setCpf(sc.next());
				clientes.add(cliente);
				break;
			case 2:
				
				System.out.println("\n-- LISTAR CLIENTES --\n");
				break;
			case 0:
				System.out.println("\nSaindo!");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while(opcao != 0);
	}

}
