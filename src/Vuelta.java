import java.util.HashMap;

public class Vuelta {
    HashMap<Jugador,Carta> vuelta = new HashMap<Jugador,Carta>();
    
    public void agregarMano(Jugador jugador, Carta carta){
        vuelta.put(jugador, carta);
    }
    
    public Carta verCartaDelJugador(Jugador jugador){
        Carta carta = vuelta.get(jugador);
        return carta;
    }

    public Vuelta() {
    }
}
