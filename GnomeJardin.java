public class GnomeJardin extends NainJardin implements superPouvoir {
 
 public GnomeJardin (int solide) {
  //le constructeur 
  super(solide);
 }

 public double sort() {
  double sort = (Math.random()) * this.solidite;
  return sort;
 }

 public int subitCharme (int coup){
  double sort = this.sort();
  int sorta = (int)sort;
  int coupSurSorcier =0;

  if (sorta > coup) {
	coupSurSorcier = -coup;
  }
  return coupSurSorcier;
  }

}
