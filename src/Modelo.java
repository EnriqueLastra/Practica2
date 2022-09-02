import java.util.List;

public class Modelo {
int capacidad;
double consumo;
List<Autobus> autobus;
public Modelo(){
}
 public Modelo(int capacidad, double consumo, List<Autobus> autobus) {
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.autobus = autobus;
    }
}
