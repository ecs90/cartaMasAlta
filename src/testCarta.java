
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocio
 */
public class testCarta {
    public static void main(String[] args){
        ArrayList<Carta> mazo = new ArrayList<Carta>();
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("copa",i);
            mazo.add(carta);
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("basto",i);
            mazo.add(carta);
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("oro",i);
            mazo.add(carta);
        }
        for (int i = 1; i < 13; i++) {
            Carta carta = new Carta("espada",i);
            mazo.add(carta);
        }
        for (int i = 0; i < 48; i++) {
            System.out.println(mazo.get(i));
        }
        Collections.shuffle(mazo);
        for (int i = 0; i < 48; i++) {
            System.out.println(mazo.get(i));
        }
    }
}
