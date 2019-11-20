package chat;



public class Cat {
	String color;
	String name;
	Boolean happy=true;
	Boolean feed=true;
	int energy=5;
	
	
	
	
	/**
	 * Constructeur sans param�tre
	 */
	public Cat() {
		System.out.println("Naissance d'un nouveau chat");
		this.name = "Arthur";
		this.color = "Gris";
	}
	
	/**
	 * Constructeur avec param�tre
	 * @param pName
	 * @param pColor
	 */
	public Cat(String pName, String pColor) {
		System.out.println("Naissance d'un nouveau chat");
		this.name = pName;
		this.color = pColor;
	}
	
	/**
	 * Permet d'afficher une description du chat
	 */
	public void getDescription() {
		System.out.println("Le chat " + this.color + " s'appelle " + this.name);
		if (happy==true) {
			System.out.println(this.name+"est heureux");
		
		}else {
			System.out.println(this.name+"est triste");
		}
		if (energy<2) {
			System.out.println(this.name+" est fatigu�");
		}else {
			System.out.println(this.name+" est en forme");
		}
	}
	
	
	/**
	 * m�thode qui permet d'�couter le chat
	 */
	public void listen() {
		System.out.println("Miaouuuuuu");
	}
	
	/**
	 * m�thode qui permet de nourrir le chat
	 * @param food
	 */
	public void eat(String food) {
		System.out.println(this.name + " mange " + food);
		this.happy=true;
	}
	
	/**
	 * M�thode qui permet d'envoyer le chat � la chasse
	 * @return
	 */
	public String hunt() {
		System.out.println(this.name + " part � la chasse ");
		String[] chasse = {"souris", "oiseau", "chaussette"};
		int n = (int)(Math.random() * 3);
		this.energy--;
		return chasse[n];
	} 
	
	public void sleep() {
		System.out.println(this.name + " dort");
		this.happy=false;
		this.energy++;
	}
}