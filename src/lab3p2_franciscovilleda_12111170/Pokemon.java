
package lab3p2_franciscovilleda_12111170;
public class Pokemon {
    private String nombre;
    private int attack, health;

    public Pokemon() {
    }

    public Pokemon(String nombre, int attack, int health) {
        this.nombre = nombre;
        this.attack = attack;
        this.health = health;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", attack=" + attack + ", health=" + health + '}';
    }
    
    
}
