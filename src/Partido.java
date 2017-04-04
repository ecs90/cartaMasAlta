import java.util.ArrayList;

public class Partido {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private ArrayList<Vuelta> vueltas = new ArrayList<Vuelta>();
    
    public boolean partidoTerminado(){
        for (int i = 0; i < jugadores.size(); i++) {
            if(jugadores.get(i).getPuntos() == 10) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public Jugador getGanador(){
        for (int i = 0; i < jugadores.size(); i++) {
            if(jugadores.get(i).getPuntos() == 10) {
                return jugadores.get(i);
            }
        }
        return null;
    }

    public ArrayList<Vuelta> getVueltas() {
        return vueltas;
    }
    
    /*public Vuelta jugarVuelta(){
    }*/

    public Partido() {
    }

}
