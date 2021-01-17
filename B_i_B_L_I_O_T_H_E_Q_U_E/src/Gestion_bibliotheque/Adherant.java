package Gestion_bibliotheque;

import java.util.Arrays;
import java.util.Vector;

public class Adherant {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String type;
	private int nbre_doc_empruntMax;
	
	private int duree;
	private boolean retard;
	private Emprunt listepret[];
	private Vector<Emprunt>listpret2;
	public Adherant() {
		
	}
	
	
	public Adherant(int id, String nom, String prenom, String adresse,
			String type, int nbre_doc_empruntMax, int duree, boolean retard) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.type = type;
		this.nbre_doc_empruntMax = nbre_doc_empruntMax;
		this.duree = duree;
		this.retard = retard;
	}


	public Adherant(int id, String nom, String prenom, String adresse,
			String type, int nbre_doc_empruntMax, int duree, boolean retard,
			Emprunt[] listepret, Vector<Emprunt> listpret2) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.type = type;
		this.nbre_doc_empruntMax = nbre_doc_empruntMax;
		this.duree = duree;
		this.retard = retard;
		this.listepret = listepret;
		this.listpret2 = listpret2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prenom;
	}
	public void setPrénom(String prénom) {
		this.prenom = prénom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNbre_doc_emprunt() {
		return nbre_doc_empruntMax;
	}
	public void setNbre_doc_emprunt(int nbre_doc_empruntMax) {
		this.nbre_doc_empruntMax = nbre_doc_empruntMax;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public boolean isRetard() {
		return retard;
	}
	public void setRetard(boolean retard) {
		this.retard = retard;
	}
	public Emprunt[] getListepret() {
		return listepret;
	}
	public void setListepret(Emprunt[] listepret) {
		this.listepret = listepret;
	}
	public Vector<Emprunt> getListpret2() {
		return listpret2;
	}
	public void setListpret2(Vector<Emprunt> listpret2) {
		this.listpret2 = listpret2;
	}
	@Override
	public String toString() {
		return "Adherant [id=" + id + ", nom=" + nom + ", prénom=" + prenom
				+ ", adresse=" + adresse + ", type=" + type
				+ ", nbre_doc_emprunt=" + nbre_doc_empruntMax + ", duree=" + duree
				+ ", retard=" + retard + ", listepret="
				+ Arrays.toString(listepret) + ", listpret2=" + listpret2 + "]";
	}
	
	
	
	
}
