import java.util.ArrayList;
import java.util.List;

public class KundenVerwaltungsSystem {
    public static void main(String[] args) {
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("Willkommen in unserem Kundenverwaltungssystem!");

        List<Person> kunden = new ArrayList<>();

        // Adresse:
        Adresse adresse1 = new Adresse("AES-Street 1", "1234", "AES");
        Adresse adresse2 = new Adresse();
        adresse2.setStrasse("AES-Street 2");
        adresse2.setPlz("1234");
        adresse2.setStadt("AES");

        // Kunden:
        NatuerlichePerson privatKunde1 = new NatuerlichePerson("Brenda", adresse1, Geschlecht.WEIBLICH);
        NatuerlichePerson privatKunde2 = new NatuerlichePerson("Thomas", adresse2, Geschlecht.MAENNLICH);
        NatuerlichePerson privatKunde3 = new NatuerlichePerson("Tatiana", adresse1, Geschlecht.WEIBLICH);
        NatuerlichePerson privatKunde4 = new NatuerlichePerson("Christiana", adresse2, Geschlecht.WEIBLICH);
        NatuerlichePerson privatKunde5 = new NatuerlichePerson("Yasmine", adresse1, Geschlecht.WEIBLICH);
        NatuerlichePerson privatKunde6 = new NatuerlichePerson("Leslie", adresse1, Geschlecht.WEIBLICH);

        JuristischePerson firma1 = new JuristischePerson("Brenda-Firma", adresse2, Rechtsform.GMBH, true);
        JuristischePerson firma2 = new JuristischePerson("AES-Firma", adresse2, Rechtsform.AG, true);
        JuristischePerson firma3 = new JuristischePerson("Tatiana-Firma", adresse1, Rechtsform.GMBH, false);
        JuristischePerson firma4 = new JuristischePerson("Christiana-Firma", adresse2, Rechtsform.EINZEL_UNTERNEHMEN, false);
        JuristischePerson firma5 = new JuristischePerson("Yasmine-Firma", adresse2, Rechtsform.AG, true);
        JuristischePerson firma6 = new JuristischePerson("Leslie-Firma", adresse2, Rechtsform.GMBH, false);
        JuristischePerson firma7 = new JuristischePerson("THB", adresse1, Rechtsform.GMBH, true);

        // Bestellungen:
        privatKunde1.ergaenzeBestellung(2000);
        privatKunde1.ergaenzeBestellung(3500);
        privatKunde1.bestellungZurueckgeben(1000);
        privatKunde2.ergaenzeBestellung(10000);
        privatKunde3.ergaenzeBestellung(3500);
        privatKunde3.ergaenzeBestellung(200);
        privatKunde4.ergaenzeBestellung(35000);
        privatKunde4.bestellungZurueckgeben(5000);
        privatKunde5.ergaenzeBestellung(1000);
        privatKunde6.ergaenzeBestellung(1500);

        firma1.ergaenzeBestellung(10000);
        firma1.ergaenzeBestellung(120);
        firma2.ergaenzeBestellung(15600);
        firma3.ergaenzeBestellung(5000);
        firma4.ergaenzeBestellung(1500);
        firma4.ergaenzeBestellung(12000);
        firma5.ergaenzeBestellung(10000);
        firma6.ergaenzeBestellung(14890);
        firma6.ergaenzeBestellung(5620);
        firma7.ergaenzeBestellung(10);

        // Save Kunden:
        kunden.add(privatKunde1);
        kunden.add(privatKunde2);
        kunden.add(privatKunde3);
        kunden.add(privatKunde4);
        kunden.add(privatKunde5);
        kunden.add(privatKunde6);
        kunden.add(firma1);
        kunden.add(firma2);
        kunden.add(firma3);
        kunden.add(firma4);
        kunden.add(firma5);
        kunden.add(firma6);
        kunden.add(firma7);

        // Premium-Check
        System.out.println("\n\n~~ Premium-Check ~~");
        for (Person kunde : kunden) {
            System.out.println(kunde + " - Premium: " + kunde.istPremiumkunde());
        }


        // top-10:
        System.out.println("\n\n~~ Top 10 Kunden ~~");

        // Sort Kunden bei Wichtigkeit:
        for (int i = 0; i < kunden.size(); i++) {
            for (int j = 0; j < kunden.size(); j++) {
                if (kunden.get(j).wichtigkeit() > kunden.get(i).wichtigkeit()) {
                    Person temp = kunden.get(i);
                    kunden.set(i, kunden.get(j));
                    kunden.set(j, temp);
                }
            }
        }

        // Top - 10 anzeigen:
        int max = 10;
        for (int i = 0; i < max; i++) {
            Person kunde = kunden.get(i);
            System.out.println((i+1) + ". " + kunde.name + " | Wichtigkeit: " + kunde.wichtigkeit());
        }

        System.out.println("\n:::::::::::::::::::::::::::::::::::::::");
    }
}