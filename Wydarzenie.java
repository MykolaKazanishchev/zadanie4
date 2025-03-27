public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
    private double cena;

public Wydarzenie(String nazwa, double cena) {
    this.nazwa = nazwa;
    this.cena = cena;
}

public Wydarzenie(String nazwa, double cena, String data) {
    this.nazwa = nazwa;
    this.cena = cena;
    this.data = data;
    }

public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
    this.nazwa = nazwa;
    this.cena = cena;
    this.data = data;
    this.miejsce = miejsce;
}

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + "\nData: " + data + "\nMiejsce: " + miejsce +
                "\nCena: " + cena + " PLN\nDostępne miejsca: " + dostepneMiejsca + "/" + maxLiczbaMiejsc;
    }

    public void zarezerwujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
            System.out.println("Miejsce zarezerwowane! Pozostało " + dostepneMiejsca + " dostępnych miejsc.");
        } else {
            System.out.println("Brak dostępnych miejsc!");
        }
    }
}
