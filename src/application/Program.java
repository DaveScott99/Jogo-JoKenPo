package application;

import java.util.Scanner;

public class Program {

	// Placar
	private static int placarJogador = 0;
	private static int placarComputador = 0;
	
	private static int rodadas;
	
	//Escolhas
	// 1 - Pedra / 2 - Papel / 3 - Tesoura
	private static int escolhaJogador;
	private static int escolhaComputador;
	

	public static void main(String[] args) {
		
		// Método principal
		
		Scanner sc = new Scanner(System.in);
		
		int continuar = 1;
		
		rotuloInicio();
		
		do {
			jogo();
			System.out.println("Deseja jogar novamente? ");
			System.out.println("(1) SIM (2) NÃO");
			continuar = sc.nextInt();
		} while (continuar == 1);
		
		exibirPlacar();

		sc.close();
	}
	
	public static void rotuloInicio() {
		System.out.println("::: JOKENPO :::");
	}
	
	public static void jogo() {
		
		// Método para a lógica do jogo principal
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a quantidade de rodadas: ");
		rodadas = sc.nextInt();
		
		for (int i = 0; i < rodadas; i++) {
			
			escolhaCpu();
			rotuloEscolhaJogador();
			escolhaJogador = sc.nextInt();
			
			System.out.println();
			verificarResultado();
			System.out.println();
			
			
		}
	
	}
	
	public static void verificarResultado() {
		
		// Método para verificar o ganhador
		
		if (escolhaJogador == escolhaComputador) {
			System.out.println("EMPATE");
		}
		
		if (escolhaComputador == 1) {
			if (escolhaJogador == 2) {
				vitoriaJogador();
			}
			else if (escolhaJogador == 3) {
				vitoriaComputador();
			}
		} 
		else if (escolhaComputador == 2) {
			if (escolhaJogador == 1) {
				vitoriaComputador();
			}
			else if (escolhaJogador == 3) {
				vitoriaJogador();
			}
		}
		else if (escolhaComputador == 3) {
			if (escolhaJogador == 1) {
				vitoriaJogador();
			}
			else if (escolhaJogador == 2) {
				vitoriaComputador();
			}
		}
		
	}
	
	// Métodos para consolidar a vitória
	public static void vitoriaJogador() {
		System.out.println("VITÓRIA JOGADOR");
		placarJogador++;
	}
	
	public static void vitoriaComputador() {
		System.out.println("VITÓRIA COMPUTADOR");
		placarComputador++;
	}
	
	public static void exibirPlacar() {
		
		// Método para exibir o placar
		
		System.out.println();
		System.out.println("::: PLACAR DO JOGO :::");
		System.out.println("Jogador: " + placarJogador);
		System.out.println("Computador: " + placarComputador);
		
	}
	
	public static void escolhaCpu() {
		
		// Escolha do computador
		
		System.out.println();
		System.out.println("::: ESCOLHA COMPUTADOR :::");
		System.out.println("Estou escolhendo uma opção...");
		escolhaComputador = (int) (Math.random()* 3) + 1;
		System.out.println("Escolhi!!");
		
	}
	
	public static void rotuloEscolhaJogador() {
		
		// Escolha do jogador
		
		System.out.println();
		System.out.println("::: ESCOLHA JOGADOR :::");
		System.out.println("1 - Pedra\n2 - Papel\n3 - Tesoura");
		System.out.print("Escolha sua opção: ");
		
	}

}
