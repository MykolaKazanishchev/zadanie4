import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen;
    private ArrayList<Klient> listaKlientow;

    public SystemRezerwacji() {
        this.listaWydarzen = new ArrayList<>();
        this.listaKlientow = new ArrayList<>();
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena) {
        listaWydarzen.add(new Wydarzenie(nazwa, cena));
    }

    public void dodajKlienta(Klient klient) {
        listaKlientow.add(klient);
    }

    public void dodajKlienta(String imie, String nazwisko, String email) {
        listaKlientow.add(new Klient(imie, nazwisko, email));
    }

    public boolean dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostepneMiejsca() > 0) {
            wydarzenie.zarezerwujMiejsce();
            klient.dodajRezerwacje(wydarzenie);
            return true;
        }
        return false;
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie wydarzenie : listaWydarzen) {
            if (wydarzenie.getNazwa().equalsIgnoreCase(nazwa)) {
                return wydarzenie;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient klient : listaKlientow) {
            if (klient.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return klient;
            }
        }
        return null;
    }

    public boolean zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
            return true;
        }
        return false;
    }
}
