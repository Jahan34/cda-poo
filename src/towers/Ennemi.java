package towers;

import java.util.Scanner;

public class Ennemi {

	 private int pv = 0;
	private int rapid = 0;
	private float posX = 0;
	private float posY = 0;
	static int compteur;
	
	
	
	
	public Ennemi() {
		compteur++;
		this.pv = 100;
		this.posX = 0;
		this.posY = 0;
		this.rapid = 2;
		System.out.println("encore un autre ennemi");
	}

	public Ennemi(int pPv, int pRapid) {
		System.out.println("encore un méchant");
		compteur++;
		this.pv = pPv;
		this.rapid = pRapid;

	}

	public void affiche() {
		System.out.println(
				" PV : " + this.pv + " Rapidité : " + this.rapid + " posX : " + this.posX + " posY : " + this.posY);

	}
//encapsulation
	public int getPv() {
		return this.pv;
	}
	
	public void setPv(int nouvelleValeur) {
		
		if (nouvelleValeur > 1000 || nouvelleValeur < 0) {
			this.pv = 0;
		}else {
			
			this.pv = nouvelleValeur;
		}
}

	public int getRapid() {
		return this.rapid;
	}
	
	public void setRapid(int nouvelleRapid) {
		if (nouvelleRapid > 100 || nouvelleRapid < 1) {
			this.rapid = 1;
		} else {
			this.rapid = nouvelleRapid;
		}
	}
	
	public float getPosY() {
		return this.posY;
	}
	
	public void setPosY(float nouvellePosY) {
		if (nouvellePosY > 100 || nouvellePosY < 0) {
			this.posY = 0;
		} else {
			this.posY = nouvellePosY;
		}
	}
	
	public float getPosX() {
		return this.posX;
	}
	
	public void setPosX(float nouvellePosX) {
		if (nouvellePosX > 100 || nouvellePosX < 0) {
			this.posX = 0;
		} else {
			this.posX = nouvellePosX;
		}
	}
	
	
	
	
	public void recevoirDegats(int pDeg) {
		this.pv -= pDeg;
		System.out.println("bim dans la gueule il a prit : " + pDeg);
	}

	public void seDeplace(float pNouveauX, float pNouveauY) {
		this.posX = pNouveauX;
		this.posY = pNouveauY;
		System.out.println("il se deplace là  X: " + pNouveauX + " il se deplace là Y : " + pNouveauY);
	}

	public boolean estVivant() {
		boolean flag=false;
		if (this.pv <= 0) {
		flag=true;}
		return flag;
	}
	public String toString() {
		return " PV : " + this.pv + " Rapidité : " + this.rapid + " posX : " + this.posX + " posY : " + this.posY;
	}

	public static Ennemi saisirUnEnnemi(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez créer votre Ennemi ");
		Ennemi userEnnemi = new Ennemi();
		System.out.println("Combien de pv ? : ");
		int pvuser=sc.nextInt();
		userEnnemi.pv=pvuser;
		System.out.println("Sa rapidité ? : ");
		int rapiduser=sc.nextInt();
		userEnnemi.rapid=rapiduser;
		return userEnnemi;
		
	}
}
