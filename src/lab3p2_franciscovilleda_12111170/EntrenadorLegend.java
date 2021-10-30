
package lab3p2_franciscovilleda_12111170;
public class EntrenadorLegend extends Entrenador{
    private Legendario pokemon;

    public EntrenadorLegend() {
    }

    public EntrenadorLegend(Legendario pokemon, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.pokemon = pokemon;
    }

    public Legendario getPokemon() {
        return pokemon;
    }

    public void setPokemon(Legendario pokemon) {
        this.pokemon = pokemon;
    }
    
    
}
