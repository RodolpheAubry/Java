public class ClassementCourse {
	Voiture voiture;
	double distance;
	String statut;
	int pause;	
	
	public ClassementCourse(Voiture voiture, double distance, String statut, int pause){
		this.voiture = voiture;
		this.distance = distance;
		this.statut = statut;
		this.pause = pause;
	}
}