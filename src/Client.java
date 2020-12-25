import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Opérations bancaire");
            
            System.out.println("Donner le mont pour le retrait : ");
            float mont = scanner.nextFloat();
            System.out.println(service1.debiter(mont));
            
            System.out.println("Donner le mont a verser : ");
            mont = scanner.nextFloat();
            service1.crediter(mont);
            
            System.out.println("Solde: ");
            System.out.println(service1.lireSolde());
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}
