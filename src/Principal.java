import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
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
								 + "Digite o nome e o cpf do Cliente\n");
				cliente.SetNome(sc.next());
				cliente.SetCpf(sc.next());
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
