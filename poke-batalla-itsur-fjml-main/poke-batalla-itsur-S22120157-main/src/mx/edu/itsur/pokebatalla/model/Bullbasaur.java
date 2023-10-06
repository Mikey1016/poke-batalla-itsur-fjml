/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;
import java.util.ArrayList;
/**
 *
 * @author FJML1983
 */
public class Bullbasaur extends Pokemon {

    public Bullbasaur() {
        this.tipo = "PLANTA/VENENO";
        this.hp = 45;
        this.ataque = 49;
        this.defensa = 49;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("LÁTIGO CEPA");
        this.habilidades.add("HOJA AFILADA");
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
       public void atacar(Pokemon oponente, String habilidad){
         if(habilidad.equals("LÁTIGO CEPA")){
            //Logica del daño por atacktrueno
            System.out.println("Realizando LÁTIGO CEPA");
        }else if(habilidad.equals("HOJA AFILADA")){
            //Logica del daño por BOLAVOLTIO
            System.out.println("Realizando HOJA AFILADA");            
        }
        //TODO: otras habilidades...
    }
    
}
