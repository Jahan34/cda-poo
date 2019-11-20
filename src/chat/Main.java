package chat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Cat monChat = new Cat();
		monChat.name = sc.next();
		monChat.color = sc.next();
		monChat.getDescription();
		
		Cat tonChat = new Cat();
		tonChat.color = "bleu";
		tonChat.name = "Eud";
		tonChat.getDescription();
		
		Cat sonChat = new Cat();
		sonChat.getDescription();
		
		Cat saChatte = new Cat("Rosie", "Blanche");
		saChatte.getDescription();
		
		System.out.println();
		
		/// Scenario :
		monChat.sleep();
		tonChat.sleep();
	    String trophe = tonChat.hunt();
		System.out.println(tonChat.name + " a ramené ça : " + trophe);
		saChatte.eat(trophe);
		monChat.listen();

	}

}
