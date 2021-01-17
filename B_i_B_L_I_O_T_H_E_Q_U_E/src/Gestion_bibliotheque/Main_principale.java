package Gestion_bibliotheque;

import java.awt.Menu;
import java.util.Scanner;
import java.util.Vector;

public class Main_principale {
	
	 Scanner clavier=new Scanner(System.in);
	private	Vector<Adherant>adherant=new Vector<Adherant>(50);
		Vector<Document>document=new Vector<Document>(50);
		public void menu(){
			int choix=0;
	System.out.println("\n\t\t------- GESTION  B_I_B_L_I_O_T_H_E_Q_E -------\n");
			do{
			System.out.println("\twelcome to my application\n");
			System.out.println("\n\t taper 0 Quitter");
			System.out.println("\n\t taper 1 Gestion Adherant");
			System.out.println("\n\t taper 2 Gestion Document");
			choix=clavier.nextInt();
				switch (choix) {
				case 0:System.out.println("fermuture application...\n");
					System.exit(0);
					break;
				case 1: GestionAdherant();break;
				case 2: GestionDocument();break;
				default:System.out.println("donner un entré valid!!!!");
					break;
				}	

			}while(choix!=0);
	   
			}
			public void GestionAdherant(){
			int choixadheranr=0;
			do{
				System.out.println("***********Gestion Adherant**********\n");
				System.out.println("\n\t taper:0 pour retour au Menu principal");
				System.out.println("\n\t taper:1 pour Ajouter un adherant");
				System.out.println("\n\t taper:2 pour modifier un adherant");
				System.out.println("\n\t taper:3 pour supprimer un adherant");
				System.out.println("\n\t taper:4 pour rechercher un adherant");
				System.out.println("\n\t taper:5 pour afficher la liste des adherants");
				
				System.out.println("entrer votre choix ..");
				choixadheranr=clavier.nextInt();
					switch (choixadheranr) {
					case 0:menu();
						
						break;
					case 1:ajouterAdherant();
						
						break;
					case 2:modifierAdherant();
						
						break;
					case 3:supprimerAdherantr();
						
						break;
					case 4:rechercherAdherant();
	
						break;
					case 5:afficherAdherant();
						
						break;
					default:System.out.println("entrer un choix valide!!!");
						break;
					}


			}while(choixadheranr !=0);
		
			
		}
private void afficherAdherant() {
	System.out.println("la liste des adherant est:");

	for(int i=0;i<this.adherant.size();i++){
		System.out.println((Adherant)adherant.get(i));
	}
	
	
	
				
			}
private void rechercherAdherant() {
				// TODO Auto-generated method stub
	String x;
	for(int i=0;i<adherant.size();i++){
	System.out.println("donner l'element a chercher ...");
	x= clavier.next();
	System.out.println( adherant.contains(clavier));
	
				
			}}
private void supprimerAdherantr() {
				// TODO Auto-generated method stub
	for(int i=0;i<adherant.size();i++){
System.out.println(adherant.remove(2));
		System.out.println(adherant.toString());
		System.out.println(adherant.size());	
			}}
private void modifierAdherant() {
				// TODO Auto-generated method stub
	System.out.println(adherant.get(2));
	//adherant.setElementAt("Ad", 1);
	System.out.println(adherant.get(2));
				
			}
private void ajouterAdherant() {
				// TODO Auto-generated method stub
	System.out.println("Ajout des nouveau adherant..");
	System.out.println("Donner ID:");
	int id=clavier.nextInt();
	System.out.println("Donner le nom:");
	String nom=clavier.next();
	System.out.println("Donner le prenom:");
	String prenom=clavier.next();
	System.out.println("Donner l'adresse:");
	String adresse=clavier.next();
			System.out.println("Donner le choix de type Adherant:\n");
			System.out.println("\t 1 :Etudient");
			System.out.println("\t 2 :Enseignant");
			System.out.println("\t 3 :Visiteur");
			
			int nbre_doc_empruntMax=0;
			int duree=0;
			String type="";
			int t1=clavier.nextInt();
			switch (t1) {
			case 1:type="Etudient";nbre_doc_empruntMax=1;duree=1;
				
				break;
			case 2:type="Enseignant";;nbre_doc_empruntMax=4;duree=3;
				
				break;
			case 3:type="Visiteur";;nbre_doc_empruntMax=1;duree=1;
				
				break;

			default:System.out.println("entrer un choix valide!!");
				break;
			}
			
			Boolean retard=false;
			Adherant Ad= new Adherant(id, nom, prenom, adresse, type, nbre_doc_empruntMax, duree, retard);
			
			this.adherant.add(Ad);
			
			
			
			}
public void GestionDocument(){
	int choixDocument=0;
	do{
	System.out.println("***********Gestion Document**********\n");
	System.out.println("\n\t taper:0 pour retour au Menu principal");
	System.out.println("\n\t taper:1 pour Ajouter un document");
	System.out.println("\n\t taper:2 pour modifier un document");
	System.out.println("\n\t taper:3 pour supprimer un document");
	System.out.println("\n\t taper:4 pour rechercher un document");
	System.out.println("\n\t taper:5 pour afficher la liste des documents");
	System.out.println("entrer votre choix ..");
	
	
	choixDocument=clavier.nextInt();
		switch (choixDocument) {
		case 0:menu();
			
			break;
		case 1:ajouterDocument();
			
			break;
		case 2:modifierDocument();
			
			break;
		case 3:supprimerDocument();
			
			break;
		case 4:rechercherDocument();

			break;
		case 5:afficherDocument();
			
			break;
		default:System.out.println("entrer un choix valide!!!");
			break;
		}


}while(choixDocument !=0);



	
		}
	private void afficherDocument() {
	// TODO Auto-generated method stub
		System.out.println("la liste des document est:");
		for(int i=0;i<this.document.size();i++){
			System.out.println((Document)document.get(i));
		}
	
}
	private void rechercherDocument() {
	// TODO Auto-generated method stub
	
}
	private void supprimerDocument() {
	// TODO Auto-generated method stub
	
}
	private void modifierDocument() {
	// TODO Auto-generated method stub
	
}
	private void ajouterDocument() {
	// TODO Auto-generated method stub
		System.out.println("Ajout des nouveaux Document..");
		
		System.out.println("Donner le Code:");
		String code=clavier.next();
		System.out.println("Donner le titre:");
		String titre=clavier.next();
		System.out.println("Donner la salle:");
		String salle=clavier.next();
		System.out.println("Donner la rayon:");
		String rayon=clavier.next();
		System.out.println("Donner nb_explaire:");
		String nb_explaire=clavier.next();
		
		Document D1=new Document(code, titre, salle, rayon, nb_explaire);
		this.document.add(D1);
		



	
}
	public static void main(String[] args) {
		
	Main_principale MP=new Main_principale();
 
	MP.menu();
	//MP.afficherAdherant();1
		
	
	}

}
