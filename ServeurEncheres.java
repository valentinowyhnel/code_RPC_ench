import java.rmi.*;

public class ServeurEncheres {
    public static void main(String[] args) {
        try {
            EnchereImpl objetEnchere = new EnchereImpl();

            // Enregistrement de l'objet distant
            Naming.rebind("Enchere", objetEnchere);
            
            System.out.println("Serveur d'enchères prêt.");
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}

