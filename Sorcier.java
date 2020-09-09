public class Sorcier extends Personnage{
    private final double pouvoir;
    
    public Sorcier (final String nom, final int pointDeVie) {
        super(nom, pointDeVie);
        this.pouvoir = Math.random();    
    }

    public void attaque(final Personnage p) {
        if (!this.mort()) {
            final double coup = pouvoir * getVie();
            final int coup_int = (int) coup;
            this.addVie(p.subitCharme(coup_int));
        }
    }

    public int subitCharme(final int coup) {
        return 0;
    }

    public int subitFrappe(final int coup) {
        this.addVie(-1*coup);
        return (int) ((int) -1 * this.pouvoir * this.getVie());
    }
}
