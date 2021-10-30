
package lab3p2_franciscovilleda_12111170;
import java.util.Random;
public class Planta extends Pokemon{
    Random rng = new Random();

    public Planta() {
    }

    public Planta(String nombre, int attack, int health) {
        super(nombre, attack, health);
    }
    
    public double Atacar(Object p){
        int random = rng.nextInt(5);
        if(random == 0){
            return 0;
        }
        else if(p instanceof Agua){
            return super.getAttack() * 1.35;
        }
        else{
            return super.getAttack();
        }
    }
}
