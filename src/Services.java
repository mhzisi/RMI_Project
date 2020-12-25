public class Services implements MyInterface {
    private float solde;
    
    // Constructor 
    public Services(float solde){
        this.solde = solde;
    }

    // Here we will find the servies related to the account management
    public String debiter(float mont){
        if(mont > this.solde){
            return "Opération impossible t'as pas d'argent pour faire ce retrer";
        } else {
            this.solde-= mont;
            return Float.toString(this.solde) + " DT reste dans votre compte";
        }
    }
    
    public String crediter(float mont){
        this.solde+= mont;
        return Float.toString(this.solde) + " DT dans votre compte";
    }
    
    public String lireSolde(){
        return "Votre solde est: " + Float.toString(this.solde);
    }
}
