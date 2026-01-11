public abstract class Person {
    protected String name;
    protected Adresse adresse;
    protected int anzahlBestellungen;
    protected double bisherigesBestellvolumen;


    public Person(String newName, Adresse newAdresse) {
        this.name = newName;
        this.adresse = newAdresse;
    }

    public void ergaenzeBestellung(double betrag) {
        anzahlBestellungen++;
        bisherigesBestellvolumen += betrag;
    }

    public abstract boolean istPremiumkunde();

    // Kennzahl für Top-10
    public double wichtigkeit() {
        return anzahlBestellungen * bisherigesBestellvolumen;
    }

    @Override
    public String toString() {
        return name + " | Volumen: " + bisherigesBestellvolumen;
    }
}
