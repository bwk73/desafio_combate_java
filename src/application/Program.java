package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int life, attack, armor;
		Champion c1, c2;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		c1 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		c2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		int round = 0;
		while(round < n && c1.getLife() != 0 && c2.getLife() != 0) {
			
			round++;
			c1.takeDamage(c2);
			c2.takeDamage(c1);
			
			System.out.println();
			System.out.println("Resultado do turno " + round + ":");
			System.out.println(c1.status());
			System.out.println(c2.status());
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
