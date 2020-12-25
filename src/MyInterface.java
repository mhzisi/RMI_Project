import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    // String sayHello()throws RemoteException;
    
    // fonction pour retirer de l'argent
    String debiter(float mont)throws RemoteException;
    
    // fonction pour ajouter de l'argent a un compte
    String crediter(float mont)throws RemoteException;
    
    // fonction pour lire le solde d'un compte
    String lireSolde()throws RemoteException;
}
