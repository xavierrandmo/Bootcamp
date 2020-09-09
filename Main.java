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

        
    }
}
