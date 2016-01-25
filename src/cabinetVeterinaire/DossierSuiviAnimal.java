package cabinetVeterinaire;

import java.rmi.RemoteException;

public class DossierSuiviAnimal implements IDossierSuiviAnimal
{
	private Animal animal;
	
	protected DossierSuiviAnimal() throws RemoteException {
		super();
	}
	
	protected DossierSuiviAnimal(Animal ani) throws RemoteException {
		super();
		this.setAnimal(ani);	
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String getAnimalInfo() throws RemoteException
	{
		return animal.getNomComplet();	
	}

}
