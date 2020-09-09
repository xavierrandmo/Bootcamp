public class Monstre extends Personnage {
 
 public Monstre (String nomJ, int pointVieJ) {
  // le constructeur
  super (nomJ, pointVieJ);
 }

 public String toString () {
  return "Je suis un monstre, je m'appelle " + this.nom + " j'ai " +this.pointsVie + " points de vie";
 }

 public int subitFrappe (int coup) {
 // quand le monstre est frappé par le personnage p
  int force =coup;
  int pointsVie = this.getVie();
  
  this.addVie(-force);
  
  int forceBless = pointsVie/2;  
  
  return forceBless;
 }

 public int subitCharme (int coup) {
  int forceCharme = coup;
  int pointsVie = this.getVie();
  this.addVie (-forceCharme); 
  
  int pointCharme = pointsVie/2;
  
  return pointCharme;
 }
 
 public void attaque (Personnage p) {
  if (! this.mort()) {
	int forceAttaque = (this.getVie())/2; //la force de l'attaque est egale à la moitie de points de vie du monstre
	p.subitFrappe(forceAttaque); 
	
  }
}

}
