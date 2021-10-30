
package lab3p2_franciscovilleda_12111170;
import java.util.Random;
public class Fuego extends Pokemon{
    Random rng = new Random();

    public Fuego() {
    }

    public Fuego(String nombre, int attack, int health) {
        super(nombre, attack, health);
    }
    
    public double Atacar(Object p){
        int random = rng.nextInt(5);
        if(random == 0){
            return 0;
        }
        else if(p instanceof Planta){
            return super.getAttack() * 1.35;
        }
        else{
            return super.getAttack();
        }
    }
}
