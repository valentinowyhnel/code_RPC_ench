import java.rmi.*;
import java.rmi.server.*;

class EnchereImpl extends UnicastRemoteObject implements Enchere {
    private double prixActuel;
    // Remove the unused field declaration

    public EnchereImpl() throws RemoteException {
        prixActuel = 0.0;
    }

    public void encherir(String nomClient, double prix) throws RemoteException {
        if (prix > prixActuel) {
            prixActuel = prix;
            System.out.println(nomClient + " a enchérit avec un prix de " + prix);
        } else {
            System.out.println("L'enchère actuelle est plus élevée.");
        }
    }

    public double getPrixActuel() throws RemoteException {
        return prixActuel;
    }
}


