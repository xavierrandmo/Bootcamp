public class Monstre extends Personnage {

    public Monstre (String nom, int pointDeVie) {
        super(nom, pointDeVie);
    }
    
 
    public void attaque(final Personnage p) {
		if (this.mort()!=true) {
            double coup = 0.5*this.getVie();
            int coup_int = (int) coup;
            this.addVie(p.subitFrappe(coup_int));
        }
    }

    public int subitCharme(final int coup) {
        this.addVie(-1*coup);

        return (int) 0.5*this.getVie();
    }

    public int subitFrappe(final int coup) {
        this.addVie(-1*coup);
        return (int) -0.5*this.getVie();
    }
}
