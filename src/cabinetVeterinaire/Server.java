package cabinetVeterinaire;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public Server(){}
	
	public static void main(String args[]){ 
		try {
			Animal obj = new Animal();
			Registry registry = LocateRegistry.createRegistry(1099);
			//Registry registry = LocateRegistry.getRegistry();
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}
			else
			{
				registry.bind("IAnimal", obj);
				System.err.println("Server animal ready");
			}
		} catch (Exception e)
		{
			System.err.println("Server exception "+e.toString());
			e.printStackTrace();
		}
	}
}

