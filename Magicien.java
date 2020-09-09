public class Magicien extends Sorcier implements superPouvoir {
    private double super_pouvoir;
    
   
    public Magicien (String nom, int pointDeVie) {
        //Constructeur
        super (nom, pointDeVie);
        this.super_pouvoir = (this.getPouvoir())* (double)(extra);
     }
   
    public double sort() {
        double sort = (Math.random()) * this.super_pouvoir;
        return sort;
    }
   
    public double getPouvoir() {
        return this.super_pouvoir;
    }
   
    public int subitCharme (int coup) {
        double blessure = (double)coup*(sort());
        int forceBlessure = (int)blessure; 
        this.addVie (-forceBlessure);
   
        return forceBlessure;
    }
   
}
   