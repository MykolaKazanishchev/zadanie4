import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public void dodajRezerwacji(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        System.out.println("Rezerwacja na wydarzenie: " + wydarzenie.getNazwa() + "została dodana.");
    }

    public void wyswietlRezerwacje() {
        if(listaRezerwacji.isEmpty()) {
            System.out.println("Brak zarezerwowanych wydarzeń");
        }
        else {
            System.out.println("Zarezerwowane wydarzenia:");
            for(Wydarzenie w : listaRezerwacji) {
                System.out.println(w);
            }
        }
    }
    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        if(listaRezerwacji.contains(wydarzenie)) {
            listaRezerwacji.remove(wydarzenie);
            System.out.println("Rezerwacja na wydarzenie: " + wydarzenie.getNazwa() + "została anulowana.");
        }
        else {
            System.out.println("Wydarzenie: " + wydarzenie.getNazwa() + "nie zostało zarezerwowane.");
        }
    }
}
