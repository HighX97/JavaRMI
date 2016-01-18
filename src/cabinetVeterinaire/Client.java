package cabinetVeterinaire;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	
	public Client(){}
	
	public static void main(String args[]){
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			IAnimal stub =  (IAnimal) registry.lookup("IAnimal");
			String response = stub.getNomComplet();
			System.out.println("Response: "+response);
		} catch (Exception e)
		{
			System.err.println("Client exception "+e.toString());
			e.printStackTrace();
		}
	}
}
