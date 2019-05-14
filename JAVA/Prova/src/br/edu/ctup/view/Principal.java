package br.edu.ctup.view;
import java.util.List;
import java.util.Scanner;
import br.edu.ctup.controller.ControllerCliente;
import br.edu.ctup.controller.ControllerIngresso;
import br.edu.ctup.model.Cliente;
import br.edu.ctup.model.Ingresso;
public class Principal {
	static Cliente cliente;
	static ControllerCliente controllerCliente = new ControllerCliente();
	static Scanner sc = new Scanner(System.in);
	static ControllerIngresso controllerIngresso = new ControllerIngresso();
	static Ingresso ingresso;
	static int op = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
		
	}
	public static void menu() {
		int op = -1;
		do {
		System.out.println("***MENU***");
		System.out.println("1-- CADASTRAR CLIENTE: ");
		System.out.println("2-- VIZUALIZAR CLIENTES CADASTRADOS: ");
		System.out.println("3-- BUSCAR CLIENTE POR CPF: ");
		System.out.println("4-- LOGAR: ");
		System.out.println("0 -- SAIR");
		op = sc.nextInt();
		switch (op) {
		case 1:
			cadCliente();
			break;
		case 2:
			clienteCad();
			break;
		case 3:
			busca();
			break;
		case 4:
			logar();
			break;
		case 0:
			op=0;
		default:
			break;
		}
		}while(op!=0);
	}
	
	public static void cadCliente() {
		cliente = new Cliente();
		System.out.println("Informe o NOME: ");
		String nome = sc.next();
		cliente.setNome(nome);
		System.out.println("Informe a SENHA: ");
		String senha = sc.next();
		cliente.setSenha(senha);
		System.out.println("Informe o CPF: ");
		String cpf = sc.next();
		cliente.setCpf(cpf);
		System.out.println("Informe o RG: ");
		String rg = sc.next();
		cliente.setRg(rg);
		int cadastro = controllerCliente.cadCliente(cliente);
		if(cadastro == 1) {
			System.out.println("**CADASTRADO COM SUCESSO**");
		}
		else {
			System.out.println("**CADASTRO NÃO EFETUADO** \n **CPF JÁ EXISTENTE**");
		}
	}
	
	public static void clienteCad() {
		System.out.println(controllerCliente.listar());
	}
	public static void busca() {
		System.out.println("Qual CPF deseja buscar? ");
		String cpf = sc.next();
		if(controllerCliente.busca(cpf)==null) {
			System.out.println("CPF não encontrado");
		}
		else {
			System.out.println(controllerCliente.busca(cpf).buscaCpf());
		}
		}
	
	public static void menuCompra() {
		int opcao = -1;
		do {
		System.out.println("1 -- CADASTRAR INGRESSO: ");
		System.out.println("2 -- COMPRAR INGRESSO: ");
		System.out.println("3 -- VIZUALIZAR INGRESSOS: ");
		System.out.println("0 -- SAIR: ");
		opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			cadastrarIngresso();
			break;
		case 2:
			comprarIngresso();
			break;
		case 3:
			visualizarIngresso();
			break;
		case 0:
			menu();
		default:
			break;
		}
		} while(opcao!=0);
		
	} 
	
	public static void logar() {
		
		System.out.println("iNFORME O CPF");
		String cpf = sc.next();
		System.out.println("INFORME A SENHA");
		String senha = sc.next();
		
		if(controllerCliente.autenticar(cpf, senha)) {
			System.out.println("**LOGADO COM SUCESSO**");
			menuCompra();
			
		}
		else {
			System.out.println("**FALHA**");
		}
	}
	public static void cadastrarIngresso() {
		ingresso = new Ingresso();
		System.out.println("Informe o nome do artista: ");
		String nomeArtista = sc.next();
		ingresso.setNomeArtista(nomeArtista);
		System.out.println("Informe a data: ");
		String data = sc.next();
		ingresso.setData(data);
		System.out.println("Informe a hora: ");
		String hora = sc.next();
		ingresso.setHora(hora);
		System.out.println("Informe o Preço do ingresso: ");
		Double preco = sc.nextDouble();
		ingresso.setPreco(preco);
		controllerIngresso.cadastrarIngresso(ingresso);
		
	}
	public static void visualizarIngresso() {
		System.out.println(controllerIngresso.listar());
	}
	
	public static void comprarIngresso() {
		List<Ingresso> compre = controllerIngresso.listar();
		for(int i =0 ; i <compre.size();i++) {
			System.out.println("\nCódigo do show: "+i);
			System.out.println("Nome do artista: "+compre.get(i).getNomeArtista());
			System.out.println("Hora do show: "+compre.get(i).getHora());
			System.out.println("Data do show: "+compre.get(i).getData());
			System.out.println("Preco do show: "+compre.get(i).getPreco());
			
		}
		
		System.out.println("Digite o código do show: ");
		int show = sc.nextInt();
		System.out.println("Se não tiver cartirinha do estudante digite 0 \n Se tiver digite o numero da carteirinha: ");
		long carteirinha = sc.nextLong();
		System.out.println("Preço final: R$"+controllerIngresso.finalizarCompra(show, carteirinha));
	}
	

}
















