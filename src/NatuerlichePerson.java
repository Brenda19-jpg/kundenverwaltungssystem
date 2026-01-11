public class NatuerlichePerson extends Person {
    private Geschlecht geschlecht;
    private String anrede;

    public NatuerlichePerson(String newName, Adresse newAdresse, Geschlecht newGeschlecht, String newAnrede) {
        super(newName, newAdresse);
        this.geschlecht  = newGeschlecht;
        this.anrede = newAnrede;
    }

    @Override
    public boolean istPremiumkunde() {
        return this.bisherigesBestellvolumen >= 5000;
    }

    public void bestellungZurueckgeben(double betrag) {
        anzahlBestellungen--;
        bisherigesBestellvolumen -= betrag;
    }
}
