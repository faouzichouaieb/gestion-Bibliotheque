package Gestion_bibliotheque;

public class Magasins extends Document {
	private String Frequence_de_parution;

	public Magasins() {
		super();
	}

	public Magasins(int code, String titre, String salle, String rayon,
			int nb_explaire,String Frequence_de_parution) {
		super(code, titre, salle, rayon, nb_explaire);

		this.Frequence_de_parution=Frequence_de_parution;
	}

	public String getFrequence_de_parution() {
		return Frequence_de_parution;
	}

	public void setFrequence_de_parution(String frequence_de_parution) {
		Frequence_de_parution = frequence_de_parution;
	}

	@Override
	public String toString() {
		return "Magasins [Frequence_de_parution=" + Frequence_de_parution
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
