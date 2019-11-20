package towers;

public class Terrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ennemi leVraiGrosEnnemi = new Ennemi(500,1);
		
		 
		 Ennemi lePetitRapide= new Ennemi(200,10);
		
		 
		 Ennemi unAutremechant= new Ennemi();
		
		 lePetitRapide.affiche();
		 lePetitRapide.recevoirDegats(200);
		 
		 lePetitRapide.affiche();
		 lePetitRapide.seDeplace(12,23);
		 lePetitRapide.affiche();
		 lePetitRapide.estVivant();
		 System.out.println(lePetitRapide);
		 System.out.println("Nombre d'ennemi : " + Ennemi.compteur);
		 Ennemi jpEnnemi= Ennemi.saisirUnEnnemi();
		 jpEnnemi.affiche();
		 jpEnnemi.setPv(1001);
		 System.out.println(jpEnnemi.getPv());
		 jpEnnemi.setRapid(500);
		 System.out.println(jpEnnemi.getRapid());
		 jpEnnemi.setPv(8000);
		 System.out.println(jpEnnemi.getPv());
		 
		 Ennemi monstre = Ennemi.saisirUnEnnemi();
		 monstre.setPv(900);
		 System.out.println(monstre.getPv());
}

}
