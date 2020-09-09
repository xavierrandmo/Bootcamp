public class GnomeJardin extends NainJardin implements superPouvoir {
 
    public GnomeJardin (int solide) {
        // Constructeur
        super(solide);
    }
   
    public double sort() {
        double sort = (Math.random()) * this.solidite;
        return sort;
    }
   
    public int subitCharme (int coup){
        double sort = this.sort();
        int sort_int = (int)sort;
        int coupSurSorcier =0;
   
        if (sort_int > coup) {
            coupSurSorcier = -coup;
        }
        
        return coupSurSorcier;
    }
}
   