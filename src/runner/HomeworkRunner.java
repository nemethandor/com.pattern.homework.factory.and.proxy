package runner;

import java.util.Scanner;

import com.pattern.homework.heroes.HeroFactory;
import com.pattern.homework.heroes.ProxyHero;

import interfaces.HeroInfoInterface;
import interfaces.HeroInterface;

public class HomeworkRunner {

	public static void main(String[] args) {

		boolean exit = false;
		boolean validInput;
		String previousInput = "Batman";
		HeroInterface heroInfo = new ProxyHero("Batman");

		do {
			try {

				System.out.println("\nChoose a hero by typing a number:\n" + "1 - Batman \n" + "2 - Spider-man \n"
						+ "3 - Flash \n" + "4 - Pumped Gabó\n" + "0 - EXIT");

				Scanner scanner = new Scanner(System.in);
				String input = scanner.next();
				validInput = false;

				switch (input) {
				case "0":
					System.out.println("Good Bye!");
					exit = true;
					scanner.close();
					break;
				case "1":
					input = "Batman";
					validInput = true;
					break;
				case "2":
					input = "Spiderman";
					validInput = true;
					break;
				case "3":
					input = "Flash";
					validInput = true;
					break;
				case "4":
					input = "Pumped";
					validInput = true;
					break;
				default:
					System.out.println("Invalid input");
				}

				if (validInput == true) {
					HeroFactory heroFactory = new HeroFactory();
					HeroInfoInterface hero = heroFactory.showHero(input);
					if (isEqual(previousInput,input)) {
						hero.introduceHero(heroInfo.getHero());	
					}else {
						heroInfo=giveProxy(input);
						hero.introduceHero(heroInfo.getHero());
						previousInput=input;
					}
					

				}

			} catch (NumberFormatException ex) {
				System.out.println("Please give me a number.");
			}

		} while (exit == false);
		// HeroFactory heroFactory = new HeroFactory();
		//
		// HeroInfoInterface batman = heroFactory.showHero("Batman");
		// HeroInterface hero = new ProxyHero("Batman");
		// batman.introduceHero(hero.getHero());
		//
		//// ReadFromFile file = new ReadFromFile();
		//// System.out.println(file.readWithScanner("Batman"));
		////
		// HeroInfoInterface spriderman = heroFactory.showHero("Flash");
		// HeroInterface hero2 = new ProxyHero("Flash");
		// spriderman.introduceHero(hero2.getHero());

	}

	public static boolean isEqual(String input, String previousInput) {
		return input == previousInput;
	}
	
	public static HeroInterface giveProxy(String input) {
		HeroInterface heroInfo = new ProxyHero(input);
		return heroInfo;
	}

}
