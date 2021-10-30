
package lab3p2_franciscovilleda_12111170;
import java.util.ArrayList;
public class Coordinador extends Entrenador{
    ArrayList <Pokemon> pokemones = new ArrayList();

    public Coordinador() {
    }

    public Coordinador(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "pokemones=" + pokemones + '}';
    }
    
}
