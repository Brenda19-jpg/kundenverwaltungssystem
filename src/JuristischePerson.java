public class JuristischePerson extends Person {
    private Rechtsform rechtsform;
    private boolean isKapitalgesellschaft;

    public JuristischePerson(String newName, Adresse newAdresse, Rechtsform newRechtsform, boolean isKapitalgesellschaft) {
        super(newName, newAdresse);
        this.rechtsform = newRechtsform;
        this.isKapitalgesellschaft = isKapitalgesellschaft;
    }

    @Override
    public boolean istPremiumkunde() {
        return anzahlBestellungen >= 20 || bisherigesBestellvolumen >= 20000;
    }
}
