package or.tiago.bancopoli.banco3;

import java.util.Scanner;

public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void inicial(){
		int op = scan.nextInt();
		System.out.println("Operacoes:" +
							"[1] Criar Usuario" +
							"[2] Criar Conta" +
							"[3] Exibir Usuarios" +
							"[4] Consultar Saldo" +
							"[5] Operar valores");
		switch(op) {
			case 1:
				criarusuario();
			case 2:
				criarconta();
			case 3:
				allUsers();
			case 4:
				consultarSaldo();
			case 5:
				
		}
		
	}
	
	public static void criarusuario() {
			User usuario = new User();
			System.out.println("Novo usuário criado:");
			System.out.print("Nome: " + usuario.getNome() + "\n");
			System.out.print("CPF: " + usuario.getCpf() + "\n");
			inicial();
	}
	
	public static void criarconta() {
			System.out.println("Insira o CPF do titular da nova conta:");
			String cpf = scan.nextLine();
			
			User usuario = User.search(cpf);
			if(usuario == null) {
				System.out.println("Usuário não existente!");
				inicial();
			}
			
			int op = scan.nextInt();
			
			System.out.println("Qual tipo de conta criar?" +
					"[1] Conta Corrente" +
					"[2] Conta Poupanca" +
					"[3] Conta Investimento" +
					"[4] Voltar para menu inicial");
			switch(op) {
				case 1:
					new ContaCorrente(usuario);
					inicial();
				case 2:
					new ContaPoupanca(usuario);
					inicial();
				case 3:
					new ContaInvestimento(usuario);
					inicial();
			}
	}
	public static void allUsers() {
		for(User user : User.users) {
			System.out.println("***********************" +
								user.getNome() +
								user.getCpf() +
								"***********************");
		}
		
		
	}
	
	public static void consultarSaldo() {
		System.out.println("Insira o numero da conta:");
		
		String numero = scan.nextLine();
		
		Conta conta = Conta.search(numero);
		
		if(conta == null) {
			System.out.println("Conta não existente!");
			inicial();
		}
		
		System.out.println("***********************" +
							conta.getTitular() +
							conta.getSaldo() +
							"***********************");
		
	}
	public static void operarContas() {
		System.out.println("Insira o numero da conta:");
		String numero = scan.nextLine();
		
		Conta conta = Conta.search(numero);
		
		if(conta == null) {
			System.out.println("Conta não existente!");
			inicial();
		}
		
		System.out.println("Operacoes:" +
				"[1] Transferir dinheiro" +
				"[2] Render investimento" +
				"[3] Depositar dinheiro" +
				"[4] Retirar dinheiro");
		
		int op = scan.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("Insira um valor:");
				float valor = scan.nextFloat();
				System.out.println("Insira o numero da conta a receber:");
				numero = scan.nextLine();
				Conta conta2 = Conta.search(numero);
				if(conta2 != null) {
					conta.transferir(conta2, valor);
				}
				inicial();
				
			case 2:
				if(conta.tipo != AccTipo.INVESTIMENTO) {
					System.out.println("Esta não é uma conta de investimento!");
					operarContas();
				}
			case 3:
				System.out.println("Insira um valor:");
				valor = scan.nextFloat();
				conta.depositar(valor);
				inicial();
				
			case 4:
				System.out.println("Insira um valor:");
				valor = scan.nextFloat();
				conta.sacar(valor);
				inicial();
		}
	}
}