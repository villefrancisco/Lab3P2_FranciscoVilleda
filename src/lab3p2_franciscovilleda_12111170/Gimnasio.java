
package lab3p2_franciscovilleda_12111170;
import java.util.ArrayList;

public class Gimnasio {
    private String nombre, ciudad;
    private Maestro lider;
    private int win, lose, dinero;
    ArrayList<Entrenador> trainers = new ArrayList();

    public Gimnasio() {
    }

    public Gimnasio(String nombre, String ciudad, Maestro lider, int win, int lose, int dinero) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lider = lider;
        this.win = win;
        this.lose = lose;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Maestro getLider() {
        return lider;
    }

    public void setLider(Maestro lider) {
        this.lider = lider;
    }


    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Entrenador> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Entrenador> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCiudad: " + ciudad + "\nLider: " + lider + "\nVictorias: " + win + "\nDerrotas: " + lose + "\n%Victorias: " + winrate() + "\nDinero: " + dinero;
    }

    public double winrate(){
        if(win == 0 && lose == 0){
            return 0;
        }
        else{
            return (win)/(win + lose)*100;
        }
    }
    
    
}
