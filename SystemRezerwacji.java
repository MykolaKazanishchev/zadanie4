import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen;
    private ArrayList<Klient> listaKlientow;

    public SystemRezerwacji() {
        listaWydarzen = new ArrayList<>();
        listaKlientow = new ArrayList<>();
    }
    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
        System.out.println("Wydarzenie: " + wydarzenie.getNazwa() + " zostalo dodane.");

    }
    public void dodajWydarzenie(String nazwa, double cena){
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena);
        listaWydarzen.add(wydarzenie);
        System.out.println("Wydarzenie: " + nazwa + " zostalo dodane.");
    }
    public void dodajKlienta(Klient klient) {
        listaKlientow.add(klient);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko() + " został dodany.");
    }


    public void dodajKlienta(String imie, String nazwisko, String email) {
        Klient klient = new Klient(imie, nazwisko, email);
        listaKlientow.add(klient);
        System.out.println("Klient: " + imie + " " + nazwisko + " został dodany.");
    }}


//    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
//        if (wydarzenie.getDostepneMiejsca() > 0) {
//            klient.dokonajRezerwacje(wydarzenie);
//            wydarzenie.zarezerwujMiejsce();
//            System.out.println("Rezerwacja na wydarzenie: " + wydarzenie.getNazwa() + " dla klienta " + klient.getImie() + " " + klient.getNazwisko() + " została dokonana.");
//        } else {
//            System.out.println("Brak dostępnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
//        }
//    }
//
//
//    public Wydarzenie znajdzWydarzenie(String nazwa) {
//        for (Wydarzenie w : listaWydarzen) {
//            if (w.getNazwa().equals(nazwa)) {
//                return w;
//            }
//        }
//        System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
//        return null;
//    }
//
//
//    public Klient znajdzKlienta(String nazwisko) {
//        for (Klient k : listaKlientow) {
//            if (k.getNazwisko().equals(nazwisko)) {
//                return k;
//            }
//        }
//        System.out.println("Nie znaleziono klienta o nazwisku: " + nazwisko);
//        return null;
//    }
//
//
//    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
//        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
//        if (wydarzenie != null) {
//            wydarzenie.setCena(nowaCena);
//            System.out.println("Cena wydarzenia: " + nazwa + " została zmieniona na: " + nowaCena + " PLN.");
//        }
//    }
//}
//
