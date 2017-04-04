/*
clase publica Jugador{
    privado cadena nombre;
    privado entero puntos;
    privado Carta carta;
    publico definirCarta(Carta c){
        carta=c;
    }
    publico Carta valorCarta(Carta carta){
        devolver carta;
    }
    publico sumarUnPunto(){
        puntos=valorPuntos()+1;
    }
    publico valorPuntos(){
        devolver puntos;
    }
    publico devuelveCarta(){
        cartasUsadas.agregar(carta);
        carta=nulo;
        devolver carta;
    }
    publico Jugador(cadena n)
        nombre=n;
    }
    publico cadena valorNombre(){
        devolver nombre;
    }
*/

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
    
    public void sumarUnPunto(){
        puntos=getPuntos()+1;
    }

    public int getPuntos() {
        return puntos;
    }
    
    public Carta devuelveCarta(){
        return carta;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
