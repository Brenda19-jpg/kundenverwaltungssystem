public class Adresse {
    private String strasse;
    private String plz;
    private String stadt;

    // Konstruktoren:
    public Adresse(String newStrasse, String newPlz, String newStadt) {
        this.setStrasse(newStrasse);
        this.setPlz(newPlz);
        this.setStadt(newStadt);
    }

    public Adresse() {}

    // Setters & Getter:
    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String newStrasse) {
        this.strasse = newStrasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String newPlz) {
        this.plz = newPlz;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String newStadt) {
        this.stadt = newStadt;
    }

    @Override
    public String toString() {
        return strasse + ", " + plz + ", " + stadt;
    }
}
