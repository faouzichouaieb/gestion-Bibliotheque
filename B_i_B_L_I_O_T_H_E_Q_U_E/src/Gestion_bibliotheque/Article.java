package Gestion_bibliotheque;

public class Article extends Document{
	
	private String nom_auteur;
	private String date_publication;
	public Article() {
		super();
	}
	public Article(int code, String titre, String salle, String rayon,
			int nb_explaire, String nom_auteur,String date_publication) {
		super(code, titre, salle, rayon, nb_explaire);
		this.nom_auteur=nom_auteur;
		this.date_publication=date_publication;
		
	}
	public String getNom_auteur() {
		return nom_auteur;
	}
	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}
	public String getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(String date_publication) {
		this.date_publication = date_publication;
	}
	@Override
	public String toString() {
		return "Article [nom_auteur=" + nom_auteur + ", date_publication="
				+ date_publication + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
