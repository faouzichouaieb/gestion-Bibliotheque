package Gestion_bibliotheque;

public class Livre extends Document{
	String nom_auteur;
	private String nom_editeur;
	private String date_edition;
	public Livre() {
		super();
	}
	public Livre(int code, String titre, String salle, String rayon,
			int nb_explaire,String nom_auteur,String nom_editeur,String date_edition) {
		super(code, titre, salle, rayon, nb_explaire);
		this.nom_auteur=nom_auteur;
		this.nom_editeur=nom_editeur;
		this.date_edition=date_edition;
	}
	public String getNom_auteur() {
		return nom_auteur;
	}
	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}
	public String getNom_editeur() {
		return nom_editeur;
	}
	public void setNom_editeur(String nom_editeur) {
		this.nom_editeur = nom_editeur;
	}
	public String getDate_edition() {
		return date_edition;
	}
	public void setDate_edition(String date_edition) {
		this.date_edition = date_edition;
	}
	@Override
	public String toString() {
		return "Livre [nom_auteur=" + nom_auteur + ", nom_editeur="
				+ nom_editeur + ", date_edition=" + date_edition
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
