public abstract class Personnage {
    private String nom;
    private int pointDeVie;

    public Personnage (String nom, int nouveauPointDeVie) {
        this.nom = nom;
        this.pointDeVie = nouveauPointDeVie;
    }

    public String getNom() {
        return this.nom;
    };

    public boolean mort() {
        if(this.pointDeVie<=0){
            return true;
        }
        return false;
    }

    public int getVie() {
        return this.pointDeVie;
    }

    public void addVie(final int num) {
        this.pointDeVie = this.pointDeVie + num;
    }

    public void affichage() {
        if (this.mort()==true){
            System.out.println(this.nom + " est mort.");
        } else {
            System.out.println("Je m'appelle " + this.nom + " et j'ai " + this.pointDeVie );
        }
        
    }

    public abstract void attaque(Personnage p);
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);
}