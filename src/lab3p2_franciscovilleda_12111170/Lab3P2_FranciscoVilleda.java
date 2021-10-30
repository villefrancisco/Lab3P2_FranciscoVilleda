
package lab3p2_franciscovilleda_12111170;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3P2_FranciscoVilleda {
    
    static Scanner sc = new Scanner(System.in);
    static Random rng = new Random();
    
    public static void main(String[] args) {
        ArrayList <Gimnasio> gyms = new ArrayList();
        int opcion = 0;
        while(opcion != 5){
            
            opcion = menuGym();
            switch(opcion){
                case 1:
                {
                    Gimnasio gym = datosGym();
                    gyms.add(gym);
                }
                break;
                case 2:
                {
                    System.out.println("Ingrese la posicion que desea modificar: ");
                    int index = sc.nextInt();
                    if(index >= gyms.size()){
                        index = sc.nextInt();
                    }
                    Gimnasio gym = datosGym();
                    gyms.set(index, gym);
                }
                break;
                case 3:
                {
                    for (Gimnasio gym : gyms) {
                        System.out.println("Gimnasio #" + gyms.indexOf(gym));
                        System.out.println(gym);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Ingrese el numero de los dos gimnasios a luchar");
                    boolean ingresado = false;
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    while(!ingresado){
                        if(num1 == num2){
                            System.out.println("Los gim deben ser diferentes");
                            num1 = sc.nextInt();
                            num2 = sc.nextInt();
                        }
                        else if(num1 >= gyms.size() || num2 >= gyms.size()){
                            System.out.println("el indice no se encuentra en la lista");
                            num1 = sc.nextInt();
                            num2 = sc.nextInt();
                        }
                        else{
                            peleas(gyms.get(num1), gyms.get(num2));
                            ingresado = true;
                        }
                    }
                    if(gyms.get(num1).getDinero() == 0){
                        System.out.println("El gimnasio: " + gyms.get(num1).getNombre() +
                                "Esta en bancarrota");
                        bancarrota(gyms.get(num1));
                    }
                    if(gyms.get(num2).getDinero() == 0){
                        System.out.println("El gimnasio: " + gyms.get(num2).getNombre() +
                                "Esta en bancarrota");
                        bancarrota(gyms.get(num2));
                    }
                }
                break;
                case 5:{
                    for (Gimnasio gym : gyms) {
                        if(gym.getDinero() == 0){
                            System.out.println("GIMNASIO EN BANCARROTA");
                        }
                        System.out.println("Gimnasio #" + gyms.indexOf(gym));
                        System.out.println(gym);
                    }
                    break;
                }
            }
        }
        
    }
    
    public static int menuGym(){
        System.out.println("MENU GYM");
        System.out.println("1 - Ingresar Gimnasio");
        System.out.println("2 - Modificar Gimnasio");
        System.out.println("3 - Enlistar Gimnasios");
        System.out.println("4 - Peleas");
        System.out.println("5 - Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }
    
    public static Gimnasio datosGym(){
        System.out.println();
        System.out.println("Ingrese nombre del Gimnasio: ");
        String n = sc.nextLine();
        n = sc.nextLine();
        System.out.println("Ingrese la ciudad del Gimnasio: ");
        String c = sc.nextLine();
        System.out.println("Ingrese los datos del lider: ");
        Maestro m = datosMaestro();
        int d = (1 + rng.nextInt(10))*10000;
        Gimnasio gym = new Gimnasio(n, c, m, 0, 0, d);
        int entrenadores = 1;
        int legendarios = 0;
        int coordinadores = 0;        
        while(entrenadores <= 6){
            System.out.println("AGREGAR ENTRENADORES (" + entrenadores + "/6)");
            System.out.println("1 - Entrenador novato");
            System.out.println("2 - Maestro Pokemon");
            System.out.println("3 - Coordinador Pokemon");
            System.out.println("4 - Entrenador Legendario");
            System.out.println("Ingrese su opcion: ");
            int opcion = sc.nextInt();
            if(opcion == 1){
                Entrenador t = datosNovato();
                gym.getTrainers().add(t);
                entrenadores += 1;
            }
            else if(opcion == 2){
                Entrenador t = datosMaestro();
                gym.getTrainers().add(t);
                entrenadores += 1;
            }
            else if(opcion ==3 && coordinadores < 2){
                Entrenador t = datosCoordinador();
                gym.getTrainers().add(t);
                entrenadores += 1;
                coordinadores += 1;
            }
            else if(opcion == 4 && legendarios < 1){
                Entrenador t = datosLegendario();
                gym.getTrainers().add(t);
                entrenadores += 1;
                legendarios += 1;
            }
        }
        return gym;
    }
    
    public static Maestro datosMaestro(){
        System.out.println("Ingrese nombre del Entrenador: ");
        String n = sc.nextLine();
        n = sc.nextLine();
        System.out.println("Ingrese Sexo del Entrenador: (M/F)");
        String s = sc.nextLine();
        System.out.println("Ingrese Edad del Entrenador: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese numero de victorias: ");
        int win = sc.nextInt();
        System.out.println("Ingrese su pokemon: ");
        Pokemon pok = listaPokemones();
        Maestro trainer = new Maestro(win, pok, n, s, edad);
        return trainer;
    }
    public static Novato datosNovato(){
        System.out.println("Ingrese nombre del Entrenador: ");
        String n = sc.nextLine();
        n = sc.nextLine();
        System.out.println("Ingrese Sexo del Entrenador: (M/F)");
        String s = sc.nextLine();
        System.out.println("Ingrese Edad del Entrenador: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese numero de pokemon descubiertos: ");
        int d = sc.nextInt();
        System.out.println("Ingrese su pokemon: ");
        Pokemon pok = listaPokemones();
        Novato trainer = new Novato(pok, d, n, s, edad);
        return trainer;
    }
    
    public static Coordinador datosCoordinador(){
        System.out.println("Ingrese nombre del Entrenador: ");
        String n = sc.nextLine();
        n = sc.nextLine();
        System.out.println("Ingrese Sexo del Entrenador: (M/F)");
        String s = sc.nextLine();
        System.out.println("Ingrese Edad del Entrenador: ");
        int edad = sc.nextInt();
        Coordinador trainer = new Coordinador(n,s,edad);
        int opcion = 0;
        while(opcion != 2){
            trainer.getPokemones().add(listaPokemones());
            System.out.println("Desea agregar otro pokemon?");
            System.out.println("1 - si");
            System.out.println("2 - no");
            opcion = sc.nextInt();
        }
        return trainer;
    }
    
    public static EntrenadorLegend datosLegendario(){
        System.out.println("Ingrese nombre del Entrenador: ");
        String n = sc.nextLine();
        n = sc.nextLine();
        System.out.println("Ingrese Sexo del Entrenador: (M/F)");
        String s = sc.nextLine();
        System.out.println("Ingrese Edad del Entrenador: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su pokemon: ");
        Legendario pok = listaLegend();
        EntrenadorLegend trainer = new EntrenadorLegend(pok, n, s, edad);
        return trainer;
    }
    
    public static Pokemon listaPokemones(){
        System.out.println("1 - Squirtle / Agua / 200AT / 350HP");
        System.out.println("2 - Piplup / Agua / 180AT / 400HP");
        System.out.println("3 - Psyduck / Agua / 150AT / 450HP");
        System.out.println("4 - Snivy / Planta / 200AT / 350HP");
        System.out.println("5 - Bellsprout / Planta / 180AT / 400HP");
        System.out.println("6 - Bulbasaur / Planta / 150AT / 450HP");
        System.out.println("7 - Litten / Fuego / 200AT / 350HP");
        System.out.println("8 - Charmander / Fuego / 180AT / 400HP");
        System.out.println("9 - Tepig / Fuego / 150AT / 450HP");
        int opcion = sc.nextInt();
        while(opcion < 1 || opcion > 9){
            opcion = sc.nextInt();
        }
        Pokemon p = null;
        switch (opcion) {
            case 1:
                p = new Agua("Squirte", 200, 350);
                break;
            case 2:
                p = new Agua("Piplup", 180, 400);
                break;
            case 3:
                p = new Agua("Psyduck", 150, 450);
                break;
            case 4:
                p = new Planta("Snivy", 200, 350);
                break;
            case 5:
                p = new Planta("Bellsprout", 180, 400);
                break;
            case 6:
                p = new Planta("Bulbasaur", 150, 450);
                break;
            case 7:
                p = new Fuego("Litten", 200, 350);
                break;
            case 8:
                p = new Agua("Charmander", 180, 400);
                break;
            case 9:
                p = new Agua("Tepig", 150, 450);
                break;
            default:
                break;
        }
        return p;    
    }
    
    public static Legendario listaLegend(){
        
        System.out.println("1 - Articuno / Legendario / 200AT / 350HP / 2 vidas");
        System.out.println("2 - Zapdos / Legendario / 180AT / 400HP / 2 vidas");
        System.out.println("3 - Moltes / Legendario / 150AT / 450HP / 2 vidas");
        System.out.println("4 - Mewtwo / Legendario / 250AT / 300 HP / 2 vidas");
        int opcion = sc.nextInt();
        while(opcion < 1 || opcion > 4){
            opcion = sc.nextInt();
        }
        Legendario p = null;
        switch (opcion) {
            case 1:
                p = new Legendario(2, "Articuno", 200, 350);
                break;
            case 2:
                p = new Legendario(2, "Zapdos", 180, 400);
                break;
            case 3:
                p = new Legendario(2, "Moltes", 150, 450);
                break;
            case 4:
                p = new Legendario(2, "Mewtwo", 250, 300);
                break;
            default:
                break;
        }
        return p;
    }
    
    public static void peleas(Gimnasio gym1, Gimnasio gym2){
        if(gym1.getDinero() != 0 && gym2.getDinero() != 0){
            int punt1 = 0;
            int punt2 = 0;
            int turno = 1;
            int i = 0;
            while(punt1 < 4 && punt2 < 4 && i < 6){
                ArrayList<Pokemon> team1 = luchadores(i, gym1);
                ArrayList<Pokemon> team2 = luchadores(i, gym2);
                int pok1 = 0; 
                int pok2 = 0;
                boolean seguir = true;
                while(seguir){
                    if(turno == 1){
                        double vida = team2.get(pok2).getHealth() - ataque(team1.get(pok1), team2.get(pok2));
                        team2.get(pok2).setHealth((int) vida);
                        if(vida < 0){
                            pok2++;
                            if(pok2 >= team2.size()){
                                seguir = false;
                                punt1++;
                                i++;
                            }
                        }
                        turno = 2;
                    }
                    if(turno == 2){
                        double vida = team1.get(pok1).getHealth() - ataque(team2.get(pok2), team1.get(pok1));
                        team1.get(pok1).setHealth((int) vida);
                        if(vida < 0){
                            pok1++;
                            if(pok1 >= team1.size()){
                                seguir = false;
                                punt2++;
                                i++;
                            }
                        }
                        turno = 1;
                    }
                }
            }
            if(punt1 > punt2){
                gym1.setDinero(gym1.getDinero()+10000);
                gym2.setDinero(gym2.getDinero()-10000);
            }
            else if(punt2 > punt1){
                gym2.setDinero(gym2.getDinero()+10000);
                gym1.setDinero(gym1.getDinero()-10000);
            }
        }
        else{
            System.out.println("Uno de los gyms esta en bancarrota");
        }
    }
    
    public static double ataque(Pokemon p, Pokemon q){
        if(p instanceof Agua)
            return ((Agua) p).Atacar(q);
        else if(p instanceof Planta)
            return ((Planta)p).Atacar(q);
        else if(p instanceof Fuego)
            return ((Fuego)p).Atacar(q);
        else if(p instanceof Legendario)
            return ((Legendario)p).Atacar();
        else
            return 0;
    }
    public static ArrayList <Pokemon> luchadores(int i, Gimnasio gym1){
        Entrenador trainer1 = gym1.getTrainers().get(i);
        ArrayList <Pokemon> luchadores = new ArrayList();
        if(gym1.getTrainers().get(i) instanceof Coordinador){
            Coordinador p1 = (Coordinador) gym1.getTrainers().get(i);
            luchadores = p1.getPokemones();
        }
        else if(gym1.getTrainers().get(i) instanceof Novato){
            Novato p1 = (Novato) gym1.getTrainers().get(i);
            luchadores.add(p1.getPokemon());
        }       
        else if(gym1.getTrainers().get(i) instanceof Maestro){
            Maestro p1 = (Maestro) gym1.getTrainers().get(i);
            luchadores.add(p1.getPokemon());
        }
        else if(gym1.getTrainers().get(i) instanceof EntrenadorLegend){
            EntrenadorLegend p1 = (EntrenadorLegend) gym1.getTrainers().get(i);
            luchadores.add(p1.getPokemon());
        }
        return luchadores;
    }
    
    public static void bancarrota(Gimnasio gym){
        if(rng.nextBoolean()){
            gym.setDinero(10000*(1+rng.nextInt(5)));
        }
        else{
            System.out.println("No se pudo dar bono extra");
        }
    }
}
