package pl.edu.ur.oopl9;

public class Auto {
    private String marka;
    private String nazwaSamochodu;
    private int maxPredkosc;
    private int cena;

    public Auto(String marka, String nazwaSamochodu, int maxPredkosc, int cena) {
        this.marka = marka;
        this.nazwaSamochodu = nazwaSamochodu;
        this.maxPredkosc = maxPredkosc;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwaSamochodu() {
        return nazwaSamochodu;
    }

    public void setNazwaSamochodu(String nazwaSamochodu) {
        this.nazwaSamochodu = nazwaSamochodu;
    }

    public int getMaxPredkosc() {
        return maxPredkosc;
    }

    public void setMaxPredkosc(int maxPredkosc) {
        this.maxPredkosc = maxPredkosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Auto{" + "marka=" + marka + ", nazwaSamochodu=" + nazwaSamochodu + ", maxPredkosc=" + maxPredkosc + ", cena=" + cena + '}';
    }
}
