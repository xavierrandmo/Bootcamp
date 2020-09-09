public class Main {
 public static void main (String[] args) {

 Personnage[] joueurs = new Personnage[10];

 for (int i=0; i<5; i++) {
 // les monstres:
  joueurs[i]   = new Monstre ("Monstre" +i, (int)(Math.random()*100));  
  joueurs[i+5] = new Sorcier ("Sorcier" +i, (int)(Math.random()*100));
 }

 // Affichage des personnages et de leurs points
 for (int i=0; i<10; i++) {
  System.out.println ( "le joueur numéros " + i + " est: " + joueurs[i]);
 }
 
 //Le jeu
 while (nombreMonstreVivant (joueurs) >0 && nombreVivant(joueurs) >1) {
  int A= (int)(Math.random()*9);
  int B= (int)(Math.random()*9);
  if (A!=B) {
 	System.out.println ( "\n" + joueurs[A].getNom() + "attaque" + joueurs[B].getNom());
	joueurs[A].attaque(joueurs[B]);
	
	System.out.println ("");
	for (int i=0; i<joueurs.length; i++) {
		System.out.println ("Après l'atatque: le joueur numéro" +i+ " est:" +joueurs[i]);
	}
  }
 }

 // Résultat du jeu
 if (nombreVivant(joueurs) - nombreMonstreVivant(joueurs) >=1) {
  System.out.println (" \n Les Soriciers ont gagnés!!!");
 }
 else {
  int vainqueur =0;
  for (int i=0; i<5; i++) {
 	if (!joueurs[i].mort()) {
		vainqueur =i;
	}
  }
  System.out.println( "Le gagnant est "+ joueurs[vainqueur].getNom());
 }
 
 }

 public static int nombreMonstreVivant (Personnage[] Tab) {
  int cpt=0;
  for (int i=0; i<5; i++) {
   if (Tab[i].getVie()>0)
	{cpt++;}
  }
  return cpt;
 }

 public static int nombreVivant (Personnage[] Tab) {
  int cpt=0;
  for (int i=0; i<10; i++) {
   if (Tab[i].getVie()>0)
	{cpt++;}
  }
  return cpt;
 }


}
