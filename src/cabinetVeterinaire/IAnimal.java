package cabinetVeterinaire;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAnimal extends Remote{

	String getNomComplet()  throws RemoteException;
}
