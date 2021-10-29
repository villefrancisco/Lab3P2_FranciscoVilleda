
package lab3p2_franciscovilleda_12111170;

public class Maestro extends Entrenador{
    private int win;
    private Pokemon pokemon;

    public Maestro() {
    }

    public Maestro(int win, Pokemon pokemon, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.win = win;
        this.pokemon = pokemon;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "Maestro{" + "win=" + win + ", pokemon=" + pokemon + '}';
    }
    
    
}
