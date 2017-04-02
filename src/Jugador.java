public class Jugador {
    private String nombre;
    private int puntos;
    private Carta carta;

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public Carta getCarta() {
        return carta;
    }
    
    public void sumarunpunto(){
        
    }

    public int getPuntos() {
        return puntos;
    }
    
    public Carta devuelvecarta(){
        
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
