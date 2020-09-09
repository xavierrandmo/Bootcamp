public class Magicien extends Sorcier implements superPouvoir {
 private double super_pouvoir;
 

 public Magicien (String nomJ, int pointVieJ) {
  // le constructeur
  super (nomJ, pointVieJ);
  this.super_pouvoir = (this.pouvoir)* (double)(extra);
  }

 public double sort() {
  double sort = (Math.random()) * this.super_pouvoir;
  return sort;
 }

 public double getPouvoir() {
  return this.super_pouvoir;
 }

 public int subitCharme (int coup) {
  double pouvoir = this.getPouvoir();
  double forcebless = (double)coup*(sort());
  int forceBless = (int)forcebless; 
  this.addVie (-forceBless);

  return forceBless;
 }

}
