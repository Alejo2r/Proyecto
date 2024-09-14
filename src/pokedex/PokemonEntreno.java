/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author Admin
 */
public class PokemonEntreno {
    public int vida;
    public int oro;
    public int ataque;
    public int exp;
    
    public PokemonEntreno(){
        
    }


    public PokemonEntreno(int vida,int oro, int ataque, int exp) {
        this.vida = vida;
        this.oro = oro;
        this.ataque = ataque;
        this.exp = exp;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
}
