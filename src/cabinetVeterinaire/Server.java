package cabinetVeterinaire;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@SuppressWarnings("deprecation")
public class Server {

	public Server(){}
	
	public static void main(String args[]){
		
		//System.setProperty( "java.security.policy", "cabinetVeterinaire.policy");
		try {
			if (System.getSecurityManager() == null)
			{
				System.setSecurityManager (new RMISecurityManager());
			}
			IAnimal obj = new Animal();
			Registry registry = LocateRegistry.createRegistry(1099);
			//Registry registry = LocateRegistry.getRegistry();
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}
			else
			{
				registry.bind("IAnimal", obj);
				System.err.println("Server ready");
			}
		} catch (Exception e)
		{
			System.err.println("Server exception "+e.toString());
			e.printStackTrace();
		}
	}
}
