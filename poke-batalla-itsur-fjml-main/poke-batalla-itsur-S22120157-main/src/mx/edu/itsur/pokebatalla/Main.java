/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Butterfree;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Exeggcute;
import mx.edu.itsur.pokebatalla.model.Jigglypuff;
import mx.edu.itsur.pokebatalla.model.Pokemon;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PokeBatalla!");

        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander();

        Exeggcute exeggcuteSalvaje = new Exeggcute();
        Butterfree butterfreeSalvaje = new Butterfree();
        Jigglypuff jigglypuffSalvaje = new Jigglypuff();

        Exeggcute exeggcuteEntrenador = new Exeggcute();
        Butterfree butterfreeEntrenador = new Butterfree();
        Jigglypuff jigglypuffEntrenador = new Jigglypuff();

        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("pedro");
        Pikachu miPikachu = pikachuSalvaje;

        miPikachu.atacar(charmanderSalvaje);

        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");

        //batalla

        exeggcuteEntrenador.setNombre("Exeggcute");
        exeggcuteEntrenador.atacar(jigglypuffSalvaje);
        exeggcuteEntrenador.atacar(jigglypuffSalvaje, "BOMBA GERMEN");

        butterfreeEntrenador.setNombre("Butterfree");
        butterfreeEntrenador.atacar(exeggcuteSalvaje);
        butterfreeEntrenador.atacar(exeggcuteSalvaje, "PSIQUICO");

        jigglypuffEntrenador.setNombre(" Jigglypuff");
        jigglypuffEntrenador.atacar(butterfreeSalvaje);
        jigglypuffEntrenador.atacar(butterfreeSalvaje, "DESTRUCTOR");

    }

}
