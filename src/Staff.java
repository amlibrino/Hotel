public class Staff extends Personne {
    private String role;

    public Staff(String nom, String role) {
        super(nom);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
