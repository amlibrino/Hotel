public class Suite extends Chambre {
    private int capacity = 4;
    private boolean isBooked;

    public Suite(String nom, boolean isBooked, int capacity, int prixParNuit) {
        super(nom, isBooked, capacity, prixParNuit);
    }


    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isBooked() {
        return isBooked;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
