
package lab3p2_franciscovilleda_12111170;
public class Legendario extends Pokemon{
    private int vidas;

    public Legendario() {
    }

    public Legendario(int vidas, String nombre, int attack, int health) {
        super(nombre, attack, health);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Legendario{" + "vidas=" + vidas + '}';
    }
    
    public double Atacar(){
        return super.getAttack();
    }
}
