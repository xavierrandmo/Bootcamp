public abstract class Personnage implements Victime {
 protected String nom;
 protected int pointsVie;

 public Personnage (String nomJ, int pointVieJ) {
  // le constructeur
  this.nom = nomJ;
  this.pointsVie = pointVieJ;
 }

 public String toString () {
  if (this.pointsVie == 0) {
	return this.nom + "est mort";  
  }
  else {
	return "Je m'appelle " + this.nom + " et j'ai " + this.pointsVie + " points de vie";
  }
 }

 public String getNom() {
  return this.nom;
 }

 public boolean mort() {
  if (this.pointsVie == 0) {
	return true;
  }
  return false;
 }

 public int getVie() {
  return this.pointsVie;
 // si je décide que la fonction retourne un String : return "Il vous reste " + this.pointsVie + "points de vie!";
 }

 public void addVie (int num) {
  this.pointsVie += num; // num peut être positif ou négatif
 }

 public abstract void attaque (Personnage p);

 public abstract int subitFrappe (int coup);

 public abstract int subitCharme (int coup); 

}

