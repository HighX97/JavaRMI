package cabinetVeterinaire;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Animal extends UnicastRemoteObject implements IAnimal {
	
	static private int id;
	private int idAnimal;
	private String nom;
	private String nomMaitre;
	private String espece;
	private String race;
	
	protected Animal() throws RemoteException {
		super();
		this.idAnimal = Animal.getId();
		this.nom = "médor";
		this.nomMaitre = "ikbal";
		this.espece = "chien";
		this.race = "pit";	
	}
	
	protected Animal(String nom, String nomMaitre, String espece, String race) throws RemoteException {
		super();
		this.nom = nom;
		this.nomMaitre = nomMaitre;
		this.espece = espece;
		this.race = race;	
	}

	public String getNomComplet() throws RemoteException {
		return this.getIdAnimal()+this.getNom()+" "+this.getNomMaitre()+" "+this.getEspece()+" "+this.getRace();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomMaitre() {
		return nomMaitre;
	}

	public void setNomMaitre(String nomMaitre) {
		this.nomMaitre = nomMaitre;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public static int getId() {
		return ++id;
	}

	public static void setId(int id) {
		Animal.id = id;
	}

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	
	

}
