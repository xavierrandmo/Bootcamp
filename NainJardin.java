public class NainJardin implements Victime {
 protected int solidite; // positif ou negatif
 
 public NainJardin (int solide) {
  //le constructeur 
  this.solidite = solide;
 }
 
 public int getSolidite() {
  return this.solidite;
 }

 public int subitFrappe (int coup) {
  int blessureMonstre = this.getSolidite();
  if (coup > this.getSolidite()) {	
	this.solidite =0;
  }
  return blessureMonstre;
 }

 public int subitCharme (int coup) {
  int perteSorcier = 1; // le sorcier perd un point de vie
  return perteSorcier;
 }

}
