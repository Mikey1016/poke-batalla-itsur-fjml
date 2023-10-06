/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author JOSE MIGUEL MORALES GONZALEZ
 */
public class Butterfree extends Pokemon{
    public Butterfree() {
        this.tipo = "BICHO/VOLADOR";
        this.hp = 65;
        this.ataque = 45;
        this.defensa = 50;
        this.nivel = 10;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("CONFUSIÓN");
        this.habilidades.add("PSIQUICO");
        //....
    }

    //Constructor alterno 1
    public Butterfree(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("CONFUSIÓN")) {
            System.out.println("Realizando CONFUSIÓN");
            
        } else if (habilidad.equals("PSIQUICO")) { 
            System.out.println("Realizando PSIQUICO");
        }
        //TODO: otras habilidades...
    }

}
