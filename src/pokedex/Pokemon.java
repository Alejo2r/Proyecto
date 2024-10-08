/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author Admin
 */
public class Pokemon {
    public int vida;
    public int ataque;
    public String tipo;
    public String nombre;
    public int nivel;
    public int defensa;
    public int velocidad;
    public Pokemon(){
        
    }

    public Pokemon(int vida, int ataque, String tipo, String nombre, int nivel, int defensa, int velocidad) {
        this.vida = vida;
        this.ataque = ataque;
        this.tipo = tipo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
   public boolean isFainted() {
        return this.vida <= 0;
    } 
}
