package Gestion_bibliotheque;

import java.sql.Date;

public class Emprunt {
	
	private Document doc_pret;
	private Date datepret;
	private int duree;
	public Emprunt() {
		super();
	}
	public Emprunt(Document doc_pret, Date datepret, int duree) {
		super();
		this.doc_pret = doc_pret;
		this.datepret = datepret;
		this.duree = duree;
	}
	public Document getDoc_pret() {
		return doc_pret;
	}
	public void setDoc_pret(Document doc_pret) {
		this.doc_pret = doc_pret;
	}
	public Date getDatepret() {
		return datepret;
	}
	public void setDatepret(Date datepret) {
		this.datepret = datepret;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public String toString() {
		return "Emprunt [doc_pret=" + doc_pret + ", datepret=" + datepret
				+ ", duree=" + duree + "]";
	}
	
	
	

}
