import java.util.ArrayList;
import java.util.List;

class Telefon{
    String marca = "";

    int rezolutie = 0;

    double capacitateBaterie = 0.0;

    int durataBaterieInZile = 0;

    public Telefon(String marca, int rezolutie, double capacitateBaterie, int durataBaterieInZile){
        this.marca = marca;
        this.rezolutie = rezolutie;
        this.capacitateBaterie = capacitateBaterie;
        this.durataBaterieInZile = durataBaterieInZile;
    }

    public String getMarca() {
        return marca;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public double getCapacitateBaterie() {
        return capacitateBaterie;
    }

    public int getDurataBaterieInZile() {
        return durataBaterieInZile;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setCapacitateBaterie(double capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
    }

    public void setDurataBaterieInZile(int durataBaterieInZile) {
        this.durataBaterieInZile = durataBaterieInZile;
    }

    public String toString(){
        return "Marca telefonului: " + this.marca + " rezolutia telefonului: " + this.rezolutie
                + " capacitatea bateriei: " + this.capacitateBaterie + " durata bateriei in zile: " + this.durataBaterieInZile;
    }

    public List<Telefon> telefoaneCuMarcaSamsung(List<Telefon> telefoane){
        List<Telefon> telefoaneSamsung = new ArrayList<>();

        for(Telefon telefon : telefoane){
           if(telefon.getMarca() == "Samsung"){
               telefoaneSamsung.add(telefon);
           }
        }

        return telefoaneSamsung;
    }
}

public class TelefonMain {
    public static void main(String[] args){

    }
}
