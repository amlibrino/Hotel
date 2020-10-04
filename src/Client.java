import java.util.ArrayList;
import java.util.List;

public class Client extends Personne {
    private String email;
    private List<String> chambresReservees = new ArrayList<>();

    public Client(String nom, String email) {
        super(nom);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addReservedChambre(String idChambre) {
        chambresReservees.add(idChambre);
    }
    public void removeReserverChambre(String idChambre) {
        chambresReservees.remove(idChambre);
    }
}
