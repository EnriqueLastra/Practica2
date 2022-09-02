import java.util.List;

public class Linea {
    String nombre;
    List<Autobus> autobuses;
    Integer Parada;
    public Linea(){

    }
    public Linea(String nombre, Integer Parada, List<Autobus>autobuses) {
        this.nombre= nombre;
        this.Parada=Parada;
    }
}
