public class Sorcier extends Personnage {
 protected double pouvoir;

 public Sorcier (String nomJ, int pointVieJ) {
  // le constructeur
  super (nomJ, pointVieJ);
  this.pouvoir = Math.random();
 }

  public String toString () {
  return "Je suis un sorcier, je m'appelle " + this.nom + " j'ai " +this.pointsVie + " points de vie";
 }

 public void attaque (Personnage p) {
  if (!this.mort()) {
	double forceCharme = (double)(this.getVie())*(this.pouvoir);
	int coup = (int)forceCharme;
        p.subitCharme (coup);
  }
 }

 public int subitFrappe (int coup) {
  int forceFrappe = coup;
  this.addVie(-forceFrappe);

  double forceBlessure = (double)(this.getVie()) * (this.pouvoir);
  int coupBless = (int)forceBlessure;
 
  return coupBless;
 }

 public int subitCharme (int coup) {
  return 0;
 }

 public double getPouvoir() {
  return this.pouvoir;
 }
}
