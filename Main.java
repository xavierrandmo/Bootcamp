public class Main {
    public static void main(String[] args) {
        Personnage [] tableJeu = new Personnage[10];
        tableJeu[0] = new Monstre("M0", (int) Math.random()*100);
        tableJeu[1] = new Monstre("M1", (int) Math.random()*100);
        tableJeu[2] = new Monstre("M2", (int) Math.random()*100);
        tableJeu[3] = new Monstre("M3", (int) Math.random()*100);
        tableJeu[4] = new Monstre("M4", (int) Math.random()*100);
        tableJeu[5] = new Sorcier("S0", (int) Math.random()*100);
        tableJeu[6] = new Sorcier("S1", (int) Math.random()*100);
        tableJeu[7] = new Sorcier("S2", (int) Math.random()*100);
        tableJeu[8] = new Sorcier("S3", (int) Math.random()*100);
        tableJeu[9] = new Sorcier("S4", (int) Math.random()*100);

        // Affiche tous les joueurs
        for (int i=0; i<10; i++) {
            System.out.println ( "le joueur numéros " + i + " est: " + tableJeu[i]);
        }
        while (nombreMonstreVivant (tableJeu) >0 && nombreVivant(tableJeu) >1) {
            int A= (int)(Math.random()*9);
            int B= (int)(Math.random()*9);
            if (A!=B) {
                System.out.println ( "\n" + tableJeu[A].getNom() + "attaque" + tableJeu[B].getNom());
                tableJeu[A].attaque(tableJeu[B]);
              
                System.out.println ("");
                for (int i=0; i<tableJeu.length; i++) {
                    System.out.println ("Après l'atatque: le joueur numéro" +i+ " est:" +tableJeu[i]);
                }
            }
        }
          
        // Résultat du jeu
        if (nombreVivant(tableJeu) - nombreMonstreVivant(tableJeu) >=1) {
            System.out.println (" \n Les Soriciers ont gagnés!!!");
        }
        else {
            int vainqueur =0;
            for (int i=0; i<5; i++) {
                if (!tableJeu[i].mort()) {
                    vainqueur =i;
                }
            }
            System.out.println( "Le gagnant est "+ tableJeu[vainqueur].getNom());
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
