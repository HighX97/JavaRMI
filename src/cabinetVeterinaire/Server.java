package cabinetVeterinaire;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * java -Djava.security.policy=cabinetVeterinaireabinetVeterinaire.policy cabinetVeterinaire.Server
 */
@SuppressWarnings("deprecation")
public class Server {

	public Server(){}
	
	public static void main(String args[]){
		
		System.out.println("Manager : "+System.getProperty("java.security.policy"));
		System.out.println(System.setProperty("java.security.policy", "/auto_home/lortole/git/JavaRMI/bin/cabinetVeterinaire/cabinetVeterinaire.policy"));
		System.out.println("Manager : "+System.getProperty("java.security.policy"));
		try {
			if (System.getSecurityManager() == null)
			{
				System.out.println("Manager avt : "+System.getSecurityManager());
				System.setSecurityManager (new RMISecurityManager());
				System.out.println("Manager ap : "+System.getSecurityManager());
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
