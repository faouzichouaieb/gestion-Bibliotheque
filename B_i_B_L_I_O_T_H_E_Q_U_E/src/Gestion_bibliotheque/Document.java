package Gestion_bibliotheque;

public class Document {
	private int code;
	private String titre;
	private String salle;
	private String rayon;
	private int nb_explaire;
	public Document() {
		super();
	}
	public Document(int code, String titre, String salle, String rayon,
			int nb_explaire) {
		super();
		this.code = code;
		this.titre = titre;
		this.salle = salle;
		this.rayon = rayon;
		this.nb_explaire = nb_explaire;
	}
	public Document(String code2, String titre2, String salle2, String rayon2,
			String nb_explaire2) {
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getRayon() {
		return rayon;
	}
	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	public int getNb_explaire() {
		return nb_explaire;
	}
	public void setNb_explaire(int nb_explaire) {
		this.nb_explaire = nb_explaire;
	}
	@Override
	public String toString() {
		return "Document [code=" + code + ", titre=" + titre + ", salle="
				+ salle + ", rayon=" + rayon + ", nb_explaire=" + nb_explaire
				+ "]";
	}
	
	
	
	

}
