public class NatuerlichePerson extends Person {
    private Geschlecht geschlecht;
    private String anrede;

    public NatuerlichePerson(String newName, Adresse newAdresse, Geschlecht newGeschlecht) {
        super(newName, newAdresse);
        this.setGeschlecht(newGeschlecht);
    }

    @Override
    public boolean istPremiumkunde() {
        return this.bisherigesBestellvolumen >= 5000;
    }

    public void setGeschlecht(Geschlecht newGeschlecht) {
        this.geschlecht = newGeschlecht;

        if (this.geschlecht != null) {
            if (this.geschlecht == Geschlecht.MAENNLICH) {
                this.anrede = "Herr";
            } else if (this.geschlecht == Geschlecht.WEIBLICH) {
                this.anrede = "Frau";
            } else {
                this.anrede = "";
            }
        }
    }

    public void bestellungZurueckgeben(double betrag) {
        anzahlBestellungen--;
        bisherigesBestellvolumen -= betrag;
    }
}
