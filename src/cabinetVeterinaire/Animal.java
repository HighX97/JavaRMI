package cabinetVeterinaire;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Animal extends UnicastRemoteObject implements IAnimal {
	
	
	private String nom;
	private String nomMaitre;
	private String espece;
	private String race;
	
	protected Animal() throws RemoteException {
		super();
		this.nom = "médor";
		this.nomMaitre = "ikbal";
		this.espece = "chien";
		this.race = "pit";
		
	}

	public String getNomComplet() throws RemoteException {
		return this.getNom()+" "+this.getNomMaitre()+" "+this.getEspece()+" "+this.getRace();
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

	
	

}
