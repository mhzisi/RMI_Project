import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        // Server server = new Server();
        // Dans ce demo j'ai utilisé le constructeur paramétrer pour initialiser
        // le solde de note utilisateur
        Services services = new Services(5000);
        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", services);
    }
}
