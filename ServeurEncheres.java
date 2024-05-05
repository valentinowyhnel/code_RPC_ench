import java.rmi.*;

public class ClientEncheres {
    public static void main(String[] args) {
        try {
            // Recherche de l'objet distant
            Enchere objetEnchere = (Enchere) Naming.lookup("Enchere");
            
            // Utilisation des méthodes de l'objet distant
            double prixActuel = objetEnchere.getPrixActuel();
            System.out.println("Prix actuel : " + prixActuel);
            
            // Exemple d'enchère
            objetEnchere.encherir("Client1", 100.0);
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}
