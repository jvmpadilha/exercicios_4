import java.util.Scanner;
import java.util.Random;
public class Main {
	static Scanner console = new Scanner(System.in);
	static Random sorteador = new Random();
	
	static final byte[][] REGRAS_DO_JOGO = {
			{0, -1, 1, 1, -1},
			{1, 0, -1, -1, 1},
			{-1, 1, 0, 1, -1},
			{-1, 1, -1, 0, 1},
			{1, -1, 1, -1, 0}
			
	};
	static final String opcoes[] = { "pedra", "papel", "tesoura", "lagarto", "spock"};
	
	static final byte GANHOU = 1;
	static final byte PERDEU = -1;
	static final byte EMPATE = 0;
	
	static int obterOpcaoDoComputador() {
		return sorteador.nextInt(REGRAS_DO_JOGO.length);
	}
	static int lerOpcaoDoJogador() {
		System.out.println("[0] pedra");
		System.out.println("[1] papel");
		System.out.println("[2] tesoura");
		System.out.println("[3] lagarto");
		System.out.println("[4] spock");
		System.out.println("opção: ");
		return console.nextInt();
	}
	
	static void jogar() {
		int jogador = lerOpcaoDoJogador();
		int computador = obterOpcaoDoComputador();
		
		System.out.printf("\njogador 1: %s ",opcoes[jogador]);
		System.out.printf("\ncomputador: %s ",opcoes[computador]);
		
		System.out.println("\n");
		
		if(REGRAS_DO_JOGO [jogador][computador] == GANHOU) {
			System.out.println("Parabens voce ganhou!");
		} else if (REGRAS_DO_JOGO [jogador][computador] == PERDEU) {
			System.out.println("Voce perdeu!");
		} else if (REGRAS_DO_JOGO [jogador][computador] == EMPATE) {
			System.out.println("O jogo Empatou!");
			
		}
	}
	static void menu() {
		System.out.println("---------Bem vindo ao jogo-----------");
		System.out.println("[1]Jogar ");
		System.out.println("[2]Sair ");
		System.out.println("opção:");
		int opcao = console.nextInt();
		
		switch(opcao) {
		case 1:
			jogar();
			menu();
			break;
		case 2:
		System.exit(0);
		break;
		default:
			menu();
			break;
		}
	}
	
	

	public static void main(String[] args) {
		menu();
		
		
		
		
				
		}
		
				
		}
