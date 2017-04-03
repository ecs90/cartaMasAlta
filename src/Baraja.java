import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Baraja {
    private Stack<Carta> cartasEnJuego = new Stack<Carta>();
    private ArrayList<Carta> cartasUsadas = new ArrayList<Carta>();
    
    /*
           mezclar array;
    */
    public void mezclar(){
        Collections.shuffle(cartasUsadas);
        while(!cartasUsadas.isEmpty()){
            cartasEnJuego.push(cartasUsadas.get(0));
            cartasUsadas.remove(0);
        }
    }
    
    /*
        pop pila
    */
    public Carta darCartaDeArriba(){
        return cartasEnJuego.pop();
    }
    
    /*
        guardar carta en array
    */
    public void guardarCartaUsada(Carta carta){
        cartasUsadas.add(carta);
    }
    
    /*
        revisar si hay cartas para repartir
    */
    public boolean hayCartas(){
        return !cartasEnJuego.empty();
    }

    public Baraja() {
        
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("copa",i);
            cartasUsadas.add(carta);
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("basto",i);
            cartasUsadas.add(carta);
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("oro",i);
            cartasUsadas.add(carta);
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("espada",i);
            cartasUsadas.add(carta);
        }
            
        Collections.shuffle(cartasUsadas);
            
        while(!cartasUsadas.isEmpty()){
            cartasEnJuego.push(cartasUsadas.get(0));
            cartasUsadas.remove(0);
        }
    }
}
