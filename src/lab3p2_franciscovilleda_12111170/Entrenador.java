
package lab3p2_franciscovilleda_12111170;
public class Entrenador {
    private String nombre, sexo;
    private int edad;

    public Entrenador() {
    }

    public Entrenador(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
}
