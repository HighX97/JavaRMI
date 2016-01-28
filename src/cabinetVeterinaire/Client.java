package cabinetVeterinaire;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@SuppressWarnings("deprecation")
public class Client {
	
	public Client(){}

//		System.out.println("Manager : "+System.getProperty("java.security.policy"));
//		System.out.println(System.setProperty("java.security.policy", "/auto_home/lortole/git/JavaRMI/bin/cabinetVeterinaire/cabinetVeterinaire.pol"));
//		System.out.println("Manager : "+System.getProperty("java.security.policy"));
	
	public static void main(String args[]){
		String host = (args.length < 1) ? null : args[0];
		System.setProperty( "java.security.policy", "cabinetVeterinaire.policy");
		try {
			if (System.getSecurityManager() == null)
			{
				System.setSecurityManager (new RMISecurityManager());
			}
			Registry registry = LocateRegistry.getRegistry(host);
			IAnimal stub =  (IAnimal) registry.lookup("IAnimal");//Proxy
			String response = stub.getNomComplet();
			System.out.println("Response: "+response);
		} catch (Exception e)
		{
			System.err.println("Client exception "+e.toString());
			e.printStackTrace();
		}
	}
}
