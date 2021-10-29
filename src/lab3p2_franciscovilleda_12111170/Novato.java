
package lab3p2_franciscovilleda_12111170;

public class Novato extends Entrenador{
    private Pokemon pokemon;
    private int descubiertos;

    public Novato() {
    }

    public Novato(Pokemon pokemon, int descubiertos, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.pokemon = pokemon;
        this.descubiertos = descubiertos;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public int getDescubiertos() {
        return descubiertos;
    }

    public void setDescubiertos(int descubiertos) {
        this.descubiertos = descubiertos;
    }

    @Override
    public String toString() {
        return "Novato{" + "pokemon=" + pokemon + ", descubiertos=" + descubiertos + '}';
    }
    
    
}
