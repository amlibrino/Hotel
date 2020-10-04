public abstract class Chambre {
    private String nom;
    private boolean isBooked;
    private int capacity;
    private int prixParNuit;

    public Chambre(String nom, boolean isBooked, int capacity, int prixParNuit) {
        this.nom = nom;
        this.isBooked = isBooked;
        this.capacity = capacity;
        this.prixParNuit = prixParNuit;
    }

    public String getNom() {
        return nom;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrixParNuit() {
        return prixParNuit;
    }

    public void setPrixParNuit(int prixParNuit) {
        this.prixParNuit = prixParNuit;
    }
}
