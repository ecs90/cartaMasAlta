public class Carta {
    private String palo;
    private int numero;

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
}
