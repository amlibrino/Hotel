import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Client> lstClient = new ArrayList<>();
    List<Chambre> lstChambre = new ArrayList<>();
    List<Service> lstService = new ArrayList<>();
    List<Staff> lstStaff = new ArrayList<>();

    public boolean reserver (int capacity , Client client, int nbJours){
        for (Chambre chambre: lstChambre) {
            if ((!chambre.isBooked() && (chambre.getCapacity() == capacity))) {
                System.out.println("Prix a payer: " + chambre.getPrixParNuit() * nbJours + "Eur");
                chambre.setBooked(true);
                client.addReservedChambre(chambre.getNom());
                return true;
            }
        }
        return false;
    }

    public void quitterChambre (String idChambre , Client client) {
        for (Chambre chambre: lstChambre) {
            if (chambre.getNom().equals(idChambre)) {
                chambre.setBooked(false);
                client.removeReserverChambre(chambre.getNom());
            }
        }
    }
}
