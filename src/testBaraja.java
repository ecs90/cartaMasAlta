/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocio
 */
public class testBaraja {
    public static void main(String[] args){
        
        Baraja mazo = new Baraja();
        
        boolean control = true;
        
        while(control==true){
            Carta carta = mazo.darCartaDeArriba();
            System.out.println(carta);
            mazo.guardarCartaUsada(carta);
            control = mazo.hayCartas();
        }
        
        mazo.mezclar();
        
        control = true;
        
        while(control==true){
            Carta carta = mazo.darCartaDeArriba();
            System.out.println(carta);
            mazo.guardarCartaUsada(carta);
            control = mazo.hayCartas();
        }
        
    }
}
