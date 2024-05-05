import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("unused")
interface Enchere extends Remote {
    void encherir(String nomClient, double prix) throws RemoteException;
    double getPrixActuel() throws RemoteException;
}
