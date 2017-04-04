/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocio
 */
public class testJugador {
    public static void main(String[] args){
        Jugador jugador1 = new Jugador("jonatan");
        Jugador jugador2 = new Jugador("jona");
        Jugador jugador3 = new Jugador("mena");
        Carta carta1 = new Carta("copa", 1);
        Carta carta2 = new Carta("copa", 4);
        Carta carta3 = new Carta("copa", 6);
        System.out.println(jugador1.getNombre());
        System.out.println(jugador2.getNombre());
        System.out.println(jugador3.getNombre());
        System.out.println(jugador1.getPuntos());
        jugador2.sumarUnPunto();
        System.out.println(jugador2.getPuntos());
        System.out.println(jugador3.getPuntos());
        jugador1.setCarta(carta1);
        jugador2.setCarta(carta2);
        jugador3.setCarta(carta3);
        System.out.println(jugador1.getCarta());
        System.out.println(jugador2.getCarta());
        System.out.println(jugador3.getCarta());
    }
}
